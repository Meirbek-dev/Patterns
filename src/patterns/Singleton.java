package patterns;

final class Rogue {

    private static Rogue instance = null;
    private boolean weapon;

    private Rogue() {
    }

    public boolean getWeapon() {
        return weapon;
    }

    public String setWeapon(boolean weapon) {
        if (this.weapon == true) {
            System.out.println("У разбойника есть оружие");
        } else {
            System.out.println("Разбойник без оружия!");
        }
        return null;
    }

    public static synchronized Rogue getInstance() {
        if (instance == null) {
            instance = new Rogue();
        }
        return instance;
    }
}

public class Singleton {

    public static void main(String[] args) {
        System.out.println("Проверка разбойника на наличие оружия:");
        System.out.println(Rogue.getInstance().getWeapon());
        Rogue.getInstance().setWeapon(false);
    }
}
