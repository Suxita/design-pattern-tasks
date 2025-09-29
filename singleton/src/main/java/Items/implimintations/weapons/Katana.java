package Items.implimintations.weapons;

import Items.interfaces.Weapon;

public class Katana implements Weapon {
    @Override
    public int attackPower() {
        return 20;
    }

    @Override
    public String getDescription() {
        return " sharp katana " ;

    }

}
