/**
 * 
 */
package user;

import java.util.ArrayList;

import objects.Equipment;
import objects.Item;

/**
 * @author William Nathan
 *
 */
public class Inventory {

    
    public ArrayList<Item> inventory;
    
    public Equipment[] equipment;
    
    public Inventory() {      
        inventory = new ArrayList<Item>();
        equipment = new Equipment[20];
        
    }
    
    public void resetInventory() {
        inventory = new ArrayList<Item>();
    }
    
    public void resetEquipment() {
        equipment = new Equipment[20];
    }
    
    public void storeAllEquipment() {
        for(Equipment a : equipment) {
            inventory.add(a);            
        }
        this.resetEquipment();
    }
    
    public boolean equipItem(int invIndex) {
        if(inventory.get(invIndex) == null)
            return false;
        Equipment equip = (Equipment)inventory.get(invIndex);
        equipment[equip.getEquipSlot()] = equip;
        return true;
    }
    
}
