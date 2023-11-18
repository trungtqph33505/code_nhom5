package com.example.duan1_qt;

public class ClothingItem {
    private int imageResource;
    private String name;
    private String price;
    private String description; // Thêm trường mô tả sản phẩm


    public ClothingItem(int imageResource, String name, String price) {
        this.imageResource = imageResource;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}

