/**
 * 
 */
package user;

import objects.Attribute;
import objects.Item;

/**
 * @author William Nathan
 *
 */
public class Player {

    
    /** The SoulStats of a Player */
    public SoulStats soul;
    /** The PhysicalStats of a Player */
    public PhysicalStats body;
    /** The inventory of a Player */
    public Inventory inventory;
    
    
    
    /**  Player's first name */
    public String firstName;
    /**  Player's last name  */
    public String lastName;
    
    
    /**
     * @param firstName
     * @param lastName
     */
    public Player(String firstName, String lastName, String soulRealm, String soulForm
            , String soulAttribute, String soulNature, int strength, int dexterity) {
        setFirstName(firstName);
        setLastName(lastName);
        Attribute soulAtr = new Attribute(soulAttribute, soulNature);
        soul = new SoulStats(soulRealm, soulAtr, soulForm);
        body = new PhysicalStats(strength, dexterity);
        inventory = new Inventory();
        
    }
    
    /**
     * Getter method for firstName
     * 
     * @return String player's first name
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Getter method for lastName
     * 
     * @return String player's last name
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Getter method for full name
     * 
     * @return String player's full name
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
    
    /**
     * Setter method for firstName
     * 
     * @param firstName player's first name
     */
    public void setFirstName(String firstName) {
        if(firstName == null)
            throw new IllegalArgumentException("Name cannot be null");
        if(firstName.equals(""))
            throw new IllegalArgumentException("Name cannot be empty");
        this.firstName = firstName;
    }
    /**
     * Setter method for lastName
     * 
     * @param lastName player's last name
     */
    public void setLastName(String lastName) {
        if(lastName == null)
            throw new IllegalArgumentException("Name cannot be null");
        if(lastName.equals(""))
            throw new IllegalArgumentException("Name cannot be empty");
        this.lastName = lastName;
    }
    
    /**
     * Adds item to the player's inventory
     * 
     * @param item item to inventory
     */
    public void addItem(Item item) {
        inventory.addItemToInventory(item);            
    }
    /**
     * Removes some amount of an item from the player's inventory
     *  
     * @param item item to be removed
     * @param amt amount of the item to be removed
     * @return boolean true if the amount could be removed 
     */
    public boolean removeItemAmt(Item item, int amt) {
        if(inventory.removeItemAmtFromInventory(item, amt))
            return true;
        return false;
    }
    /**
     * Removes all of an item from the player's inventory
     * 
     * @param item item to be removed
     * @return boolean true if the item was removed
     */
    public boolean removeItem(Item item) {
        if(inventory.removeItemFromInventory(item))
            return true;
        return false;
    }
    
    
    public Item getItemFromInventory(String name) {
        return inventory.getItem(name);
    }
    
}
 