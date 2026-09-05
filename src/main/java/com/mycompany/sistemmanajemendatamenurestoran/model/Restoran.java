package com.mycompany.sistemmanajemendatamenurestoran.model;

import java.util.ArrayList;

public class Restoran {

    private String namaRestoran;
    private String alamat;
    private String noTelepon;

    private ArrayList<Menu> daftarMenu;
    private ArrayList<Kategori> daftarKategori;

    public Restoran(String namaRestoran, String alamat, String noTelepon) {
        this.namaRestoran = namaRestoran;
        this.alamat = alamat;
        this.noTelepon = noTelepon;

        daftarMenu = new ArrayList<>();
        daftarKategori = new ArrayList<>();
    }

    public String getNamaRestoran() {
        return namaRestoran;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public ArrayList<Menu> getDaftarMenu() {
        return daftarMenu;
    }

    public ArrayList<Kategori> getDaftarKategori() {
        return daftarKategori;
    }

    public void setNamaRestoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public void tambahKategori(Kategori kategori) {
        daftarKategori.add(kategori);
    }
}