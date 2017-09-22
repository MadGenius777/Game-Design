/**
 * 
 */
package objects;

import java.util.Scanner;

/**
 * @author Wolfp
 *
 */
public class Attribute {

    public String[] attribute = new String[3];
 
    
    public String[] opposingAtr = new String[3];
    public String supplementaryAtr;
    public String elemental = "fire water wind earth";
    public String nature;
    
    
    
    public final String[] attributes = {"non-atr", "fire", "water", "wind", "earth", "lightning", "wood", "metal"
            , "space-time", "demonic", "celestial", "life", "death"};
    
    public final String[] suppAttributes = {"none", "lightning", "chaos", "fire", "water", "celestial", "life", ""
            , "none", "death", elemental, "wood", "demonic"};
    
    public final String[] oppAttributes = {"none", "water", "earth", "water", "fire", "wood", "metal", "time"
            , "none", "lightning", "demonic", "death", "life"};
    
    
    public Attribute(String attributes, String nature) {
        setAttributes(attributes);
        setOpposingAtr();
    }

    
    
    /**
     * @param attributes the attributes to set
     */
    public void setAttributes(String attributes) {
        if(attributes == null || attributes.equals("")) 
            throw new IllegalArgumentException("Attribute cannot be blank or null."); 
        Scanner attributeScanner = new Scanner(attributes);
        while(attributeScanner.hasNext()) {
            String atr = attributeScanner.next();  
            for(int i = 0; i < this.attributes.length; i++) {
                boolean assigned = false;
                for(String a : this.attributes) {
                    if(atr.equals(a)) {
                        this.attributes[i] = a; 
                        assigned = true;
                    }
                }
                if(!assigned) {
                    attributeScanner.close();
                    throw new IllegalArgumentException("This attribute doesn't exsist");
                }
            }
        }
        attributeScanner.close();
    }

    /**
     * @return the opposingAtr
     */
    public String[] getOpposingAtr() {
        return opposingAtr;
    }

    /**
     * @param opposingAtr the opposingAtr to set
     */
    public void setOpposingAtr() {
        for(int i = 0; i < attribute.length; i ++) {
            for(int j = 0; j < attributes.length; j++) {
                if(attribute[i].equals(attributes[j]))
                    opposingAtr[i] = oppAttributes[j];
            }
        }
    }

    /**
     * @return the supplementaryAtr
     */
    public String getSupplementaryAtr() {
        return supplementaryAtr;
    }

    /**
     * @param supplementaryAtr the supplementaryAtr to set
     */
    public void setSupplementaryAtr(String supplementaryAtr) {
        for(int i = 0; i < attribute.length; i ++) {
            for(int j = 0; j < attributes.length; j++) {
                if(attribute[i].equals(attributes[j]))
                    opposingAtr[i] = suppAttributes[j];
            }
        }
        this.supplementaryAtr = supplementaryAtr;
    }

    /**
     * @return the nature
     */
    public String getNature() {
        return nature;
    }

    /**
     * @param nature the nature to set
     */
    public void setNature(String nature) {
        if(nature == null || nature.equals(""))
            throw new IllegalArgumentException("Invalid nature");
        this.nature = nature;
    }

   
    
}
