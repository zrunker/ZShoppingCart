package cc.ibooker.zshoppingcart.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import cc.ibooker.zshoppingcart.R;
import cc.ibooker.zshoppingcart.bean.ShoppingCartXin;
import cc.ibooker.zshoppingcart.viewholder.ShoppingCartTypeOneHolder;
import cc.ibooker.zshoppingcart.viewholder.ShoppingCartTypeThreeHolder;
import cc.ibooker.zshoppingcart.viewholder.ShoppingCartTypeTwoHolder;

/**
 * 购物车 RecycleView Adapter
 * Created by 邹峰立 on 2017/4/28.
 */
public class ShoppingCartXinAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    //    private final int LEVEL_ONE = 0, LEVEL_TWO = 1, LEVEL_THREE = 2, FOOTER = 3;
    private final int LEVEL_ONE = 0, LEVEL_TWO = 1, LEVEL_THREE = 2;
    private LayoutInflater inflater;
    private ArrayList<ShoppingCartXin> mDatas = new ArrayList<>();
    // 底部
    private View footerView;
    private int footCount;
    private boolean isShowDel;

//    public ShoppingCartXinAdapter(Context context, ArrayList<ShoppingCartXin> list, View footer) {
//        this.inflater = LayoutInflater.from(context);
//        this.mDatas = list;
//        // 底部
//        this.footerView = footer;
//        this.footCount = footerView == null ? 0 : 1;
//    }

    public ShoppingCartXinAdapter(Context context, ArrayList<ShoppingCartXin> list, boolean isShowDel) {
        this.inflater = LayoutInflater.from(context);
        this.mDatas = list;
        this.isShowDel = isShowDel;
    }

    // 刷新
    public void reflashData(ArrayList<ShoppingCartXin> list, boolean isShowDel) {
        this.mDatas = list;
        this.isShowDel = isShowDel;
        this.notifyDataSetChanged();
    }

    // 刷新底部
    public void reflashFooterView(View footer) {
        this.footerView = footer;
        this.footCount = footerView == null ? 0 : 1;
        this.notifyItemChanged(getItemCount() - 1);
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerView.ViewHolder holder = null;
        switch (viewType) {
            case LEVEL_ONE:// 一级布局
                holder = new ShoppingCartTypeOneHolder(inflater.inflate(R.layout.fragment_shopping_cart_typeone, parent, false));
                break;
            case LEVEL_TWO:// 二级布局
                holder = new ShoppingCartTypeTwoHolder(inflater.inflate(R.layout.fragment_shopping_cart_typetwo, parent, false));
                break;
            case LEVEL_THREE:// 三级布局
                holder = new ShoppingCartTypeThreeHolder(inflater.inflate(R.layout.fragment_shopping_cart_typethree, parent, false));
                break;
//            case FOOTER:// 底部
//                if (footerView != null)
//                    holder = new FooterHolder(footerView);
//                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int viewType = getItemViewType(position);
        if (viewType == LEVEL_ONE) {// 一级布局
            ShoppingCartTypeOneHolder shoppingCartTypeOneHolder = (ShoppingCartTypeOneHolder) holder;
            shoppingCartTypeOneHolder.bindHolder(mDatas.get(position).getCartRegionDataXin(), isShowDel, position);
        } else if (viewType == LEVEL_TWO) {// 二级布局
            ShoppingCartTypeTwoHolder shoppingCartTypeTwoHolder = (ShoppingCartTypeTwoHolder) holder;
            shoppingCartTypeTwoHolder.bindHolder(mDatas.get(position).getCartProdutsDataXin());
        } else if (viewType == LEVEL_THREE) {// 三级布局
            ShoppingCartTypeThreeHolder shoppingCartTypeThreeHolder = (ShoppingCartTypeThreeHolder) holder;
            shoppingCartTypeThreeHolder.bindHolder(mDatas.get(position).getGoods(), isShowDel, position);
        }
    }

    @Override
    public int getItemCount() {
//        return mDatas.size() + footCount;
        return mDatas.size();
    }

    /**
     * 三种布局：一级布局 0，二级布局 1，三级布局 2，底部 3
     */
    @Override
    public int getItemViewType(int position) {
//        int itemType = -1;
//        if (position >= 0 && position < mDatas.size()) {
//            ShoppingCartXin shoppingCartXin = mDatas.get(position);
//            itemType = shoppingCartXin.getType();
//        } else if (position >= mDatas.size()) {
//            itemType = FOOTER;
//        }
//        return itemType;
        return mDatas.get(position).getType();
    }
}
