import org.junit.Assert;
import org.junit.Test;

public class Exercise2Test {
    
    @Test
    public void should_return_true_for_type_of_field_in_generic_class_and_type_of_parameter_pass_into_constructor() {
        //arrange
        String type1 = "test value";
        char[] type2 = new char[]{'t', 'e', 's', 't'};
        Exercises2<String, char[]> exercises2 = new Exercises2<String, char[]>(type1, type2);

        //assert
        Assert.assertTrue(exercises2.filedTypeT.equals(type1) && exercises2.fieldTypeS == type2);
    }

    @Test
    public void should_return_true_for_type_of_field_in_generic_class_and_type_of_parameter_pass_into_constructor3() {
        //arrange
        Integer integer = 2;
        Object object = new Object();
        Exercises2<Integer, Object> exercises2 = new Exercises2<Integer, Object>(integer, object);

        //assert
        Assert.assertTrue(exercises2.filedTypeT.equals(integer) && exercises2.fieldTypeS == object);
    }

    @Test
    public void should_return_true_for_type_of_field_in_generic_class_and_type_of_parameter_pass_into_constructor2() {
        //arrange
        float num = 2.2f;
        Thread currentThread = Thread.currentThread();
        Exercises2<Float, Thread> exercises2 = new Exercises2<Float, Thread>(num, currentThread);

        //assert
        Assert.assertTrue(exercises2.filedTypeT.equals(num) && exercises2.fieldTypeS == currentThread);
    }
}
