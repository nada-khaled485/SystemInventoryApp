package nada;
import java.util.ArrayList; // import the ArrayList class
public class Cart {

    private ArrayList<String> buyedProducts;


    public ArrayList<String> getbuyedProductList() {
        return this.buyedProducts;
    }

    public void addProduct(String Products ){
        this.buyedProducts.add(Products);
    }
    public void removeProduct(String Products){
        this.buyedProducts.remove(Products);
    }
    public void increaseProduct(String Products){


        this.buyedProducts.add(Products);
    }

}
