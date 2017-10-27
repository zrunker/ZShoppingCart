package cc.ibooker.zshoppingcart.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

import cc.ibooker.zshoppingcart.R;
import cc.ibooker.zshoppingcart.bean.CartRegionDataXin;
import cc.ibooker.zshoppingcart.event.ShoppingCartMultiSelectEvent;
import cc.ibooker.zshoppingcart.event.ShoppingCartRegionDelCheckEvent;
import cc.ibooker.zshoppingcart.utils.ClickUtil;

/**
 * 购物车第一种样式Holder
 * Created by 邹峰立 on 2017/4/26.
 */
public class ShoppingCartTypeOneHolder extends RecyclerView.ViewHolder {
    private CheckBox webGoodsSourceCB;
    private CheckBox delWebGoodsSourceCB;
    private TextView sendTypeTv;

    public ShoppingCartTypeOneHolder(View itemView) {
        super(itemView);
        this.webGoodsSourceCB = itemView.findViewById(R.id.cb_webGoodsSource);
        this.delWebGoodsSourceCB = itemView.findViewById(R.id.cb_del_webGoodsSource);
        this.sendTypeTv = itemView.findViewById(R.id.tv_send_type);
    }

    public void bindHolder(final CartRegionDataXin cartRegionDataXin, boolean isShowDel, final int position) {
        if (cartRegionDataXin != null) {
            if (isShowDel) {
                webGoodsSourceCB.setVisibility(View.GONE);
                delWebGoodsSourceCB.setVisibility(View.VISIBLE);
            } else {
                webGoodsSourceCB.setVisibility(View.VISIBLE);
                delWebGoodsSourceCB.setVisibility(View.GONE);
            }
            delWebGoodsSourceCB.setChecked(cartRegionDataXin.isDelCheck());
            webGoodsSourceCB.setChecked(cartRegionDataXin.isCartRegionCheck());
            delWebGoodsSourceCB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 防止连续点击
                    if (ClickUtil.isFastClick()) {
                        return;
                    }
                    // 发送通讯
                    EventBus.getDefault().postSticky(new ShoppingCartRegionDelCheckEvent(position, delWebGoodsSourceCB.isChecked(), cartRegionDataXin));
                }
            });
            webGoodsSourceCB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 防止连续点击
                    if (ClickUtil.isFastClick()) {
                        return;
                    }
                    // 发送通讯
                    EventBus.getDefault().postSticky(new ShoppingCartMultiSelectEvent(cartRegionDataXin, webGoodsSourceCB.isChecked() ? "2" : "1"));
                }
            });
            sendTypeTv.setText(cartRegionDataXin.getWebGoodsSource());
        }
    }

}
