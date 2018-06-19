package pattern.composite;

import java.io.File;

/**
 * @author : Lin Can
 * @description : 用于测试组合模式在File中的应用
 * @modified ：By
 * @date : 2018/5/28 8:52
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("E:/a");
        print(file,0);
    }

    static void print (File file,int depth) {
        if (file.isDirectory()) {
            File[] files  = file.listFiles();
            if (files != null) {
                for (File childFile : files) {
                    print(childFile,depth+1);
                }
            }
        } else {
            System.out.println(repeatSpace(depth)+file.getName());
        }
    }

    /**
     * @author : Lin Can
     * @description : 添加指定个数的空格
     * @dateCreated : 2018/5/28 8:58
     * @Param count
     * @Return :
     */
    static String repeatSpace (int count) {
        StringBuilder spaceSb = new StringBuilder();
        for (int i=0;i<count;i++) {
            spaceSb.append(" ");
        }
        return spaceSb.toString();
    }
}
