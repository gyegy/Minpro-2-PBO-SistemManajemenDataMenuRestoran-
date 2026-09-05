package com.mycompany.sistemmanajemendatamenurestoran;

import com.mycompany.sistemmanajemendatamenurestoran.model.Kategori;
import com.mycompany.sistemmanajemendatamenurestoran.model.Menu;
import com.mycompany.sistemmanajemendatamenurestoran.model.Restoran;
import java.util.Scanner;

public class SistemManajemenDataMenuRestoran {

    public static void main(String[] args) {

        Restoran restoran = new Restoran(
                "Restoran Egiluy Sukses Dunia Akhirat Aamiin",
                "Jl. Alip Gelap Karena Lagi Malam",
                "081234567890"
        );

        Scanner scanner = new Scanner(System.in);

        boolean berjalan = true;

        while (berjalan) {

            System.out.println("\n=== SISTEM MANAJEMEN MENU RESTORAN ===");
            System.out.println("1. Tambah Kategori");
            System.out.println("2. Tampilkan Kategori");
            System.out.println("3. Tambah Menu");
            System.out.println("4. Tampilkan Menu");
            System.out.println("5. Update Menu");
            System.out.println("6. Hapus Menu");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu (1-7): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {

                case 1 -> {
                    System.out.print("ID Kategori: ");
                    String idKategori = scanner.nextLine();

                    System.out.print("Nama Kategori: ");
                    String namaKategori = scanner.nextLine();

                    System.out.print("Deskripsi: ");
                    String deskripsi = scanner.nextLine();

                    Kategori kategoriBaru = new Kategori(
                            idKategori,
                            namaKategori,
                            deskripsi
                    );

                    restoran.tambahKategori(kategoriBaru);

                    System.out.println(
                            ">> Kategori berhasil ditambahkan"
                    );
                }

                case 2 -> {
                    System.out.println("\n=== DAFTAR KATEGORI ===");

                    for (int i = 0;
                            i < restoran.getDaftarKategori().size();
                            i++) {

                        Kategori k =
                                restoran.getDaftarKategori().get(i);

                        System.out.println(
                                "ID Kategori : "
                                + k.getIdKategori()
                        );

                        System.out.println(
                                "Nama        : "
                                + k.getNamaKategori()
                        );

                        System.out.println(
                                "Deskripsi   : "
                                + k.getDeskripsi()
                        );

                        System.out.println();
                    }
                }

                case 3 -> {
                    System.out.print("ID Menu: ");
                    String idMenu = scanner.nextLine();

                    System.out.print("Nama Menu: ");
                    String namaMenu = scanner.nextLine();

                    System.out.println("\n=== PILIH KATEGORI ===");

                    for (int i = 0;
                            i < restoran.getDaftarKategori().size();
                            i++) {

                        Kategori k =
                                restoran.getDaftarKategori().get(i);

                        System.out.println(
                                k.getIdKategori()
                                + " - "
                                + k.getNamaKategori()
                        );
                    }

                    System.out.print("ID Kategori: ");
                    String idKategori = scanner.nextLine();

                    Kategori kategoriDipilih = null;

                    for (Kategori k
                            : restoran.getDaftarKategori()) {

                        if (k.getIdKategori()
                                .equals(idKategori)) {

                            kategoriDipilih = k;
                            break;
                        }
                    }

                    if (kategoriDipilih == null) {
                        System.out.println(
                                ">> Kategori tidak ditemukan"
                        );
                        break;
                    }

                    System.out.print("Harga Menu: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine();

                    Menu menuBaru = new Menu(
                            idMenu,
                            namaMenu,
                            kategoriDipilih,
                            harga
                    );

                    restoran.tambahMenu(menuBaru);

                    System.out.println(
                            ">> Menu berhasil ditambahkan"
                    );
                }

                case 4 -> {
                    System.out.println("\n=== DAFTAR MENU ===");

                    for (int i = 0;
                            i < restoran.getDaftarMenu().size();
                            i++) {

                        Menu m =
                                restoran.getDaftarMenu().get(i);

                        System.out.println(
                                "ID Menu  : "
                                + m.getIdMenu()
                        );

                        System.out.println(
                                "Nama     : "
                                + m.getNamaMenu()
                        );

                        System.out.println(
                                "Kategori : "
                                + m.getKategori().getNamaKategori()
                        );

                        System.out.println(
                                "Harga    : Rp"
                                + m.getHarga()
                        );

                        System.out.println();
                    }
                }

                case 5 -> {
                    System.out.print("Masukkan ID Menu: ");
                    String idTarget = scanner.nextLine();

                    for (Menu m
                            : restoran.getDaftarMenu()) {

                        if (m.getIdMenu()
                                .equals(idTarget)) {

                            System.out.print("Nama Menu Baru: ");
                            String namaBaru =
                                    scanner.nextLine();

                            System.out.print("Harga Baru: ");
                            double hargaBaru =
                                    scanner.nextDouble();
                            scanner.nextLine();

                            m.setNamaMenu(namaBaru);
                            m.setHarga(hargaBaru);

                            System.out.println(
                                    ">> Menu berhasil diperbarui"
                            );

                            break;
                        }
                    }
                }

                case 6 -> {
                    System.out.print("Masukkan ID Menu: ");
                    String idTarget = scanner.nextLine();

                    for (Menu m
                            : restoran.getDaftarMenu()) {

                        if (m.getIdMenu()
                                .equals(idTarget)) {

                            restoran.getDaftarMenu().remove(m);

                            System.out.println(
                                    ">> Menu berhasil dihapus"
                            );

                            break;
                        }
                    }
                }

                case 7 -> {
                    berjalan = false;
                }

                default -> {
                    System.out.println(
                            "Pilihan tidak valid"
                    );
                }
            }
        }

        scanner.close();
    }
}