package Items.implimintations.weapons;

import Items.interfaces.Weapon;

public class Bow implements Weapon {
    @Override
    public int attackPower() {
        return 12;
    }

    @Override
    public String getDescription() {
        return " wooden bow ";
    }

}
