package pattern.interpreter;

import org.apache.commons.io.FileUtils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.IOException;

/**
 * @author : Lin Can
 * @description : 工资公式解析
 * @modified ：By
 * @date : 2018/5/17 8:56
 */
public class CalcSalary {
    public static void main(String[] args) {
        //获取javaScript引擎
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        //ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("nashorn");
        //设置脚本中的变量代表的值
        scriptEngine.put("基本工资",5000);
        scriptEngine.put("招生人数",1);
        scriptEngine.put("迟到天数",5);
        scriptEngine.put("console",new Console());

        //读取文本的内容
        try {
            String js = FileUtils.readFileToString(new File("E:/a/galary.txt"),"UTF-8");
            scriptEngine.eval(js);
            Object galary = scriptEngine.get("工资");
            System.out.println("工资为："+galary);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }
    //----------------------心得-------------------------------
    /**
     * 用解析器 模式 解析脚本，可以把可变的内容在脚本
     */
}
