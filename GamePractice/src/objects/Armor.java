/**
 * 
 */
package objects;

/**
 * Armor class
 * 
 * @author William Nathan
 *
 */
public class Armor extends Equipment{

    
    /**     */
    public String armorClass;
    /**     */
    public int armorDefense;
    /**     */
    public int armorDurability;
    
    
    
    public Armor(String name, int weight, int volume, int amorType, int equipSlot) {
        super(name, weight, volume, equipSlot);
        
    }

    public String getArmorClass() {
        return armorClass;
    }
    
    public void setArmorClass(String armorClass) {
        this.armorClass = armorClass;
    }
    
    public int getArmorDefense() {
        return armorDefense;
    }
    
    public void setArmorDefense(int armorDefense) {
        this.armorDefense = armorDefense;
    }
    
    public int getAmorDurability() {
        return armorDurability;
    }
    
    public void setArmorDurability(int armorDurability) {
        this.armorDurability = armorDurability;
    }

    
    
    
    
    
    
}
 