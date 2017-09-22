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
    public String merchantType;
    public int goodsRarity;
    public int extortionRate;
    
    public String storeName;
    
    public Store(String storeName, String goodsType, int goodsRarity, int extortionRate) {
        setStoreName(storeName);
        setGoodsType(goodsType);
        setGoodsRarity(goodsRarity);
        setExtortionRate(extortionRate);
    }

    
    /**
     * @return the storeName
     */
    public String getStoreName() {
        return storeName;
    }


    /**
     * @param storeName the storeName to set
     */
    public void setStoreName(String storeName) {
        if(storeName == null || storeName.equals(""))
            throw new IllegalArgumentException("Invalid store name.");
        this.storeName = storeName;
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

    /**
     * @return the merchantType
     */
    public String getMerchantType() {
        return merchantType;
    }

    /**
     * @param merchantType the merchantType to set
     */
    public void setMerchantType(String merchantType) {
        if(merchantType == null || merchantType.equals(""))
            throw new IllegalArgumentException("Invalid merchant type.");
        this.merchantType = merchantType;
    }
}
