package cc.ibooker.zshoppingcart.bean;

import java.util.ArrayList;

/**
 * 购物车数据
 * Created by 邹峰立 on 2017/4/26.
 */
public class ShoppingCartDataXin {
    private String send_type;
    private ArrayList<CartRegionDataXin> cartRegionList;
    private double cartProductsTax;
    private String formatCartProductsTax;
    private double cartTotal;
    private String formatCartTotal;
    private double cartFreightTax;
    private double cartProductsTotal;
    private String formatCartProductsTotal;
    private String cartFreightTotal;
    private int cartQtyTotal;
    private double origProductsTotal;
    private double discountProductsTotal;
    private String formatDiscountProductsTotal;
    private int selected;
    private int isEmptyCart;// 0是空购物车 1非空购物车

    public ShoppingCartDataXin() {
        super();
    }

    public ShoppingCartDataXin(String send_type, int isEmptyCart, int selected, String formatDiscountProductsTotal, double discountProductsTotal, double origProductsTotal, int cartQtyTotal, String cartFreightTotal, String formatCartProductsTotal, double cartProductsTotal, double cartFreightTax, String formatCartTotal, double cartTotal, String formatCartProductsTax, double cartProductsTax, ArrayList<CartRegionDataXin> cartRegionList) {
        this.send_type = send_type;
        this.isEmptyCart = isEmptyCart;
        this.selected = selected;
        this.formatDiscountProductsTotal = formatDiscountProductsTotal;
        this.discountProductsTotal = discountProductsTotal;
        this.origProductsTotal = origProductsTotal;
        this.cartQtyTotal = cartQtyTotal;
        this.cartFreightTotal = cartFreightTotal;
        this.formatCartProductsTotal = formatCartProductsTotal;
        this.cartProductsTotal = cartProductsTotal;
        this.cartFreightTax = cartFreightTax;
        this.formatCartTotal = formatCartTotal;
        this.cartTotal = cartTotal;
        this.formatCartProductsTax = formatCartProductsTax;
        this.cartProductsTax = cartProductsTax;
        this.cartRegionList = cartRegionList;
    }

    public String getSend_type() {
        return send_type;
    }

    public void setSend_type(String send_type) {
        this.send_type = send_type;
    }

    public int getIsEmptyCart() {
        return isEmptyCart;
    }

    public void setIsEmptyCart(int isEmptyCart) {
        this.isEmptyCart = isEmptyCart;
    }

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
    }

    public String getFormatDiscountProductsTotal() {
        return formatDiscountProductsTotal;
    }

    public void setFormatDiscountProductsTotal(String formatDiscountProductsTotal) {
        this.formatDiscountProductsTotal = formatDiscountProductsTotal;
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

    public String getCartFreightTotal() {
        return cartFreightTotal;
    }

    public void setCartFreightTotal(String cartFreightTotal) {
        this.cartFreightTotal = cartFreightTotal;
    }

    public String getFormatCartProductsTotal() {
        return formatCartProductsTotal;
    }

    public void setFormatCartProductsTotal(String formatCartProductsTotal) {
        this.formatCartProductsTotal = formatCartProductsTotal;
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

    public String getFormatCartTotal() {
        return formatCartTotal;
    }

    public void setFormatCartTotal(String formatCartTotal) {
        this.formatCartTotal = formatCartTotal;
    }

    public double getCartTotal() {
        return cartTotal;
    }

    public void setCartTotal(double cartTotal) {
        this.cartTotal = cartTotal;
    }

    public String getFormatCartProductsTax() {
        return formatCartProductsTax;
    }

    public void setFormatCartProductsTax(String formatCartProductsTax) {
        this.formatCartProductsTax = formatCartProductsTax;
    }

    public double getCartProductsTax() {
        return cartProductsTax;
    }

    public void setCartProductsTax(double cartProductsTax) {
        this.cartProductsTax = cartProductsTax;
    }

    public ArrayList<CartRegionDataXin> getCartRegionList() {
        return cartRegionList;
    }

    public void setCartRegionList(ArrayList<CartRegionDataXin> cartRegionList) {
        this.cartRegionList = cartRegionList;
    }

    @Override
    public String toString() {
        return "ShoppingCartDataXin{" +
                "send_type='" + send_type + '\'' +
                ", cartRegionList=" + cartRegionList +
                ", cartProductsTax=" + cartProductsTax +
                ", formatCartProductsTax='" + formatCartProductsTax + '\'' +
                ", cartTotal=" + cartTotal +
                ", formatCartTotal='" + formatCartTotal + '\'' +
                ", cartFreightTax=" + cartFreightTax +
                ", cartProductsTotal=" + cartProductsTotal +
                ", formatCartProductsTotal='" + formatCartProductsTotal + '\'' +
                ", cartFreightTotal=" + cartFreightTotal +
                ", cartQtyTotal=" + cartQtyTotal +
                ", origProductsTotal=" + origProductsTotal +
                ", discountProductsTotal=" + discountProductsTotal +
                ", formatDiscountProductsTotal='" + formatDiscountProductsTotal + '\'' +
                ", selected=" + selected +
                ", isEmptyCart=" + isEmptyCart +
                '}';
    }
}
