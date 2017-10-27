package cc.ibooker.zshoppingcart.event;

import cc.ibooker.zshoppingcart.bean.Goods;

/**
 * 购物车删除商品事件
 * Created by 邹峰立 on 2017/5/3.
 */
public class ShoppingCartDeleteGoodsEvent {
    private Goods goods;

    public ShoppingCartDeleteGoodsEvent() {
        super();
    }

    public ShoppingCartDeleteGoodsEvent(Goods goods) {
        this.goods = goods;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}
