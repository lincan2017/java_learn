package pattern.template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author : Lin Can
 * @description : 模板模式的应用
 * @modified ：By
 * @date : 2018/5/12 15:39
 */
public class DBReaderImpl extends DBReader {
    @Override
    protected Connection createConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String url = "jdbc:mysql://localhost:3306/study?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT";
        return DriverManager.getConnection(url,"root","root");
    }

    /**
     * @author : Lin Can
     * @description : 处理结果集
     * @dateCreated : 2018/5/12 15:41
     * @Param resultSet
     * @Return :
     */
    @Override
    protected void processResultSet(ResultSet resultSet) throws SQLException {
        if (resultSet == null) {
            return;
        }
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1)+":"+resultSet.getString("username"));
        }
    }

}
