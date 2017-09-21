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
    
    
    
    public Armor(String name, int weight, int volume, int quantity, int equipSlot, String armorType) {
        super(name, weight, volume, quantity, equipSlot);
        setArmorClass(armorType);
        
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
        if(armorDefense < 0 )
            throw new IllegalArgumentException("Armor defense cannot be negative.");
        this.armorDefense = armorDefense;
    }
    
    public int getArmorDurability() {
        return armorDurability;
    }
    
    public void setArmorDurability(int armorDurability) {
        if(armorDurability < 0 )
            throw new IllegalArgumentException("Armor durability cannot be negative.");
        this.armorDurability = armorDurability;
    }

    
    
    
    
    
    
}
 