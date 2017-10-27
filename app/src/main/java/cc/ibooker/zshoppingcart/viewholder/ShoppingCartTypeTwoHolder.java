package cc.ibooker.zshoppingcart.viewholder;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import cc.ibooker.zshoppingcart.R;
import cc.ibooker.zshoppingcart.bean.CartProdutsDataXin;
import cc.ibooker.zshoppingcart.utils.ClickUtil;

/**
 * 购物车第二种样式Holder
 * Created by 邹峰立 on 2017/4/26.
 */
public class ShoppingCartTypeTwoHolder extends RecyclerView.ViewHolder {
    private Context context;
    private RelativeLayout currentRuleLayout;
    private TextView activityTypeStrTv, currentRuleStrTv;

    public ShoppingCartTypeTwoHolder(View itemView) {
        super(itemView);
        this.context = itemView.getContext();
        this.currentRuleLayout = itemView.findViewById(R.id.layout_currentRule);
        this.activityTypeStrTv = itemView.findViewById(R.id.tv_activityTypeStr);
        this.currentRuleStrTv = itemView.findViewById(R.id.tv_currentRuleStr);
    }

    public void bindHolder(final CartProdutsDataXin cartProdutsDataXin) {
        if (cartProdutsDataXin != null) {
            String activityTypeStr = cartProdutsDataXin.getActivityTypeStr();
            String currentRuleStr = cartProdutsDataXin.getCurrentRuleStr();
            if (TextUtils.isEmpty(activityTypeStr) && TextUtils.isEmpty(currentRuleStr)) {
                currentRuleLayout.setVisibility(View.GONE);
            } else {
                currentRuleLayout.setVisibility(View.VISIBLE);
                currentRuleLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // 防止连续点击
                        if (ClickUtil.isFastClick()) {
                            return;
                        }
                        Toast.makeText(context, cartProdutsDataXin.getCurrentRuleStr(), Toast.LENGTH_SHORT).show();
                    }
                });
                // 活动类型
                if (TextUtils.isEmpty(activityTypeStr)) {
                    activityTypeStrTv.setVisibility(View.GONE);
                } else {
                    activityTypeStrTv.setVisibility(View.VISIBLE);
                    activityTypeStrTv.setText(activityTypeStr);
                }
                // 标签
                if (TextUtils.isEmpty(currentRuleStr)) {
                    currentRuleStrTv.setVisibility(View.GONE);
                } else {
                    currentRuleStrTv.setVisibility(View.VISIBLE);
                    currentRuleStrTv.setText(cartProdutsDataXin.getCurrentRuleStr());
                }
            }
        }
    }
}
