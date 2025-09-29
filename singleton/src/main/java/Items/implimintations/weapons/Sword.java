package Items.implimintations.weapons;

import Items.interfaces.Weapon;

public class Sword implements Weapon {

    @Override
    public int attackPower() {
        return 15;
    }

    @Override
    public String getDescription() {
        return " iron sword ";
    }


}
