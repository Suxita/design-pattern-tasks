package Items.implimintations.armor;

import Items.interfaces.Armor;

public class LeatherArm implements Armor {
    @Override
    public int defensePower() {
        return 3;
    }

    @Override
    public String getDescription() {
        return " leather armor " ;
    }

}
