package cc.ibooker.zshoppingcart.bean;

import java.util.ArrayList;

/**
 * 商品信息
 * Created by 邹峰立 on 2017/2/24.
 */
public class Goods {
    private String goods_id;// 商品id
    private String goods_name;// 商品名称
    private String goods_image_url;// 商品图片地址
    private String products_url;// 商品详情链接
    private String market_price;// 商品市场价
    private String list_price;// 商品价格
    private String final_price;// 商品最终价格
    private int storage;// 商品库存
    private String promotion_type;// 促销类型 0无促销，1秒杀，2团购
    private String goods_state;// 商品状态 0下架，1正常,2回收站，10违规（禁售）
    private String format_promotion_type;// 促销类型 0无促销，1秒杀，2团购
    private String format_market_price;// 日本价格
    private String format_list_price;// 格式化的商品价格
    private String format_final_price;// 格式化的商品最终价格
    private String goods_commonid;// 商品的主Id
    private String is_free;// 是否为免税商品 1是 0否
    private double tax_price;// 商品税
    private String format_tax_price;// 格式化的商品税
    private ArrayList<String> labelArray;// 标签数组
    private ArrayList<String> label_array;
    // 添加
    private int speciticationCnt;
    private String format_spec;// 规格
    private String format_price;// 单品价格或是价格区间
    private String trailer_text;
    private String pre_goods_name;
    private String spec_value;
    private String cart_qty;// 商品数量
    private String cart_id;// 购物车ID
    private int list_products_total;
    private double tax;// 税率
    private String format_tax;
    private double final_products_total;
    private String format_final_products_total;
    private int status;// 1为在售商品，0为卖光
    private String productsId;//商品Id
    // 添加
    private String goods_link_name;
    private String foramt_spec_value;
    private String format_list_products_total;
    // 添加
    private String goods_name_pre;// 商品前缀
    private int higher_limit;// 最高效果，0代表无限购
    private String limit_msg;
    private int lower_limit;
    private String storage_label;
    private String single_tax_price;
    private int selected;
    private String snap_up_label;
    private String label_type;
    private String promotion_label;
    private String goods_jingle;
    private String goods_sologan;
    private String is_promotion;
    private String default_goods_id;
    private String specifications;
    /**
     * 由于业务功能额外添加字段
     */
    private boolean isChecked;// 是否被选中
    private boolean isDelCheck;
    private int warehouseType;

    public Goods() {
        super();
    }

    public Goods(String goods_id, String goods_name, String goods_image_url, String products_url, String market_price, String list_price, String final_price, int storage, String promotion_type, String goods_state, String format_promotion_type, String format_market_price, String format_list_price, String format_final_price, String goods_commonid, String is_free, double tax_price, String format_tax_price, ArrayList<String> labelArray, ArrayList<String> label_array, int speciticationCnt, String format_spec, String format_price, String trailer_text, String pre_goods_name, String spec_value, String cart_qty, String cart_id, int list_products_total, double tax, String format_tax, double final_products_total, String format_final_products_total, int status, String productsId, String goods_link_name, String foramt_spec_value, String format_list_products_total, String goods_name_pre, int higher_limit, String limit_msg, int lower_limit, String storage_label, String single_tax_price, int selected, String snap_up_label, String label_type, String promotion_label, String goods_jingle, String goods_sologan, String is_promotion, String default_goods_id, String specifications,  boolean isChecked, boolean isDelCheck, int warehouseType) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_image_url = goods_image_url;
        this.products_url = products_url;
        this.market_price = market_price;
        this.list_price = list_price;
        this.final_price = final_price;
        this.storage = storage;
        this.promotion_type = promotion_type;
        this.goods_state = goods_state;
        this.format_promotion_type = format_promotion_type;
        this.format_market_price = format_market_price;
        this.format_list_price = format_list_price;
        this.format_final_price = format_final_price;
        this.goods_commonid = goods_commonid;
        this.is_free = is_free;
        this.tax_price = tax_price;
        this.format_tax_price = format_tax_price;
        this.labelArray = labelArray;
        this.label_array = label_array;
        this.speciticationCnt = speciticationCnt;
        this.format_spec = format_spec;
        this.format_price = format_price;
        this.trailer_text = trailer_text;
        this.pre_goods_name = pre_goods_name;
        this.spec_value = spec_value;
        this.cart_qty = cart_qty;
        this.cart_id = cart_id;
        this.list_products_total = list_products_total;
        this.tax = tax;
        this.format_tax = format_tax;
        this.final_products_total = final_products_total;
        this.format_final_products_total = format_final_products_total;
        this.status = status;
        this.productsId = productsId;
        this.goods_link_name = goods_link_name;
        this.foramt_spec_value = foramt_spec_value;
        this.format_list_products_total = format_list_products_total;
        this.goods_name_pre = goods_name_pre;
        this.higher_limit = higher_limit;
        this.limit_msg = limit_msg;
        this.lower_limit = lower_limit;
        this.storage_label = storage_label;
        this.single_tax_price = single_tax_price;
        this.selected = selected;
        this.snap_up_label = snap_up_label;
        this.label_type = label_type;
        this.promotion_label = promotion_label;
        this.goods_jingle = goods_jingle;
        this.goods_sologan = goods_sologan;
        this.is_promotion = is_promotion;
        this.default_goods_id = default_goods_id;
        this.specifications = specifications;
        this.isChecked = isChecked;
        this.isDelCheck = isDelCheck;
        this.warehouseType = warehouseType;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_image_url() {
        return goods_image_url;
    }

    public void setGoods_image_url(String goods_image_url) {
        this.goods_image_url = goods_image_url;
    }

    public String getProducts_url() {
        return products_url;
    }

    public void setProducts_url(String products_url) {
        this.products_url = products_url;
    }

    public String getMarket_price() {
        return market_price;
    }

    public void setMarket_price(String market_price) {
        this.market_price = market_price;
    }

    public String getList_price() {
        return list_price;
    }

    public void setList_price(String list_price) {
        this.list_price = list_price;
    }

    public String getFinal_price() {
        return final_price;
    }

    public void setFinal_price(String final_price) {
        this.final_price = final_price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getPromotion_type() {
        return promotion_type;
    }

    public void setPromotion_type(String promotion_type) {
        this.promotion_type = promotion_type;
    }

    public String getGoods_state() {
        return goods_state;
    }

    public void setGoods_state(String goods_state) {
        this.goods_state = goods_state;
    }

    public String getFormat_promotion_type() {
        return format_promotion_type;
    }

    public void setFormat_promotion_type(String format_promotion_type) {
        this.format_promotion_type = format_promotion_type;
    }

    public String getFormat_market_price() {
        return format_market_price;
    }

    public void setFormat_market_price(String format_market_price) {
        this.format_market_price = format_market_price;
    }

    public String getFormat_list_price() {
        return format_list_price;
    }

    public void setFormat_list_price(String format_list_price) {
        this.format_list_price = format_list_price;
    }

    public String getFormat_final_price() {
        return format_final_price;
    }

    public void setFormat_final_price(String format_final_price) {
        this.format_final_price = format_final_price;
    }

    public String getGoods_commonid() {
        return goods_commonid;
    }

    public void setGoods_commonid(String goods_commonid) {
        this.goods_commonid = goods_commonid;
    }

    public String getIs_free() {
        return is_free;
    }

    public void setIs_free(String is_free) {
        this.is_free = is_free;
    }

    public double getTax_price() {
        return tax_price;
    }

    public void setTax_price(double tax_price) {
        this.tax_price = tax_price;
    }

    public String getFormat_tax_price() {
        return format_tax_price;
    }

    public void setFormat_tax_price(String format_tax_price) {
        this.format_tax_price = format_tax_price;
    }

    public ArrayList<String> getLabelArray() {
        return labelArray;
    }

    public void setLabelArray(ArrayList<String> labelArray) {
        this.labelArray = labelArray;
    }

    public ArrayList<String> getLabel_array() {
        return label_array;
    }

    public void setLabel_array(ArrayList<String> label_array) {
        this.label_array = label_array;
    }

    public int getSpeciticationCnt() {
        return speciticationCnt;
    }

    public void setSpeciticationCnt(int speciticationCnt) {
        this.speciticationCnt = speciticationCnt;
    }

    public String getFormat_spec() {
        return format_spec;
    }

    public void setFormat_spec(String format_spec) {
        this.format_spec = format_spec;
    }

    public String getFormat_price() {
        return format_price;
    }

    public void setFormat_price(String format_price) {
        this.format_price = format_price;
    }

    public String getTrailer_text() {
        return trailer_text;
    }

    public void setTrailer_text(String trailer_text) {
        this.trailer_text = trailer_text;
    }

    public String getPre_goods_name() {
        return pre_goods_name;
    }

    public void setPre_goods_name(String pre_goods_name) {
        this.pre_goods_name = pre_goods_name;
    }

    public String getSpec_value() {
        return spec_value;
    }

    public void setSpec_value(String spec_value) {
        this.spec_value = spec_value;
    }

    public String getCart_qty() {
        return cart_qty;
    }

    public void setCart_qty(String cart_qty) {
        this.cart_qty = cart_qty;
    }

    public String getCart_id() {
        return cart_id;
    }

    public void setCart_id(String cart_id) {
        this.cart_id = cart_id;
    }

    public int getList_products_total() {
        return list_products_total;
    }

    public void setList_products_total(int list_products_total) {
        this.list_products_total = list_products_total;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getFormat_tax() {
        return format_tax;
    }

    public void setFormat_tax(String format_tax) {
        this.format_tax = format_tax;
    }

    public double getFinal_products_total() {
        return final_products_total;
    }

    public void setFinal_products_total(double final_products_total) {
        this.final_products_total = final_products_total;
    }

    public String getFormat_final_products_total() {
        return format_final_products_total;
    }

    public void setFormat_final_products_total(String format_final_products_total) {
        this.format_final_products_total = format_final_products_total;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getProductsId() {
        return productsId;
    }

    public void setProductsId(String productsId) {
        this.productsId = productsId;
    }

    public String getGoods_link_name() {
        return goods_link_name;
    }

    public void setGoods_link_name(String goods_link_name) {
        this.goods_link_name = goods_link_name;
    }

    public String getForamt_spec_value() {
        return foramt_spec_value;
    }

    public void setForamt_spec_value(String foramt_spec_value) {
        this.foramt_spec_value = foramt_spec_value;
    }

    public String getFormat_list_products_total() {
        return format_list_products_total;
    }

    public void setFormat_list_products_total(String format_list_products_total) {
        this.format_list_products_total = format_list_products_total;
    }

    public String getGoods_name_pre() {
        return goods_name_pre;
    }

    public void setGoods_name_pre(String goods_name_pre) {
        this.goods_name_pre = goods_name_pre;
    }

    public int getHigher_limit() {
        return higher_limit;
    }

    public void setHigher_limit(int higher_limit) {
        this.higher_limit = higher_limit;
    }

    public int getLower_limit() {
        return lower_limit;
    }

    public void setLower_limit(int lower_limit) {
        this.lower_limit = lower_limit;
    }

    public String getStorage_label() {
        return storage_label;
    }

    public void setStorage_label(String storage_label) {
        this.storage_label = storage_label;
    }

    public String getSingle_tax_price() {
        return single_tax_price;
    }

    public void setSingle_tax_price(String single_tax_price) {
        this.single_tax_price = single_tax_price;
    }

    public int getSelected() {
        return selected;
    }

    public void setSelected(int selected) {
        this.selected = selected;
    }

    public String getSnap_up_label() {
        return snap_up_label;
    }

    public void setSnap_up_label(String snap_up_label) {
        this.snap_up_label = snap_up_label;
    }

    public String getLabel_type() {
        return label_type;
    }

    public void setLabel_type(String label_type) {
        this.label_type = label_type;
    }

    public String getPromotion_label() {
        return promotion_label;
    }

    public void setPromotion_label(String promotion_label) {
        this.promotion_label = promotion_label;
    }

    public String getGoods_jingle() {
        return goods_jingle;
    }

    public void setGoods_jingle(String goods_jingle) {
        this.goods_jingle = goods_jingle;
    }

    public String getGoods_sologan() {
        return goods_sologan;
    }

    public void setGoods_sologan(String goods_sologan) {
        this.goods_sologan = goods_sologan;
    }

    public String getIs_promotion() {
        return is_promotion;
    }

    public void setIs_promotion(String is_promotion) {
        this.is_promotion = is_promotion;
    }

    public String getDefault_goods_id() {
        return default_goods_id;
    }

    public void setDefault_goods_id(String default_goods_id) {
        this.default_goods_id = default_goods_id;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public String getLimit_msg() {
        return limit_msg;
    }

    public void setLimit_msg(String limit_msg) {
        this.limit_msg = limit_msg;
    }

    public boolean isDelCheck() {
        return isDelCheck;
    }

    public void setDelCheck(boolean delCheck) {
        isDelCheck = delCheck;
    }

    public int getWarehouseType() {
        return warehouseType;
    }

    public void setWarehouseType(int warehouseType) {
        this.warehouseType = warehouseType;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id='" + goods_id + '\'' +
                ", goods_name='" + goods_name + '\'' +
                ", goods_image_url='" + goods_image_url + '\'' +
                ", products_url='" + products_url + '\'' +
                ", market_price='" + market_price + '\'' +
                ", list_price='" + list_price + '\'' +
                ", final_price='" + final_price + '\'' +
                ", storage=" + storage +
                ", promotion_type='" + promotion_type + '\'' +
                ", goods_state='" + goods_state + '\'' +
                ", format_promotion_type='" + format_promotion_type + '\'' +
                ", format_market_price='" + format_market_price + '\'' +
                ", format_list_price='" + format_list_price + '\'' +
                ", format_final_price='" + format_final_price + '\'' +
                ", goods_commonid='" + goods_commonid + '\'' +
                ", is_free='" + is_free + '\'' +
                ", tax_price=" + tax_price +
                ", format_tax_price='" + format_tax_price + '\'' +
                ", labelArray=" + labelArray +
                ", label_array=" + label_array +
                ", speciticationCnt=" + speciticationCnt +
                ", format_spec='" + format_spec + '\'' +
                ", format_price='" + format_price + '\'' +
                ", trailer_text='" + trailer_text + '\'' +
                ", pre_goods_name='" + pre_goods_name + '\'' +
                ", spec_value='" + spec_value + '\'' +
                ", cart_qty='" + cart_qty + '\'' +
                ", cart_id='" + cart_id + '\'' +
                ", list_products_total=" + list_products_total +
                ", tax=" + tax +
                ", format_tax='" + format_tax + '\'' +
                ", final_products_total=" + final_products_total +
                ", format_final_products_total='" + format_final_products_total + '\'' +
                ", status=" + status +
                ", productsId='" + productsId + '\'' +
                ", goods_link_name='" + goods_link_name + '\'' +
                ", foramt_spec_value='" + foramt_spec_value + '\'' +
                ", format_list_products_total='" + format_list_products_total + '\'' +
                ", goods_name_pre='" + goods_name_pre + '\'' +
                ", higher_limit=" + higher_limit +
                ", limit_msg='" + limit_msg + '\'' +
                ", lower_limit=" + lower_limit +
                ", storage_label='" + storage_label + '\'' +
                ", single_tax_price='" + single_tax_price + '\'' +
                ", selected=" + selected +
                ", snap_up_label='" + snap_up_label + '\'' +
                ", label_type='" + label_type + '\'' +
                ", promotion_label='" + promotion_label + '\'' +
                ", goods_jingle='" + goods_jingle + '\'' +
                ", goods_sologan='" + goods_sologan + '\'' +
                ", is_promotion='" + is_promotion + '\'' +
                ", default_goods_id='" + default_goods_id + '\'' +
                ", specifications='" + specifications + '\'' +
                ", isChecked=" + isChecked +
                ", isDelCheck=" + isDelCheck +
                ", warehouseType='" + warehouseType + '\'' +
                '}';
    }
}
