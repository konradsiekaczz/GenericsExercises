import org.junit.Assert;
import org.junit.Test;

public class Exercise2Test {

    public static void main(String[] args) {
        Exercise2Test exercise2Test = new Exercise2Test();

        exercise2Test.test_exercise2_class_with_two_parametrized_type();
    }

    @Test
    public void test_exercise2_class_with_two_parametrized_type(){
        //arrange
        String type1 = "test value";
        char[] type2 = new char[]{'t', 'e', 's', 't'};
        Exercises2<String, char[]> exercises2 = new Exercises2<String, char[]>(type1, type2);

        //assert
        Assert.assertTrue(exercises2.filedTypeT.equals(type1) && exercises2.fieldTypeS == type2);
    }
}
