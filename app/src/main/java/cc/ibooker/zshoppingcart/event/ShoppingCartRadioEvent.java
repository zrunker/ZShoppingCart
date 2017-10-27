package cc.ibooker.zshoppingcart.event;

import cc.ibooker.zshoppingcart.bean.Goods;

/**
 * 购物车单选事件
 * Created by 邹峰立 on 2017/5/3.
 */
public class ShoppingCartRadioEvent {
    private Goods goods;

    public ShoppingCartRadioEvent() {
        super();
    }

    public ShoppingCartRadioEvent(Goods goods) {
        this.goods = goods;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "ShoppingCartRadioEvent{" +
                "goods=" + goods +
                '}';
    }
}
