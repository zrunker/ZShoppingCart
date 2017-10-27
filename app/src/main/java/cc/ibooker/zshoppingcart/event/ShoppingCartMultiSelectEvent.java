package cc.ibooker.zshoppingcart.event;


import cc.ibooker.zshoppingcart.bean.CartRegionDataXin;

/**
 * 购物车一级选择事件
 * Created by 邹峰立 on 2017/5/3.
 */
public class ShoppingCartMultiSelectEvent {
    private CartRegionDataXin cartRegionDataXin;
    private String type;// 1代表取消选中，2代表选中

    public ShoppingCartMultiSelectEvent() {
        super();
    }

    public ShoppingCartMultiSelectEvent(CartRegionDataXin cartRegionDataXin, String type) {
        this.cartRegionDataXin = cartRegionDataXin;
        this.type = type;
    }

    public CartRegionDataXin getCartRegionDataXin() {
        return cartRegionDataXin;
    }

    public void setCartRegionDataXin(CartRegionDataXin cartRegionDataXin) {
        this.cartRegionDataXin = cartRegionDataXin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ShoppingCartMultiSelectEvent{" +
                "cartRegionDataXin=" + cartRegionDataXin +
                ", type='" + type + '\'' +
                '}';
    }
}
