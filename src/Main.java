import com.angel.library.enums.GenderType;
import com.angel.library.enums.MemberCategories;
import com.angel.library.model.AsciiArt;
import com.angel.library.model.Member;
import java.awt.*;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        Member x = new Member("123", "Gökhan", "Şişman", GenderType.MALE, new ArrayList<>(), 1, MemberCategories.STUDENT);

        AsciiArt asciiArt = new AsciiArt();
        String text = "ANGEL  LIBRARY  v1.0.1";
        AsciiArt.Settings settings = new AsciiArt.Settings(new Font("SansSerif", Font.PLAIN, 18), text.length() * 30, 30);

        asciiArt.drawString(text, "*", settings);

        System.out.println("\nWelcome to ANGEL LIBRARY v1.0.1");


    }
}