/**
 * 
 */
package user;

import objects.Item;

/**
 * @author William Nathan
 *
 */
public class Player {

    
    public SoulStats soul;
    public PhysicalStats body;
    public Inventory inventory;
    
    
    
    public String firstName;
    public String lastName;
    
    
    public Player(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
        soul = new SoulStats("Red", "Attribute-less", "Non-Cohesive");
        body = new PhysicalStats(5, 14);
        
    }
    
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void addItem(Item item) {
        inventory.addItemToInventory(item)            
    }
    public boolean removeItemAmt(Item item, int amt) {
        if(inventory.removeItemAmtFromInventory(item, amt))
            return true;
        return false;
    }
    public boolean removeItem(Item item) {
        if(inventory.removeItemFromInventory(item))
            return true;
        return false;
    }
    
    
    
    
}
 