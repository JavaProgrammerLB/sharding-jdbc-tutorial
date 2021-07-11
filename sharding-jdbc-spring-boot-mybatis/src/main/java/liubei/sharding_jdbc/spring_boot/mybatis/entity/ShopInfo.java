package liubei.sharding_jdbc.spring_boot.mybatis.entity;

public class ShopInfo {
    /**
     * 商户id
     */
    private Long shopId;

    /**
     * 商户名
     */
    private String shopName;

    /**
     * 商户账户
     */
    private String account;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
