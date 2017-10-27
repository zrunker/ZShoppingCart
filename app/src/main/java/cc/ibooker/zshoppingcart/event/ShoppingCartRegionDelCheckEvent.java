package cc.ibooker.zshoppingcart.event;


import cc.ibooker.zshoppingcart.bean.CartRegionDataXin;

/**
 * 购物车发货地Check点击事件
 * Created by 邹峰立 on 2017/10/23.
 */
public class ShoppingCartRegionDelCheckEvent {
    private int position;
    private boolean isDelCheck;
    private CartRegionDataXin cartRegionDataXin;

    public ShoppingCartRegionDelCheckEvent() {
        super();
    }

    public ShoppingCartRegionDelCheckEvent(int position, boolean isDelCheck, CartRegionDataXin cartRegionDataXin) {
        this.position = position;
        this.isDelCheck = isDelCheck;
        this.cartRegionDataXin = cartRegionDataXin;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean isDelCheck() {
        return isDelCheck;
    }

    public void setDelCheck(boolean delCheck) {
        isDelCheck = delCheck;
    }

    public CartRegionDataXin getCartRegionDataXin() {
        return cartRegionDataXin;
    }

    public void setCartRegionDataXin(CartRegionDataXin cartRegionDataXin) {
        this.cartRegionDataXin = cartRegionDataXin;
    }
}
