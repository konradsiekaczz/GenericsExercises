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

    static class ElvisPresley extends Exercise4.Singer {

        public ElvisPresley() {
            super("Rock 'n' Roll");
        }
    }
}
