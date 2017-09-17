/**
 * 
 */
package Objects;

/**
 * Weapon class
 * 
 * @author William Nathan
 *
 */
public class Weapon extends Equipment{

    /** */
    public String weaponClass;
    
    
    
    public Weapon(String name, int weight, String weaponClass) {
        super(name, weight);
        
    }

    public String getWeaponClass() {
        return weaponClass;
    }
    
    public void setWeaponClass(String weaponClass) {
        this.weaponClass = weaponClass;
    }
    
    
}
 