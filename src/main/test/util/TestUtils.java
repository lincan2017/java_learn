package util;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author : Lin Can
 * @date : 2019/1/23 14:26
 */
public class TestUtils {
    @Test
    public void test1 () throws IOException {
        File file = new File("D:\\User\\Desktop\\kuohao.txt");

        List<String> strings = FileUtils.readLines(file, StandardCharsets.UTF_8);

        List<String> result = new ArrayList<>();
        for (String str : strings) {
            if (StringUtils.isBlank(str)) {
                continue;
            }
            addStr(result,"("+str+")");
        }
        for (String str : strings) {
            if (StringUtils.isBlank(str)) {
                continue;
            }

            addStr(result,"()"+str);
        }
        for (String str : strings) {
            if (StringUtils.isBlank(str)) {
                continue;
            }

            addStr(result,str + "()");
        }


        for (String str : result) {
            System.out.println(str);
        }
    }

    private void addStr(List<String> list, String s) {

        if (list.contains(s)) {
            list.add(s + "-");
        } else {
            list.add(s);
        }
    }

    @Test
    public void test2 () throws IOException {
        File file = new File("D:\\User\\Desktop\\kuohao.txt");

        List<String> strings = FileUtils.readLines(file, StandardCharsets.UTF_8);

        System.out.println(new HashSet<>(strings).size());

    }
}
