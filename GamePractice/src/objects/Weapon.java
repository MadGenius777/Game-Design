/**
 * 
 */
package objects;

/**
 * Weapon class
 * 
 * @author William Nathan
 *
 */
public class Weapon extends Equipment{

    /** */
    public String weaponClass;
    
    
    
    public Weapon(String name, int weight, int volume, int quantity, int equipSlot, String weaponClass) {
        super(name, weight, volume, quantity, equipSlot);
        this.setWeaponClass(weaponClass);
    }

    public String getWeaponClass() {
        return weaponClass;
    }
    
    public void setWeaponClass(String weaponClass) {
        this.weaponClass = weaponClass;
    }
    
    
}
 