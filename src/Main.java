import com.angel.library.enums.GenderType;
import com.angel.library.enums.MemberCategories;
import com.angel.library.model.Member;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Member x = new Member("123","Gökhan","Şişman", GenderType.MALE, new ArrayList<>(),1, MemberCategories.STUDENT);



    }
}