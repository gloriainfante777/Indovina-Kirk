import characters.Tratti;

    public class Question {

        private final String testo;
        private final Tratti trattiAssociato;

        public Question(String testo, Tratti trattiAssociato) {
            this.testo = testo;
            this.trattiAssociato = trattiAssociato;
        }

        public String getTesto() {
            return testo;
        }

        public Tratti getTrattiAssociato() {
            return trattiAssociato;
        }

        @Override
        public String toString() {
            return testo;
        }
    }

