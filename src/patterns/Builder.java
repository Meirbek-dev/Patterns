package patterns;

class Wizard {

    private String name;
    private int age;
    private int magicPower;
    private boolean fireMagic;
    private boolean airMagic;
    private boolean earthMagic;
    private boolean waterMagic;

    public static class Builder {

        private final Wizard wizard;

        public Builder() {
            wizard = new Wizard();
        }

        public Builder withName(String name) {
            wizard.name = name;
            return this;
        }

        public Builder withAge(int age) {
            wizard.age = age;
            return this;
        }

        public Builder withMagicPower(int magicPower) {
            wizard.magicPower = magicPower;
            return this;
        }

        public Builder withFireMagic(boolean fireMagic) {
            wizard.fireMagic = fireMagic;
            return this;
        }

        public Builder withWaterMagic(boolean waterMagic) {
            wizard.waterMagic = waterMagic;
            return this;
        }

        public Builder withEarthMagic(boolean earthMagic) {
            wizard.earthMagic = earthMagic;
            return this;
        }

        public Builder withAirMagic(boolean airMagic) {
            wizard.airMagic = airMagic;
            return this;
        }

        public Wizard build() {
            return wizard;
        }
    }

    @Override
    public String toString() {
        return "Колдун\nИмя: " + name + "\nВозраст: " + age + "\nМагическая сила: " + magicPower + "\nЗнает магию огня: " + fireMagic + "\nЗнает магию воды: " + waterMagic + "\nЗнает магию земли: " + earthMagic + "\nЗнает магию воздуха: " + airMagic;
    }

}

public class Builder {

    public static void main(String[] args) {
        Wizard myWizard = new Wizard.Builder()
                .withName("Гендальф")
                .withAge(99)
                .withMagicPower(948)
                .withFireMagic(true)
                .withAirMagic(true)
                .withWaterMagic(false)
                .withEarthMagic(true)
                .build();
        System.out.println(myWizard);
    }
}
