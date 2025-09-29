package Items.implimintations.armor;

import Items.interfaces.Armor;

public class NoArm implements Armor {
    @Override
    public int defensePower() {
        return 0;
    }

    @Override
    public String getDescription() {
        return " No armor ";
    }

}
