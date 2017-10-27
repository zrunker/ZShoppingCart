package cc.ibooker.zshoppingcart.bean;

import java.util.ArrayList;

/**
 * 购物车相关数据
 * Created by 邹峰立 on 2017/4/26.
 */
public class CartProdutsDataXin {
    private String currentRuleStr;
    private String totalPrice;
    private int groupId;
    private String groupLink;
    private String activityDiscountAmount;
    private String activityTypeStr;
    private ArrayList<Goods> goods;

    public CartProdutsDataXin() {
        super();
    }

    public CartProdutsDataXin(String currentRuleStr, String totalPrice, int groupId, String groupLink, String activityDiscountAmount, String activityTypeStr, ArrayList<Goods> goods) {
        this.currentRuleStr = currentRuleStr;
        this.totalPrice = totalPrice;
        this.groupId = groupId;
        this.groupLink = groupLink;
        this.activityDiscountAmount = activityDiscountAmount;
        this.activityTypeStr = activityTypeStr;
        this.goods = goods;
    }

    public String getCurrentRuleStr() {
        return currentRuleStr;
    }

    public void setCurrentRuleStr(String currentRuleStr) {
        this.currentRuleStr = currentRuleStr;
    }

    public ArrayList<Goods> getGoods() {
        return goods;
    }

    public void setGoods(ArrayList<Goods> goods) {
        this.goods = goods;
    }

    public String getActivityTypeStr() {
        return activityTypeStr;
    }

    public void setActivityTypeStr(String activityTypeStr) {
        this.activityTypeStr = activityTypeStr;
    }

    public String getActivityDiscountAmount() {
        return activityDiscountAmount;
    }

    public void setActivityDiscountAmount(String activityDiscountAmount) {
        this.activityDiscountAmount = activityDiscountAmount;
    }

    public String getGroupLink() {
        return groupLink;
    }

    public void setGroupLink(String groupLink) {
        this.groupLink = groupLink;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "CartProdutsDataXin{" +
                "currentRuleStr='" + currentRuleStr + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", groupId=" + groupId +
                ", groupLink='" + groupLink + '\'' +
                ", activityDiscountAmount='" + activityDiscountAmount + '\'' +
                ", activityTypeStr='" + activityTypeStr + '\'' +
                ", goods=" + goods +
                '}';
    }
}
