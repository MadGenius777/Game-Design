/**
 * 
 */
package objects;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author William Nathan
 *
 */
public class ArmorTest {

    @Test
    public void testArmorConstructor() {
        //test valid Constructor for Armor
        Armor a1 = new Armor("Helmet", 1, 4, 1, 4, "head");
        assertEquals("Helmet", a1.getName());
        assertEquals(1, a1.getWeight());
        assertEquals(4, a1.getVolume());
        assertEquals(1, a1.getQuantity());
        assertEquals(4, a1.getEquipSlot());
        assertEquals("head", a1.getArmorClass());
        
        
    }
    
    @Test
    public void testSetArmorDefense() {
        Armor a1 = new Armor("Helmet", 1, 4, 1, 4, "head");
        
        //testing valid armor defense value
        a1.setArmorDefense(12);
        assertEquals(12, a1.getArmorDefense());
        
        //testing invalid armor defense value
        try {
            a1.setArmorDefense(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("Armor defense cannot be negative.", e.getMessage());
        }
    }
    
    @Test
    public void testSetArmorDurability() {
        Armor a1 = new Armor("Helmet", 1, 4, 1, 4, "head");
        
        //testing valid armor durability value
        a1.setArmorDurability(12);
        assertEquals(12, a1.getArmorDurability());
        
        //testing invalid armor durability value
        try {
            a1.setArmorDurability(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("Armor durability cannot be negative.", e.getMessage());
        }
    }

}
