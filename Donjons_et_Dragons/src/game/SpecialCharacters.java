package game;

// import java.lang.String;
// import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class SpecialCharacters {

    public SpecialCharacters() {
        super();
    }

    public void startTest(String carac1, String carac2, String carac3, String carac4, String carac5) throws UnsupportedEncodingException {
        PrintStream w = new PrintStream(System.out, true, "UTF-8");
        // org.apache.commons.lang.StringEscapeUtils.escapeJavaScript("\u002e");  
        //w.println("\ud83d\udd7a");
        w.println(carac1 + carac2 + carac3 + carac4 + carac5);
    }
    
}