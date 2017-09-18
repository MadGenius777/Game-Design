/**
 * 
 */
package user;

import java.util.ArrayList;

import objects.Item;

/**
 * @author William Nathan
 *
 */
public class Inventory {

    
    public ArrayList<Item> inventory;
    
    public Inventory() {      
        inventory = new ArrayList<Item>();
    }
    
    public void resetInventory() {
        inventory = new ArrayList<Item>();
    }
    
    
    
}
