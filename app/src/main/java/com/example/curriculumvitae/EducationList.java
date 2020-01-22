package com.example.curriculumvitae;

public class EducationList {
    String namaEduction,jenisEducation,tahunEducation;
    int gambar;

    public EducationList(String namaEduction, String jenisEducation, String tahunEducation, int gambar) {
        this.namaEduction = namaEduction;
        this.jenisEducation = jenisEducation;
        this.tahunEducation = tahunEducation;
        this.gambar = gambar;
    }

    public String getNamaEduction() {
        return namaEduction;
    }

    public void setNamaEduction(String namaEduction) {
        this.namaEduction = namaEduction;
    }

    public String getJenisEducation() {
        return jenisEducation;
    }

    public void setJenisEducation(String jenisEducation) {
        this.jenisEducation = jenisEducation;
    }

    public String getTahunEducation() {
        return tahunEducation;
    }

    public void setTahunEducation(String tahunEducation) {
        this.tahunEducation = tahunEducation;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
