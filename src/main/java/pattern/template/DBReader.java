package pattern.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author : Lin Can
 * @description : 模板模式设计一个数据库连接和读取数据的父类
 * @modified ：By
 * @date : 2018/5/12 15:14
 */
public abstract class DBReader {
    /**
     * 创建连接
     * @return
     */
    protected abstract Connection createConnection() throws SQLException;

    /**
     * 处理数据库返回的结果
     * @param resultSet 数据库返回的结果集合
     * @return
     */
    protected abstract void processResultSet (ResultSet resultSet) throws SQLException;

    /**
     * @author : Lin Can
     * @description : 执行sql语句
     * @dateCreated : 2018/5/12 15:21
     * @Param sql 语句
    * @Param params 参数数组
     * @Return :
     */
    public void executeSQL (String sql,Object...params) {
        Connection conn = null;
        PreparedStatement prepStatement = null;
        ResultSet resultSet = null;
        try{
            conn = this.createConnection();
            prepStatement = conn.prepareStatement(sql);
            for (int i=0;i<params.length;i++) {
                prepStatement.setObject(i+1,params[i]);
            }
            prepStatement.execute();
            resultSet =  prepStatement.getResultSet();
            processResultSet(resultSet);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(resultSet);
            close(prepStatement);
            close(conn);
        }
    }

    /**
     * @author : Lin Can
     * @description : 关闭流
     * @dateCreated : 2018/5/12 15:24
     * @Param closeable
     * @Return :
     */
    private void close (AutoCloseable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
