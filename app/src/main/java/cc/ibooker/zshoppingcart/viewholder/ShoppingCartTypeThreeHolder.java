package cc.ibooker.zshoppingcart.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

import cc.ibooker.zdialoglib.DelDialog;
import cc.ibooker.zshoppingcart.R;
import cc.ibooker.zshoppingcart.bean.Goods;
import cc.ibooker.zshoppingcart.event.ShoppingCartDeleteGoodsEvent;
import cc.ibooker.zshoppingcart.event.ShoppingCartGoodsDelCheckEvent;
import cc.ibooker.zshoppingcart.event.ShoppingCartNumChangeEvent;
import cc.ibooker.zshoppingcart.event.ShoppingCartRadioEvent;
import cc.ibooker.zshoppingcart.utils.ClickUtil;
import cc.ibooker.zshoppingcart.view.FlowLayout;

/**
 * 购物车第三种样式Holder
 * Created by 邹峰立 on 2017/4/26.
 */
public class ShoppingCartTypeThreeHolder extends RecyclerView.ViewHolder {
    private Context context;
    private LayoutInflater inflater;
    private RelativeLayout holderLayout;
    private LinearLayout goodsLayout;
    private CheckBox checkBox, delCBox;
    private ImageView goodsImg, reduceImg, addImg, soldoutImg;
    private TextView deleteTv, titleTv, specificationTv, priceTv, taxRateTv, taxRateExplainTv, storageTv;
    private FlowLayout flowlayout;
    private DelDialog delDialog;

    public ShoppingCartTypeThreeHolder(View itemView) {
        super(itemView);
        this.context = itemView.getContext();
        this.inflater = LayoutInflater.from(context);
        this.holderLayout = itemView.findViewById(R.id.layout_holder);
        this.deleteTv = itemView.findViewById(R.id.tv_delete);
        this.goodsLayout = itemView.findViewById(R.id.layout_goods);
        this.checkBox = itemView.findViewById(R.id.cb_scart);
        this.delCBox = itemView.findViewById(R.id.cb_del_scart);
        this.goodsImg = itemView.findViewById(R.id.img_goods);
        this.soldoutImg = itemView.findViewById(R.id.img_soldout);
        this.titleTv = itemView.findViewById(R.id.tv_title);
        this.specificationTv = itemView.findViewById(R.id.tv_specification);
        this.flowlayout = itemView.findViewById(R.id.flowlayout);
        this.priceTv = itemView.findViewById(R.id.tv_price);
        this.reduceImg = itemView.findViewById(R.id.img_reduce);
        this.storageTv = itemView.findViewById(R.id.tv_update_count);
        this.addImg = itemView.findViewById(R.id.img_add);
        this.taxRateTv = itemView.findViewById(R.id.tv_tax_rate);
        this.taxRateExplainTv = itemView.findViewById(R.id.tv_tax_rate_explain);
    }

    // 绑定删除
    public void bindHolder(final Goods goods, boolean isShowDel, final int position) {
        if (goods != null) {
            goodsLayout.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    // 长按事件
                    if (delDialog == null)
                        delDialog = new DelDialog(context);
                    delDialog.setOnDelListener(new DelDialog.OnDelListener() {
                        @Override
                        public void onDel() {
                            // 发送通信-执行删除操作
                            EventBus.getDefault().postSticky(new ShoppingCartDeleteGoodsEvent(goods));
                        }
                    });
                    delDialog.showDelDialog();
                    return false;
                }
            });
            goodsLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 防止连续点击
                    if (ClickUtil.isFastClick()) {
                        return;
                    }
                    // 点击事件
                    Toast.makeText(context, "进入商品详情页面", Toast.LENGTH_SHORT).show();
                }
            });
            Picasso.with(context)
                    .load(goods.getGoods_image_url())
                    .placeholder(R.mipmap.ic_launcher)
                    .error(R.mipmap.ic_launcher)
                    .fit()
                    .noFade()
                    .into(goodsImg);
            if (goods.getStatus() != 1) {
                soldoutImg.setVisibility(View.VISIBLE);
            } else {
                soldoutImg.setVisibility(View.GONE);
            }
            // 设置文本名称
            String snap_up_label = goods.getSnap_up_label();
            if (!TextUtils.isEmpty(snap_up_label))
                snap_up_label = "<font color='#FF7198'>" + snap_up_label + "/" + "</font>";
            titleTv.setText(Html.fromHtml(snap_up_label + goods.getGoods_name()));
            specificationTv.setText("规格：" + goods.getForamt_spec_value());
            // 设置流式布局
            ArrayList<String> data = goods.getLabelArray();
            if (data == null || data.size() <= 0) {
                flowlayout.setVisibility(View.GONE);
            } else {
                flowlayout.setVisibility(View.VISIBLE);
                setSpecialOfferFlowLayoutData(data, flowlayout);
            }
            priceTv.setText(goods.getFormat_final_price());
            storageTv.setText(goods.getCart_qty());
            taxRateTv.setText("单件税费约" + goods.getSingle_tax_price());
            taxRateTv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 防止连续点击
                    if (ClickUtil.isFastClick()) {
                        return;
                    }
                    Drawable drawableRight;
                    if (taxRateExplainTv.getVisibility() == View.GONE) {
                        taxRateExplainTv.setVisibility(View.VISIBLE);
                        drawableRight = context.getResources().getDrawable(R.mipmap.icon_arrowup);
                    } else {
                        taxRateExplainTv.setVisibility(View.GONE);
                        drawableRight = context.getResources().getDrawable(R.mipmap.icon_arrowdown);
                    }
                    drawableRight.setBounds(0, 0, drawableRight.getMinimumWidth(), drawableRight.getMinimumHeight()); //设置边界
                    taxRateTv.setCompoundDrawables(null, null, drawableRight, null);
                    taxRateTv.invalidate();
                }
            });
            taxRateExplainTv.setText("适用税率" + goods.getFormat_tax() + "，实际税费以订单结算为准");
            /**
             * 数据操作部分实现
             */
            delCBox.setChecked(goods.isDelCheck());
            checkBox.setChecked(goods.isChecked());
            if (isShowDel) {
                delCBox.setVisibility(View.VISIBLE);
                checkBox.setVisibility(View.GONE);
            } else {
                delCBox.setVisibility(View.GONE);
                checkBox.setVisibility(View.VISIBLE);
            }
            delCBox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 防止连续点击
                    if (ClickUtil.isFastClick()) {
                        return;
                    }
                    EventBus.getDefault().postSticky(new ShoppingCartGoodsDelCheckEvent(position, delCBox.isChecked(), goods));
                }
            });
            // 设置checkBox点击事件
            checkBox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // 防止连续点击
                    if (ClickUtil.isFastClick()) {
                        return;
                    }
                    EventBus.getDefault().postSticky(new ShoppingCartRadioEvent(goods));
                }
            });
            // DrawableLeft监听，数量减少
            final int lower_limit = goods.getLower_limit();
            reduceImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // 防止连续点击
                    if (ClickUtil.isFastClick()) {
                        return;
                    }
                    String str = storageTv.getText().toString().trim();
                    if (!TextUtils.isEmpty(str)) {
                        int quantity = Integer.parseInt(str);// 当前商品数量
                        if (quantity < lower_limit) {
                            // 发送通信
                            EventBus.getDefault().postSticky(new ShoppingCartNumChangeEvent(goods, lower_limit + ""));
                        } else if (quantity == lower_limit) {
                            Toast.makeText(context, "该商品最低" + lower_limit + "件起购", Toast.LENGTH_SHORT).show();
                        } else {
                            if (quantity > 1) {
                                quantity--;
                                // 发送通信
                                EventBus.getDefault().postSticky(new ShoppingCartNumChangeEvent(goods, quantity + ""));
                            }
                        }
                    }
                }
            });
            // DrawableRight监听，数量增加
            final int storage = goods.getStorage();
            final int higher_limit = goods.getHigher_limit();
            addImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // 防止连续点击
                    if (ClickUtil.isFastClick()) {
                        return;
                    }
                    String str = storageTv.getText().toString().trim();
                    if (!TextUtils.isEmpty(str)) {
                        int quantity = Integer.parseInt(str);// 标记当前商品数量

                        if (quantity > higher_limit && higher_limit > 0) {
                            // 发送通信
                            EventBus.getDefault().postSticky(new ShoppingCartNumChangeEvent(goods, higher_limit + ""));
                        } else if (quantity == higher_limit && higher_limit > 0) {
                            Toast.makeText(context, goods.getLimit_msg(), Toast.LENGTH_SHORT).show();
                        } else {
                            if (quantity < 99) {
                                if (quantity <= storage) {
                                    quantity++;
                                    // 发送通信
                                    EventBus.getDefault().postSticky(new ShoppingCartNumChangeEvent(goods, quantity + ""));
                                } else {
                                    Toast.makeText(context, "库存不足", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(context, "单个商品最多添加99件商品", Toast.LENGTH_SHORT).show();
                            }
                        }
                    }
                }
            });
        }
    }

    // 设置流式布局控件-优惠活动
    private void setSpecialOfferFlowLayoutData(ArrayList<String> data, FlowLayout specialOfferFlowLayout) {
        if (data != null && data.size() > 0) {
            specialOfferFlowLayout.removeAllViews();
            for (String value : data) {
                TextView tv = (TextView) inflater.inflate(R.layout.tag_red_circular_textview, specialOfferFlowLayout, false);
                tv.setText(value);
                specialOfferFlowLayout.addView(tv);
            }
        }
    }
}
