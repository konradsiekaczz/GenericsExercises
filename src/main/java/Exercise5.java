import java.util.Arrays;
import java.util.List;

public class Exercise5 {

    static class Singer {
        private final String genreMusic;

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

    private static void displaySinger(List<? extends Singer> singers) {
        for (Singer singer : singers) {
            System.out.println(singer.toString());
        }
    }

    public static void main(String[] args) {
        List<Singer> someSingers = Arrays.asList(
                new Singer("Rcok"),
                new Singer("Blues"));
        displaySinger(someSingers);

        List<ElvisPresley> elvisPresleyList = Arrays.asList(new ElvisPresley());
        displaySinger(elvisPresleyList);
    }
}
