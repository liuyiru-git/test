
import com.google.gson.Gson;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 * 根据字典替换输入字符串
 */
public class Test03 {
    public static void main(String[] args) {
        //测试情况1
//        String input = "$temp$ here comes the name $name$";
//        String dictionary = "{\"temp\":\"temporary\",\"name\":\"John Doe\"}";
        //测试情况2
//        String str = "";
//        String dictionary = "";
        //测试情况3
        String str = "$temp$";
        String dictionary = "{\"temp\":\"temporary\"}";
        if(StringUtils.isNoneBlank(str) && StringUtils.isNoneBlank(dictionary)){
            Map<String,String> map = new HashMap<String,String>();
            map = new Gson().fromJson(dictionary,Map.class);
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()){
                Map.Entry<String,String> entry = (Map.Entry<String,String>)it.next();
                if(str.contains("$"+entry.getKey()+"$")){
                    str = str.replace("$"+entry.getKey()+"$",entry.getValue());
                }
            }
        }
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
    }
}
