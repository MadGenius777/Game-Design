/**
 * 
 */
package User;

/**
 * @author William Nathan
 *
 */
public class SoulStats {

    
    public String soulRealm;
    
    public String soulType;
    
    public String soulAttribute;
    
    public String soulForm;
    
    public int soulDensity;
    
    public int soulVitality;
    
    public int soulVolume;
    
    public SoulStats(String soulType, String soulAttribute, String soulForm) {
        this.setSoulType(soulType);
        this.setSoulAttribute(soulAttribute);
        this.setSoulForm(soulForm);
        
    }

    /**
     * @return the soulRealm
     */
    public String getSoulRealm() {
        return soulRealm;
    }

    /**
     * @param soulRealm the soulRealm to set
     */
    public void setSoulRealm(String soulRealm) {
        if(soulRealm == null)
            throw new IllegalArgumentException("SoulRealm cannot be null");
        if(soulRealm.equals(""))
            throw new IllegalArgumentException("SoulRealm cannot be empty");
        
        this.soulRealm = soulRealm;
    }

    /**
     * @return the soulType
     */
    public String getSoulType() {
        return soulType;
    }

    /**
     * @param soulType the soulType to set
     */
    public void setSoulType(String soulType) {
        if(soulType == null)
            throw new IllegalArgumentException("SoulType cannot be null");
        if(soulType.equals(""))
            throw new IllegalArgumentException("SoulType cannot be empty");
        
        this.soulType = soulType;
    }

    /**
     * @return the soulAttribute
     */
    public String getSoulAttribute() {
        return soulAttribute;
    }

    /**
     * @param soulAttribute the soulAttribute to set
     */
    public void setSoulAttribute(String soulAttribute) {
        if(soulAttribute == null)
            throw new IllegalArgumentException("soulAttribute cannot be null");
        if(soulAttribute.equals(""))
            throw new IllegalArgumentException("soulAttribute cannot be empty");
        
        this.soulAttribute = soulAttribute;
    }

    /**
     * @return the soulForm
     */
    public String getSoulForm() {
        return soulForm;
    }

    /**
     * @param soulForm the soulForm to set
     */
    public void setSoulForm(String soulForm) {
        if(soulForm == null)
            throw new IllegalArgumentException("soulForm cannot be null");
        if(soulForm.equals(""))
            throw new IllegalArgumentException("soulForm cannot be empty");
        
        this.soulForm = soulForm;
    }

    /**
     * @return the soulDensity
     */
    public int getSoulDensity() {
        return soulDensity;
    }

    /**
     * @param soulDensity the soulDensity to set
     */
    public void setSoulDensity(int soulDensity) {
        if(soulDensity <= 0)
            throw new IllegalArgumentException("Soul density cannot be zero or less");
                
        this.soulDensity = soulDensity;
    }

    /**
     * @return the soulVitality
     */
    public int getSoulVitality() {
        return soulVitality;
    }

    /**
     * @param soulVitality the soulVitality to set
     */
    public void setSoulVitality(int soulVitality) {
        if(soulVitality <= 0)
            throw new IllegalArgumentException("Soul vitality cannot be zero or less");
        this.soulVitality = soulVitality;
    }

    /**
     * @return the soulVolume
     */
    public int getSoulVolume() {
        return soulVolume;
    }

    /**
     * @param soulVolume the soulVolume to set
     */
    public void setSoulVolume(int soulVolume) {
        if(soulVolume <= 0)
            throw new IllegalArgumentException("Soul volume cannot be zero or less");
        this.soulVolume = soulVolume;
    }

    
    
    
    
    
    
    
    
    
    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "SoulStats [soulRealm=" + soulRealm + ", soulType=" + soulType + ", soulAttribute=" + soulAttribute
                + ", soulForm=" + soulForm + "]";
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((soulAttribute == null) ? 0 : soulAttribute.hashCode());
        result = prime * result + soulDensity;
        result = prime * result + ((soulForm == null) ? 0 : soulForm.hashCode());
        result = prime * result + ((soulRealm == null) ? 0 : soulRealm.hashCode());
        result = prime * result + ((soulType == null) ? 0 : soulType.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SoulStats other = (SoulStats) obj;
        if (soulAttribute == null) {
            if (other.soulAttribute != null)
                return false;
        } else if (!soulAttribute.equals(other.soulAttribute))
            return false;
        if (soulDensity != other.soulDensity)
            return false;
        if (soulForm == null) {
            if (other.soulForm != null)
                return false;
        } else if (!soulForm.equals(other.soulForm))
            return false;
        if (soulRealm == null) {
            if (other.soulRealm != null)
                return false;
        } else if (!soulRealm.equals(other.soulRealm))
            return false;
        if (soulType == null) {
            if (other.soulType != null)
                return false;
        } else if (!soulType.equals(other.soulType))
            return false;
        return true;
    }
    
    
    
}
