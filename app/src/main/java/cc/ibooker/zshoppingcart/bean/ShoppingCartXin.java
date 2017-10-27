package cc.ibooker.zshoppingcart.bean;

/**
 * 重构购物车数据
 * Created by 邹峰立 on 2017/5/2.
 */
public class ShoppingCartXin {
    private int type;// 三种布局：一级布局 0，二级布局 1，三级布局 2
    private CartRegionDataXin cartRegionDataXin;
    private CartProdutsDataXin cartProdutsDataXin;
    private Goods goods;

    public ShoppingCartXin() {
        super();
    }

    public ShoppingCartXin(CartRegionDataXin cartRegionDataXin) {
        this.cartRegionDataXin = cartRegionDataXin;
    }

    public ShoppingCartXin(CartProdutsDataXin cartProdutsDataXin) {
        this.cartProdutsDataXin = cartProdutsDataXin;
    }

    public ShoppingCartXin(Goods goods) {
        this.goods = goods;
    }

    public ShoppingCartXin(CartRegionDataXin cartRegionDataXin, Goods goods, CartProdutsDataXin cartProdutsDataXin) {
        this.cartRegionDataXin = cartRegionDataXin;
        this.goods = goods;
        this.cartProdutsDataXin = cartProdutsDataXin;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public CartRegionDataXin getCartRegionDataXin() {
        return cartRegionDataXin;
    }

    public void setCartRegionDataXin(CartRegionDataXin cartRegionDataXin) {
        this.cartRegionDataXin = cartRegionDataXin;
    }

    public CartProdutsDataXin getCartProdutsDataXin() {
        return cartProdutsDataXin;
    }

    public void setCartProdutsDataXin(CartProdutsDataXin cartProdutsDataXin) {
        this.cartProdutsDataXin = cartProdutsDataXin;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "ShoppingCartXin{" +
                "type=" + type +
                ", cartRegionDataXin=" + cartRegionDataXin +
                ", cartProdutsDataXin=" + cartProdutsDataXin +
                ", goods=" + goods +
                '}';
    }
}
