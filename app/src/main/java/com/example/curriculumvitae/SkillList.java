package com.example.curriculumvitae;

public class SkillList {
    String namaSkill;
    int gambar;

    public SkillList(String namaSkill, int gambar) {
        this.namaSkill = namaSkill;
        this.gambar = gambar;
    }

    public String getNamaSkill() {
        return namaSkill;
    }

    public void setNamaSkill(String namaSkill) {
        this.namaSkill = namaSkill;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
