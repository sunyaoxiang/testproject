package Java8Test.java;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by yaoxiang.sun on 2018/4/27.
 */
public class NashornTest {
    public static void main(String[] args) {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine nashorn = scriptEngineManager.getEngineByName("nashorn");

        String name = "yaoxiang.sun";
        Integer result = null;

        try {
            nashorn.eval("print('adadad " + name + "')");
            result = (Integer) nashorn.eval("10+2");
        } catch (ScriptException scriptErr) {
            scriptErr.printStackTrace();
        }

        System.out.println(result.toString());
    }
}
