package Items.implimintations.armor;

import Items.interfaces.Armor;
import lombok.Getter;

public class IronArm implements Armor {

    @Override
    public int defensePower() {
        return 8;
    }

    @Override
    public String getDescription() {
        return " iron armor ";
    }

}
