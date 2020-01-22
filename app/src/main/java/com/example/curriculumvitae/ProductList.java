package com.example.curriculumvitae;

public class ProductList {
    String namaProduct,tahunProduct;
    int gambarProduct;

    public ProductList(String namaProduct, String tahunProduct, int gambarProduct) {
        this.namaProduct = namaProduct;
        this.tahunProduct = tahunProduct;
        this.gambarProduct = gambarProduct;
    }

    public String getNamaProduct() {
        return namaProduct;
    }

    public void setNamaProduct(String namaProduct) {
        this.namaProduct = namaProduct;
    }

    public String getTahunProduct() {
        return tahunProduct;
    }

    public void setTahunProduct(String tahunProduct) {
        this.tahunProduct = tahunProduct;
    }

    public int getGambarProduct() {
        return gambarProduct;
    }

    public void setGambarProduct(int gambarProduct) {
        this.gambarProduct = gambarProduct;
    }
}
