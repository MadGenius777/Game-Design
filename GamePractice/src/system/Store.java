/**
 * 
 */
package system;

/**
 * @author William Nathan
 *
 */
public class Store {

    public String goodsType;
    public int goodsRarity;
    public int extortionRate;
    
    public Store(String goodsType, int goodsRarity, int extortionRate) {
        
    }

    /**
     * @return the goodsType
     */
    public String getGoodsType() {
        return goodsType;
    }

    /**
     * @param goodsType the goodsType to set
     */
    public void setGoodsType(String goodsType) {
        if(goodsType.equals("") || goodsType == null)
            throw new IllegalArgumentException("Invalid goods Type.");
        this.goodsType = goodsType;
    }

    /**
     * @return the goodsRarity
     */
    public int getGoodsRarity() {
        return goodsRarity;
    }

    /**
     * @param goodsRarity the goodsRarity to set
     */
    public void setGoodsRarity(int goodsRarity) {
        if(goodsRarity < 0)
            throw new IllegalArgumentException("Goods rarity cannot be negative.");
        this.goodsRarity = goodsRarity;
    }

    /**
     * @return the extortionRate
     */
    public int getExtortionRate() {
        return extortionRate;
    }

    /**
     * @param extortionRate the extortionRate to set
     */
    public void setExtortionRate(int extortionRate) {
        this.extortionRate = extortionRate;
    }
}
