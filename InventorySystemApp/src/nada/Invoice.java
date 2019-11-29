package nada;

import java.util.ArrayList;

public class Invoice {
    private int id;
    private ArrayList<String> buyedProducts;
    private float total_price;
    private String clientName;

    public float gettotal_price() {
        return this.total_price;
    }
    public void settotal_price(float total_price) {
        this.total_price = total_price;
    }
    public int getid() {
        return this.id;
    }
    public void setid(int id) {
        this.id = id;
    }
    public String getclientName() {
        return this. clientName;
    }
    public void setclientName   (String clientName) {

        this.clientName = clientName;
    }
    public ArrayList<String> getbuyedProducts() {
        return this.buyedProducts;
    }
    public void setbuyedProducts(ArrayList<String> buyedProducts) {
        this.buyedProducts = buyedProducts;
    }
}
