package mathematics.console;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Writer {

    public void writeStr(String str){
        System.out.println(str);
    }

    public void writeMapDoubleDouble(String column1, String column2, Map<Double, Double> map){
        Set<Double> keys = new TreeSet<>(map.keySet());

        var fullLen = 7 + column1.length() + column2.length();

        var titleLeftIndentValue = " ";
        var titleRightIndentValue = " ";

        var indentKey = "";
        var leftIndentValue = "";

        var standartLeftIndentValue = " ";
        var standartRightIndentValue = " ";


        if(column1.length() > 6){
            standartLeftIndentValue = " ".repeat(column1.length() - 5);
        }else {
            titleLeftIndentValue = " ".repeat(7 - column1.length());
        }

        if(column2.length() > 6){
            standartRightIndentValue = " ".repeat(column2.length() - 4);
        }else {
            titleRightIndentValue = " ".repeat(6 - column2.length());

            fullLen += 2;
        }


        System.out.println("=".repeat(fullLen));

        System.out.printf("|%s%s | %s%s|%n",titleLeftIndentValue, column1, column2, titleRightIndentValue);

        for (Double key : keys) {
            indentKey = setIndentKey(key);
            leftIndentValue = setLeftIndentValue(map.get(key));

            System.out.printf("|%s%s%3.2f |%s %1.2f%s|\n", standartLeftIndentValue, indentKey, key, leftIndentValue, map.get(key), standartRightIndentValue);
        }

        System.out.println("=".repeat(fullLen));
    }

    private String setIndentKey(double key){
        if(key < 10){
            return  "  ";
        } else if(key < 100){
            return  " ";
        } else {
            return  "";
        }
    }

    private String setLeftIndentValue(double value){
        if(value < 0){
            return  "";
        } else {
            return  " ";
        }
    }

}
