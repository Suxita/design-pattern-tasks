import Items.implimintations.armor.IronArm;
import Items.implimintations.weapons.Bow;
import Items.interfaces.Armor;

public class DemoGame {
    public static void main(String[] args) {
        Player player=Player.getPlayer();
        player.getStats();
        player.getNewArmor(new IronArm());
        player.getNewWeapon(new Bow());
        player.getStats();
    }
}
