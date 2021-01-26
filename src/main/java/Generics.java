import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

    }

    static void retroJavaStyle(){
        List strings = new ArrayList();

        strings.add("first");
        strings.add("second");

        strings.add(new Integer(3));

        String string  = (String) strings.get(0);
    }
}
