import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Exercise5 {

    static class Singer {
        private String genreMusic;

        public Singer(String genreMusic) {
            this.genreMusic = genreMusic;
        }

        @Override
        public String toString() {
            return "Singer{" +
                    "genreMusic='" + genreMusic + '\'' +
                    '}';
        }
    }

    static class ElvisPresley extends Singer {

        public ElvisPresley() {
            super("Rock 'n' Roll");
        }
    }

    private static void doSomethingWithSinger(List<? extends Singer> singers, Consumer<? super Singer> consumer) {
        for (Singer singer : singers) {
            consumer.accept(singer);
        }
    }

    public static void main(String[] args) {
        Consumer<Singer> changeToPopStar = singer -> singer.genreMusic = "KPop";
        List<Singer> singers = Arrays.asList(new ElvisPresley());
        doSomethingWithSinger(singers, changeToPopStar);
        System.out.println(singers.get(0).genreMusic);

        Consumer<Object> print = System.out::print;
        doSomethingWithSinger(singers, print);
    }
}
