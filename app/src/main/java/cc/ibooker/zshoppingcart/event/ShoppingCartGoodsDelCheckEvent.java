package cc.ibooker.zshoppingcart.event;

import cc.ibooker.zshoppingcart.bean.Goods;

/**
 * 购物车删除状态CheckBox点击事件
 * Created by 邹峰立 on 2017/10/23.
 */
public class ShoppingCartGoodsDelCheckEvent {
    private int position;
    private boolean isDelCheck;
    private Goods goods;

    public ShoppingCartGoodsDelCheckEvent() {
        super();
    }

    public ShoppingCartGoodsDelCheckEvent(int position, boolean isDelCheck, Goods goods) {
        this.position = position;
        this.isDelCheck = isDelCheck;
        this.goods = goods;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public boolean isDelCheck() {
        return isDelCheck;
    }

    public void setDelCheck(boolean delCheck) {
        isDelCheck = delCheck;
    }
}
