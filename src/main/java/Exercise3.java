public class Exercise3 {

    interface Clonable<T extends Clonable>{
        T clone();
    }

    static class Singer {
    }

    static class ElvisPresley extends Singer implements Clonable<ElvisPresley>{

        @Override
        public ElvisPresley clone() {
            return new ElvisPresley();
        }

        @Override
        public String toString() {
            return "Elvis Presley";
        }
    }

    public static void main(String[] args) {
        System.out.println(cloneSinger(new ElvisPresley()));
    }

    private static <T extends Singer & Clonable> Clonable cloneSinger(T clonable){
        return clonable.clone();
    }

    private static <T> T returnT(T t){
        System.out.println(t);
        return t;
    }


}
