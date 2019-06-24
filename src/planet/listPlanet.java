package planet;

public enum listPlanet implements Planet {
    SEA {
        @Override
        public void suit() {
            System.out.println("My armor is a water suit.");
        }
    },

    WIND {
        @Override
        public void suit() {
            System.out.println("My armor is a wind armor");
        }
    },
    SUN {
        @Override
        public void suit() {

            System.out.println("My armor is a reflectors");
        }

    };
}
