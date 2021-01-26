public class Exercises2 <T, S>{
    final T filedTypeT;
    final S fieldTypeS;

    public static void main(String[] args) {
        Exercises2<String, Integer> stringExercises2 = new Exercises2("Hello", 2);
    }

    public Exercises2(T filedTypeT, S fieldTypeS) {
        this.filedTypeT = filedTypeT;
        this.fieldTypeS = fieldTypeS;
    }
}
