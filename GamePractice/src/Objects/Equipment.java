/**
 * 
 */
package Objects;

/**
 * @author Wolfp
 *
 */
public abstract class Equipment extends Item{

    /** */
    public int equipSlot;
    
    public Equipment(String name, int weight, int equipSlot) {
        super(name, weight);
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

    

}  
