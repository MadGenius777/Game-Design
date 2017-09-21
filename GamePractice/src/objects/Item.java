/**
 * 
 */
package objects;

/**
 * @author Wolfp
 *
 */
public abstract class Item {

    
    /** name of item */
    public String name;
    
    /** id of item */
    public String id;
    
    /** weight of item */
    public int weight;
    
    /** volume of the item*/
    public int volume;
    
    /** quantity of the item*/
    public int quantity;
    
    public Item(String name, int weight, int volume, int quantity) {
        setName(name);
        setWeight(weight);
        setVolume(volume);
        setQuantity(quantity);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if(name == null)
            throw new IllegalArgumentException("Item name cannot be null.");
        if(name.equals(""))
            throw new IllegalArgumentException("Item name cannot be blank.");
        this.name = name;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        if(weight < 0)
            throw new IllegalArgumentException("An item cannot have a negative weight.");
        this.weight = weight;
    }
    
    public int getVolume() {
        return volume;
    }
    
    public void setVolume(int volume) {
        if(volume < 0 )
            throw new IllegalArgumentException("Item volume cannot be negative.");
        this.volume = volume;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int newQuantity) {
        if(newQuantity < 0)
            throw new IllegalArgumentException("Item quantity cannot be negative.");
        quantity = newQuantity;
    }
}
 