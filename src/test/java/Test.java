

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {


    public static void main(String[] args) throws Exception
    {
        ArrayList<String> arrayList = new ArrayList<>();

        String s =" Иванов Иван Иванович 31 12 1950";
        Pattern p = Pattern.compile("\\d+");
        Matcher matcher = p.matcher(s);
        while (matcher.find()) {
            int start=matcher.start();
            int end=matcher.end();

            System.out.print( s.substring(start,end));
            System.out.println(arrayList.add(s.substring(start,end)));

        }
        //System.out.println("s="+arrayList.toString());
        String date = arrayList.get(1);
        Date mydate = new SimpleDateFormat("d M y", Locale.ENGLISH).parse(date);
      /*  String[] date = s.split("\\d*");*/




    }


}
