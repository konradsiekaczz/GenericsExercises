public class Exercises2<T, S> {
    final T filedTypeT;
    final S fieldTypeS;

    public static void main(String[] args) {
        Exercises2<String, Integer> stringExercises2 = new Exercises2("Hello", 2);
    }

    public Exercises2(T filedTypeT, S fieldTypeS) {
        this.filedTypeT = filedTypeT;
        this.fieldTypeS = fieldTypeS;
//        T[] array = new T[10]; // we can't create array of generic type Compilation error!
    }
}

/*Convenction of name's:
E - Element
K - Key
N - Number
T - Type
V - Value
S, U, V etc. - second, third etc. element after 'T'.

Compile time interested about generics type, in runt time they are deleting.
 */


