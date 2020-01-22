package com.example.curriculumvitae;

public class OrganisasiList {
    String namaOrganisasi,jenisOrganisasi,tahunOrganisasi;
    int gambar;

    public OrganisasiList(String namaOrganisasi, String jenisOrganisasi, String tahunOrganisasi, int gambar) {
        this.namaOrganisasi = namaOrganisasi;
        this.jenisOrganisasi = jenisOrganisasi;
        this.tahunOrganisasi = tahunOrganisasi;
        this.gambar = gambar;
    }

    public String getNamaOrganisasi() {
        return namaOrganisasi;
    }

    public void setNamaOrganisasi(String namaOrganisasi) {
        this.namaOrganisasi = namaOrganisasi;
    }

    public String getJenisOrganisasi() {
        return jenisOrganisasi;
    }

    public void setJenisOrganisasi(String jenisOrganisasi) {
        this.jenisOrganisasi = jenisOrganisasi;
    }

    public String getTahunOrganisasi() {
        return tahunOrganisasi;
    }

    public void setTahunOrganisasi(String tahunOrganisasi) {
        this.tahunOrganisasi = tahunOrganisasi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
