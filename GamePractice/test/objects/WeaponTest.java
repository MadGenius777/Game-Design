/**
 * 
 */
package objects;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Wolfp
 *
 */
public class WeaponTest {

    @Test
    public void testWeaponConstructor() {
        
        //test valid weapon constructor
        Weapon w1 = new Weapon("Sword", 5, 1, 2, 12, "sword");
        assertEquals("Sword", w1.getName());
        assertEquals("5", "" + w1.getWeight());
        assertEquals("1", "" + w1.getVolume());
        assertEquals("2", "" + w1.getQuantity());
        assertEquals("12", "" + w1.getEquipSlot());
        assertEquals("sword", "" + w1.getWeaponClass());
        assertFalse(w1.isWorn());

    }
    
    @Test
    public void testInvalidWeaponConstructor() {
        
        
        //test a weapon constructor with an invalid name
        try {
            new Weapon("", 1, 1, 1, 1, "sword");
        } catch (IllegalArgumentException e) {
            assertEquals("Item name cannot be blank.", e.getMessage());
        }
        
        //test a weapon constructor with an invalid name
        try {
            new Weapon(null, 1, 1, 1, 1, "sword");
        } catch (IllegalArgumentException e) {
            assertEquals("Item name cannot be null.", e.getMessage());
        }
        
        //test a weapon constructor with an invalid weight
        try {
            new Weapon("Sword", -1, 1, 1, 1, "sword");
        } catch (IllegalArgumentException e) {
            assertEquals("An item cannot have a negative weight.", e.getMessage());
        }
        
        
        //test a weapon constructor with an invalid volume
        try {
            new Weapon("Sword", 1, -1, 1, 1, "sword");
        } catch (IllegalArgumentException e) {
            assertEquals("Item volume cannot be negative.", e.getMessage());
        }
        
        //test a weapon constructor with an invalid quantity
        try {
            new Weapon("Sword", 1, 1, -1, 1 , "sword");
        } catch (IllegalArgumentException e) {
            assertEquals("Item quantity cannot be negative.", e.getMessage());
        }
        
        //test weapon constructor with an invalid equipSlot
        try {
           new Weapon("Sword", 1, 1, 1, -1, "sword");
        } catch (IllegalArgumentException e) {
            assertEquals("Not a valid equipment slot.", e.getMessage());
        }
        //test weapon constructor with an invalid equipSlot
        try {
           new Weapon("Sword", 1, 1, 1, 21, "sword");
        } catch (IllegalArgumentException e) {
            assertEquals("Not a valid equipment slot.", e.getMessage());
        }
        
        
    }
    
    @Test
    public void testSetWorn() {
        Weapon w1 = new Weapon("Sword", 1, 1, 1, 1, "sword");
        
        w1.setIsWorn();
        assertTrue(w1.isWorn());
        w1.setIsWorn();
        assertFalse(w1.isWorn());
    }

}
