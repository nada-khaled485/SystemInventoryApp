package nada;
public class Buyed_product{
    private String product_name;
    private String product_category;
    private float product_price;
    private float total_price;
    private int quantity ;
    public String getProduct_name () {
        return this.product_name;
    }
    public String getProduct_category (){
        return this.product_category;
    }
    public float getProduct_price () {
        return this.product_price;
    }
    public float getTotal_price () {
        return this.total_price;
    }
    public int getQuantity () {
        return this.quantity;
    }
    public void setProduct_name(String productname) {
        this.product_name = productname;
    }
    public void setProduct_category(String productcategory) {
        this.product_category=productcategory;
    }
    public void setProduct_price(float productPrice) {
        this.product_price = productPrice;
    }
    public void setquantity(int numquantity) {
        this.quantity = numquantity;
    }


    public void  increase_quantity(int quantity){
        this.quantity ++;
    }
    public void delete_quantity(int quantity){
        this.quantity --;
    }
    public float calulate_total_price(int quantity,float product_price){
        this.total_price=quantity*product_price;
        return total_price;
    }
}
