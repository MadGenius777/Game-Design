/**
 * 
 */
package user;
import objects.Armor;
import objects.Item;
import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author William Nathan
 *
 */
public class PlayerTest {

    @Test
    public void testPlayerConstructor() {
        
        //testing valid player constructor
        Player p1 = new Player("Ashur", "Drake", null, null, null, null, 0, 0);
        
        assertEquals("Ashur", p1.getFirstName());
        assertEquals("Drake", p1.getLastName());
        assertEquals("Ashur Drake", p1.getFullName());
        
        
        try {
            new Player("", "Drake", null, null, null, null, 0, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be empty", e.getMessage());
        }
        
        try {
            new Player(null, "Drake", null, null, null, null, 0, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null", e.getMessage());
        }
        
        try {
            new Player("Ashur", "", null, null, null, null, 0, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be empty", e.getMessage());
        }
        
        try {
            new Player("Ashur", null, null, null, null, null, 0, 0);
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null", e.getMessage());
        }
     
    }
    
    
    @Test
    public void testInventoryManagement() {
        Item i = new Armor("Helmet", 4, 1, 4, 1, "head");
        Player p1 = new Player("Ashur", "Drake", null, null, null, null, 0, 0);
        
        p1.addItem(i);
        assertTrue(p1.removeItem(i));
        p1.addItem(i);
        assertTrue(p1.removeItemAmt(i, 2));
        assertEquals(2, p1.getItemFromInventory(i.getName()).getQuantity());
        
        try {
            p1.removeItemAmt(i, 4);
        } catch (IllegalArgumentException e) {
            assertEquals("Inventory does not posses that quantity of this item.", e.getMessage());
        }
        p1.removeItem(i);
        assertFalse(p1.removeItem(i));
        assertFalse(p1.removeItemAmt(i, 1));
        
    }

}
