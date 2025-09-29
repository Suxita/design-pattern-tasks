import Items.implimintations.armor.NoArm;
import Items.implimintations.weapons.Sword;
import Items.interfaces.Armor;
import Items.interfaces.Weapon;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Player {
    private static Player player;
    @Getter
    private final int maxHP;
    @Getter @Setter
    private int HP;
    @Getter
    private Weapon currentWeapon;
    @Getter
    private Armor currentArmor;
    private Player(){
        this.maxHP = 100;
        this.HP = maxHP;
        this.currentWeapon = new Sword();
        this.currentArmor = new NoArm();

    }
    public static Player getPlayer(){
        if (player ==null){
           player= new Player();
        }
        return player;
    }

    public void getNewWeapon(Weapon weapon) {
        this.currentWeapon = weapon;
    }
    public void getNewArmor(Armor armor){
        this.currentArmor = armor;
    }
    public void getStats(){
        log.info("""
        \n
        HP: {}
        WeaponDescription: {}
        WeaponDamage: {}
        ArmorDescription: {}
        ArmorPower: {}
       """,
                getHP(),
                currentWeapon.getDescription(),currentWeapon.attackPower(),
                currentArmor.getDescription(),currentArmor.defensePower());
    }
}
