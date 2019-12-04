package com.example.realtech;

public class Item {
    private int image;
    private int price=0;
    private String title;
    private String description;
    private int mount=0;
    private int total=0;
    public Item(int image, int price, String title, String description){
        this.image=image;
        this.price=price;
        this.title=title;
        this.description=description;
        mount=1;
        this.total=price*this.mount;
    }


    public int getImage() {
        return image;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getMount() {
        return mount;
    }

    public int getTotal() {
        return total;
    }

    public void addMount() {
        mount++;
    }

    public void setTotal(int total) {
        this.total=total;
    }
}
