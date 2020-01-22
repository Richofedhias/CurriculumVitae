package com.example.curriculumvitae;

public class ProductList {
    String namaProduct,tahunProduct,jenisProduct;
    int gambarProduct;

    public ProductList(String namaProduct, String tahunProduct, String jenisProduct, int gambarProduct) {
        this.namaProduct = namaProduct;
        this.tahunProduct = tahunProduct;
        this.jenisProduct = jenisProduct;
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

    public String getJenisProduct() {
        return jenisProduct;
    }

    public void setJenisProduct(String jenisProduct) {
        this.jenisProduct = jenisProduct;
    }

    public int getGambarProduct() {
        return gambarProduct;
    }

    public void setGambarProduct(int gambarProduct) {
        this.gambarProduct = gambarProduct;
    }
}
