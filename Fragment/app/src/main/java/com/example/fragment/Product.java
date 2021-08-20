package com.example.fragment;
public class Product {
    private String number;
    private int imageId;
    private String name;
    public Product(String number,int imageId,String name){
        this.number=number;
        this.imageId=imageId;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number =number;
    }

}