package shop;

import instruments.ISell;

import java.util.ArrayList;


public class Shop {

   private ArrayList<ISell> stock;


    public Shop() {
        this.stock = new ArrayList<>();
    }

    public int getStock() {
        return stock.size();
    }

    public void addStock(ISell item) {
        this.stock.add(item);
    }

    public void selectStock(ISell item) {
        stock.get(item);
    }
}
