package pattern.composite;

import java.io.File;

/**
 * @author : Lin Can
 * @description :  测试组合模式中的查询文件夹下所有txt(包括子文件夹下的)
 * @modified ：By
 * @date : 2018/5/28 9:30
 */
public class FindTxt {
    public static void main(String[] args) {
        File file = new File("E:/a");
        findTxt(file,0);
    }
    /**
     * @author : Lin Can
     * @description : 查找所有后缀为txt的文件
     * @dateCreated : 2018/5/28 9:45
     * @Param file
    * @Param depth
     * @Return :
     */
    static void findTxt (File file,int depth) {
        if (file.isDirectory()) {
            File[] childrenFile = file.listFiles();
            if (childrenFile != null) {
                for (File childFile : childrenFile) {
                    findTxt(childFile,depth+1);
                }
            }
        } else {
            if (file.getName().endsWith(".txt")) {
                System.out.println(repeatSpace(depth+1)+file.getName());
            }
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
