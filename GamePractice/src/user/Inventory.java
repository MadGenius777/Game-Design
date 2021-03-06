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

    public int volume = 5;
    
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
            addItemToInventory(a);           
        }
        this.resetEquipment();
    }
    
    public boolean equipItem(int invIndex) {
        if(inventory.get(invIndex) == null)
            return false;
        Equipment equip = (Equipment)inventory.get(invIndex);
        if(equip.getQuantity() == 1) {
            inventory.remove(invIndex);
        } else {
            inventory.get(invIndex).setQuantity(equip.getQuantity() - 1);
        }
        equipment[equip.getEquipSlot()] = equip;
        return true;
    }
    
    public void addItemToInventory(Item item) {
        boolean added = false;
        for(Item i : inventory) {
            if(i.getName().equals(item.getName())) {
                i.setQuantity(i.getQuantity()+item.getQuantity());
                added = true;
            }
        }
        if(!added)
            inventory.add(item);
    }
    
    public boolean removeItemAmtFromInventory(Item item, int amt) {
        for(Item i : inventory) {
            if(i.getName().equals(item.getName())) {
                if(i.getQuantity() < amt)
                    throw new IllegalArgumentException("Inventory does not posses that quantity of this item.");
                i.setQuantity(i.getQuantity() - amt);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Removes item from inventory
     * 
     * @param item item to be added
     * @return boolean true if the item could be added
     */
    public boolean removeItemFromInventory(Item item) {
        for(Item i : inventory) {
            if(i.getName().equals(item.getName())) {
                inventory.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Item getItem(String name) {
        for(Item i : inventory) {
            if(i.getName().equals(name)) {
                return i;
            }
        }
        throw new IllegalArgumentException("No such item in the inventory");
    }
    
}
