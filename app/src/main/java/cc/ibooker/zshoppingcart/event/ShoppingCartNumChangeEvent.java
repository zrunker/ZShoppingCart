package cc.ibooker.zshoppingcart.event;

import cc.ibooker.zshoppingcart.bean.Goods;

/**
 * 购物车数量变化事件
 * Created by 邹峰立 on 2017/5/3.
 */
public class ShoppingCartNumChangeEvent {
    private Goods goods;
    private String quantity;// 数量

    public ShoppingCartNumChangeEvent() {
        super();
    }

    public ShoppingCartNumChangeEvent(Goods goods, String quantity) {
        this.goods = goods;
        this.quantity = quantity;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

}
