/**
 * 
 */
package Objects;

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
    
    public Item(String name, int weight) {
        this.setName(name);
        this.setWeight(weight);
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        if(name == null)
            throw new IllegalArgumentException("Item name cannot be null.");
        if(name.equals(""))
            throw new IllegalArgumentException("Item name cannot be empty");
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
    
}
 