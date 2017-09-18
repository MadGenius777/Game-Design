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
    public boolean isWorn;
    
    
    public Equipment(String name, int weight, int volume, int quantity, int equipSlot) {
        super(name, weight, volume, quantity);
        this.setEquipSlot(equipSlot);
        this.setIsWorn(false);
        
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
    public boolean getIsWorn() {
        return isWorn;
    }

    /**
     * @param isWorn the isWorn to set
     */
    public void setIsWorn(boolean isWorn) {
        this.isWorn = isWorn;
    }

    

}  
