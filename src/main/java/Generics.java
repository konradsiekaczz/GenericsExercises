import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {
        retroJavaStyle();
    }

    static void retroJavaStyle() {
        List strings = new ArrayList();

        strings.add("first");
        strings.add("second");

        strings.add(new Integer(3));

        String string = (String) strings.get(0);

        try {

            String anInteger = (String) strings.get(2); //illegal casting, we don't have defined what type we
            // can add to list.
        } catch (ClassCastException e) {
            System.out.println("Illegal casting!");
        }
    }

    static  void  modernJavaStyle(){
        List<String> stringList = new ArrayList<String>();

        stringList.add("first");
        stringList.add("second");

//        stringList.add(new Integer(3));// Compilation error!

        //stringList.add(2); //this is parametrized list, we can't put int in to it.

        String s = stringList.get(0);  //We dont need to cast.
    }
}
