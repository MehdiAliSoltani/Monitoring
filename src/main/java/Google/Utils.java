/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Google;

import Google.ReadGoogleSheet;
import com.mycompany.trywebservice1.Constants;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author mehdi
 */
public class Utils {

    final Logger logger = Logger.getLogger(Utils.class);

    public int extractDigits(final CharSequence input) {
        if (input.equals(null) || input.equals("")) {
            return Constants.NO_VALUE;
        }
        try {
//            String callerClassName = new Exception().getStackTrace()[1].getClassName();
//            String callerMName = new Exception().getStackTrace()[1].getMethodName();
//            int line = new Exception().getStackTrace()[1].getLineNumber();
//            StackTraceElement[] callerClassName = new Exception().getStackTrace()[].;
//            for(StackTraceElement e : callerClassName)
//                System.out.println(callerClassName + "  " + callerMName + "   "+line);

            final StringBuilder sb = new StringBuilder(input.length());
            for (int i = 0; i < input.length(); i++) {
                final char c = input.charAt(i);
                if (c > 47 && c < 58 || c == '.') {
                    sb.append(c);
                }
            }
            return Integer.parseInt(sb.toString());
        } catch (Exception e) {
            logger.error("an error happened when extracting digit ");
            return Constants.ERROR_VALUE;
        }
    }

    /**
     * convert a numerical pattern of string equal to mega bytes for example
     * 12GB becomes 12288MB
     *
     * @param input
     * @return
     */
    public double convertToMBytes(final CharSequence input) {
        if (input.equals(null) || input.equals("")) {
            return Constants.NO_VALUE;
        }
        final StringBuilder sb = new StringBuilder(input.length());
        double number;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            if (c > 47 && c < 58 || c == '.') {
                sb.append(c);
            } else {
                count = i;
                break;
            }
        }
        String unit = input.subSequence(count, input.length()).toString().trim();
        number = Double.parseDouble(sb.toString());
        if (unit.toUpperCase().equals("GB") || unit.toUpperCase().equals("G")) {
            number = number * 1024;
        }
        if (unit.toUpperCase().equals("TB") || unit.toUpperCase().equals("T")) {
            number = number * 1024 * 1024;
        }
        if (unit.toUpperCase().equals("MB") || unit.toUpperCase().equals("M")) {
            return number;
        }

//        System.out.println();
        return number;
    }

    public double convertStringToMbits(final CharSequence input) {
        final StringBuilder sb = new StringBuilder(input.length());
        double number;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            final char c = input.charAt(i);
            if (c > 47 && c < 58 || c == '.') {
                sb.append(c);
            } else {
                count = i;
                break;
            }
        }
        String unit = input.subSequence(count, input.length()).toString().trim();
        number = Double.parseDouble(sb.toString());
        if (unit.toUpperCase().equals("GB") || unit.toUpperCase().equals("G")) {
            number = number * 1024;
        }
        if (unit.toUpperCase().equals("TB") || unit.toUpperCase().equals("T")) {
            number = number * 1024 * 1024;
        }
        if (unit.toUpperCase().equals("MB") || unit.toUpperCase().equals("M")) {
            return number;
        }

//        System.out.println();
        return number;
    }

    public List<String> splitString(final String input, String delimiters) {
        if(input.isEmpty() || input.equals(null))
            return null;
        String[] list = input.split(delimiters, 0);        
        return convertToList(list);
    }

    public String retString(String str) {
        if (str.isEmpty() || str.equals(null)) {
            return null;
        }
        return str;
    }

    private  List<String> convertToList(String[] inputArray) {
        List<String> alist = new ArrayList<String>();
        for (String elm : inputArray) {
            alist.add(elm);
        }
        return alist;
    }

    public static void main(String[] args) {
        Utils u = new Utils();
        System.out.println("" + u.extractDigits("1,000,000"));
//        System.out.println(u.convertStringToMBytes("1GB"));
//        System.out.println(u.convertStringToMBytes("1   tB"));
//        System.out.println(u.convertStringToMBytes("100   Mb"));
//        for (String s : u.splitString("mehdi, ali.soltani")) {
//        for (String s : u.splitString("http://www.yahoo.com/login, mehdi\\ali","[/ \\]")) {
//            System.out.println(s);
//        }
    }
}
