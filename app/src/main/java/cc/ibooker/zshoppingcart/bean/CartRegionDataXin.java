package cc.ibooker.zshoppingcart.bean;

import java.util.ArrayList;

/**
 * 购物车相关数据
 * Created by 邹峰立 on 2017/4/26.
 */
public class CartRegionDataXin {
    private String warehouseLabel;
    private String webGoodsSource;
    private String shippingStatus;
    private int warehouseType;
    private int selected;
    private ArrayList<CartProdutsDataXin> cartProdutsArray;
    private double cartTotal;
    private double cartFreightTax;
    private double cartProductsTotal;
    private double cartFreightTotal;
    private int cartQtyTotal;
    private double origProductsTotal;
    private double discountProductsTotal;
    /**
     * 根据业务需求额外添加
     */
    private boolean isCartRegionCheck;
    private boolean isDelCheck;

    public CartRegionDataXin() {
        super();
    }

    public CartRegionDataXin(String warehouseLabel, String webGoodsSource, String shippingStatus, int warehouseType, int selected, ArrayList<CartProdutsDataXin> cartProdutsArray, double cartTotal, double cartFreightTax, double cartProductsTotal, double cartFreightTotal, int cartQtyTotal, double origProductsTotal, double discountProductsTotal, boolean isCartRegionCheck, boolean isDelCheck) {
        this.warehouseLabel = warehouseLabel;
        this.webGoodsSource = webGoodsSource;
        this.shippingStatus = shippingStatus;
        this.warehouseType = warehouseType;
        this.selected = selected;
        this.cartProdutsArray = cartProdutsArray;
        this.cartTotal = cartTotal;
        this.cartFreightTax = cartFreightTax;
        this.cartProductsTotal = cartProductsTotal;
        this.cartFreightTotal = cartFreightTotal;
        this.cartQtyTotal = cartQtyTotal;
        this.origProductsTotal = origProductsTotal;
        this.discountProductsTotal = discountProductsTotal;
        this.isCartRegionCheck = isCartRegionCheck;
        this.isDelCheck = isDelCheck;
    }

    public String getWarehouseLabel() {
        return warehouseLabel;
    }

    public void setWarehouseLabel(String warehouseLabel) {
        this.warehouseLabel = warehouseLabel;
    }

    public boolean isCartRegionCheck() {
        return isCartRegionCheck;
    }

    public void setCartRegionCheck(boolean cartRegionCheck) {
        isCartRegionCheck = cartRegionCheck;
    }

    public double getDiscountProductsTotal() {
        return discountProductsTotal;
    }

    public void setDiscountProductsTotal(double discountProductsTotal) {
        this.discountProductsTotal = discountProductsTotal;
    }

    public double getOrigProductsTotal() {
        return origProductsTotal;
    }

    public void setOrigProductsTotal(double origProductsTotal) {
        this.origProductsTotal = origProductsTotal;
    }

    public int getCartQtyTotal() {
        return cartQtyTotal;
    }

    public void setCartQtyTotal(int cartQtyTotal) {
        this.cartQtyTotal = cartQtyTotal;
    }

    public double getCartFreightTotal() {
        return cartFreightTotal;
    }

    public void setCartFreightTotal(double cartFreightTotal) {
        this.cartFreightTotal = cartFreightTotal;
    }

    public double getCartProductsTotal() {
        return cartProductsTotal;
    }

    public void setCartProductsTotal(double cartProductsTotal) {
        this.cartProductsTotal = cartProductsTotal;
    }

    public double getCartFreightTax() {
        return cartFreightTax;
    }

    public void setCartFreightTax(double cartFreightTax) {
        this.cartFreightTax = cartFreightTax;
    }

    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    public ArrayList<CartProdutsDataXin> getCartProdutsArray() {
        return cartProdutsArray;
    }

    public void setCartProdutsArray(ArrayList<CartProdutsDataXin> cartProdutsArray) {
        this.cartProdutsArray = cartProdutsArray;
    }

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
    }

    public int getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(int warehouseType) {
        this.warehouseType = warehouseType;
    }

    public String getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(String shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    public String getWebGoodsSource() {
        return webGoodsSource;
    }

    public void setWebGoodsSource(String webGoodsSource) {
        this.webGoodsSource = webGoodsSource;
    }

    public boolean isDelCheck() {
        return isDelCheck;
    }

    public void setDelCheck(boolean delAllCheck) {
        isDelCheck = delAllCheck;
    }

    @Override
    public String toString() {
        return "CartRegionDataXin{" +
                "warehouseLabel='" + warehouseLabel + '\'' +
                ", webGoodsSource='" + webGoodsSource + '\'' +
                ", shippingStatus='" + shippingStatus + '\'' +
                ", warehouseType=" + warehouseType +
                ", selected=" + selected +
                ", cartProdutsArray=" + cartProdutsArray +
                ", cartTotal=" + cartTotal +
                ", cartFreightTax=" + cartFreightTax +
                ", cartProductsTotal=" + cartProductsTotal +
                ", cartFreightTotal=" + cartFreightTotal +
                ", cartQtyTotal=" + cartQtyTotal +
                ", origProductsTotal=" + origProductsTotal +
                ", discountProductsTotal=" + discountProductsTotal +
                ", isCartRegionCheck=" + isCartRegionCheck +
                ", isDelCheck=" + isDelCheck +
                '}';
    }
}
