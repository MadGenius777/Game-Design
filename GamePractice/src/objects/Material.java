/**
 * 
 */
package objects;

/**
 * @author William Nathan
 *
 */
public abstract class Material extends Item{


    public String materialType;
    public Attribute attribute;
    public String stateOfMatter;
    
    
    
    public Material(String name, int weight, int volume, int quantity, String materialType) {
        super(name, weight, volume, quantity);
        setMaterialType(materialType);
    }
   
    
    /**
     * Setter for the material type
     * 
     * @param materialType
     */
    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }
    
    /**
     * Getter method for material type
     * 
     * @return String the material type
     */
    public String getMaterialType() {
        return materialType;
    }
}
