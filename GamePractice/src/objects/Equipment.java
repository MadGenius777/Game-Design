/**
 * 
 */
package objects;

/**
 * @author Wolfp
 *
 */
public abstract class Equipment extends Item{

    /** the slot that the equipment applies to */
    public int equipSlot;
    /** Describes if the equipment is currently equipped to the character */
    public boolean equipped = false;
    
    
    public Equipment(String name, int weight, int volume, int quantity, int equipSlot) {
        super(name, weight, volume, quantity);
        this.setEquipSlot(equipSlot);
        
        
    }

    public int getEquipSlot() {
        return equipSlot;
    }
    
    public void setEquipSlot(int equipSlot) {
        if(equipSlot < 0 || equipSlot > 20)
            throw new IllegalArgumentException("Not a valid equipment slot.");
        this.equipSlot = equipSlot;
    }

    /**
     * @return the isWorn
     */
    public boolean isWorn() {
        return equipped;
    }

    /**
     * 
     */
    public void setIsWorn() {
        equipped = !equipped;
    }

    

}  
