import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public void checkMultLett (){
        StringBuilder stringB = new StringBuilder();
        Pattern pattern = Pattern.compile("(.)\\1*");
        Matcher m = pattern.matcher("HHeeeeeellooooooo  wwworldddd");
        while (m.find()){
            stringB.append(m.group());
            int num = m.group().length();
            if (num>1) stringB.append(num);
        }
        System.out.println(stringB);
    }

    public void checkFileType (){
        Pattern pattern = Pattern.compile("\\.\\w{2,}$");
        Matcher m = pattern.matcher("ajkfgalvw.4582q.pmd_eawr_da11.jpg");
        while (m.find()){
            System.out.println(m.group());
        }
    }

}
