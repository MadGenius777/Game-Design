/**
 * 
 */
package user;

/**
 * @author Wolfp
 *
 */
public class PhysicalStats {

    public int strength;
    
    public int dexterity;
    
    public int lifeSpan = 960;
    
    public int vitality;
    
    public PhysicalStats(int strength, int dexterity) {
        setStrength(strength);
        setDexterity(dexterity);
    }

    /**
     * @return the strength
     */
    public int getStrength() {
        return strength;
    }

    /**
     * @param strength the strength to set
     */
    public void setStrength(int strength) {
        if(strength < 0)
            throw new IllegalArgumentException("Strength cannot be negative.");
        this.strength = strength;
    }

    /**
     * @return the dexterity
     */
    public int getDexterity() {
        return dexterity;
    }

    /**
     * @param dexterity the dexterity to set
     */
    public void setDexterity(int dexterity) {
        if(dexterity < 0)
            throw new IllegalArgumentException("Dexterity cannot be negative.");
        this.dexterity = dexterity;
    }

    /**
     * @return the lifeSpan
     */
    public int getLifeSpan() {
        return lifeSpan;
    }

    /**
     * @param lifeSpan the lifeSpan to set
     */
    public void setLifeSpan(int lifeSpan) {
        if(lifeSpan < 0)
            throw new IllegalArgumentException("Lifespan cannot be negative.");
        this.lifeSpan = lifeSpan;
    }

    /**
     * @return the vitality
     */
    public int getVitality() {
        return vitality;
    }

    /**
     * @param vitality the vitality to set
     */
    public void setVitality(int vitality) {
        if(vitality < 0)
            throw new IllegalArgumentException("vitality cannot be negative.");
        this.vitality = vitality;
    }
    
    
}
