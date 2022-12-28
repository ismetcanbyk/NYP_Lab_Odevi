package OgrenciSistemi;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Yazilim> yzlm = new ArrayList<>();
    static ArrayList<Mekatronik> mek = new ArrayList<>();
    static ArrayList<Makine> makine = new ArrayList<>();
    static ArrayList<Enerji> enerji = new ArrayList<>();
    static ArrayList<Elektrik> elektrik = new ArrayList<>();

    public static void main(String[] args) {

        Yazilim y1 = new Yazilim("İsmet", "Bıyık", 2021, "hfttf");
        Yazilim y2 = new Yazilim("Can", "Bıyık", 2020, "hfttf");
        Mekatronik m = new Mekatronik("Ahmet", "Yılmaz", 2019, "hfttf");
        Enerji e1 = new Enerji("Furkan", "Aslan", 2017, "hfttf");
        Makine mak1 = new Makine("Alperen", "Öz", 2018, "hfttf");
        Makine mak2 = new Makine("Elif", "Yılmazer", 2020, "hfttf");

        yzlm.add(y1);
        yzlm.add(y2);
        mek.add(m);
        enerji.add(e1);
        makine.add(mak1);
        makine.add(mak2);

        menu();
    }

    public static void menu() {
        System.out.println("\t\t------Öğrenci Bilgi Sistemi------");
        System.out.println("\n1)Yazılım Mühendisliği bölümüne öğrenci ekleme. ");
        System.out.println("2)Mekatronik Mühendisliği bölümüne öğrenci ekleme. ");
        System.out.println("3)Makine Mühendisliği bölümüne öğrenci ekleme. ");
        System.out.println("4)Enerji Sistemleri Mühendisliği bölümüne öğrenci ekleme. ");
        System.out.println("5)Elektrik Mühendisliği bölümüne öğrenci ekleme. ");
        System.out.println("6)Öğrencileri listeleme. ");
        System.out.println("0)Çıkış ");
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        select();
    }

    public static void select() {
        String ad;
        String soyad;
        int date;
        String fakulte;
        Scanner inp = new Scanner(System.in);
        switch (inp.nextInt()) {
            case 1:
                System.out.print("Öğrencinin adı : ");
                ad = inp.next();
                System.out.print("Öğrencinin soyadı : ");
                soyad = inp.next();
                System.out.print("Öğrencinin giriş tarihi : ");
                date = inp.nextInt();
                System.out.print("Fakülte girin : ");
                fakulte = inp.next();
                yzlm.add(new Yazilim(ad, soyad, date, fakulte));
                menu();
                break;
            case 2:
                System.out.print("Öğrencinin adı : ");
                ad = inp.next();
                System.out.print("Öğrencinin soyadı : ");
                soyad = inp.next();
                System.out.print("Öğrencinin giriş tarihi : ");
                date = inp.nextInt();
                System.out.print("Fakülte girin : ");
                fakulte = inp.next();
                mek.add(new Mekatronik(ad, soyad, date, fakulte));
                menu();
                break;
            case 3:
                System.out.print("Öğrencinin adı : ");
                ad = inp.next();
                System.out.print("Öğrencinin soyadı : ");
                soyad = inp.next();
                System.out.print("Öğrencinin giriş tarihi : ");
                date = inp.nextInt();
                System.out.print("Fakülte girin : ");
                fakulte = inp.next();
                makine.add(new Makine(ad, soyad, date, fakulte));
                menu();
                break;
            case 4:
                System.out.print("Öğrencinin adı : ");
                ad = inp.next();
                System.out.print("Öğrencinin soyadı : ");
                soyad = inp.next();
                System.out.print("Öğrencinin giriş tarihi : ");
                date = inp.nextInt();
                System.out.print("Fakülte girin : ");
                fakulte = inp.next();
                enerji.add(new Enerji(ad, soyad, date, fakulte));
                menu();
                break;
            case 5:
                System.out.print("Öğrencinin adı : ");
                ad = inp.next();
                System.out.print("Öğrencinin soyadı : ");
                soyad = inp.next();
                System.out.print("Öğrencinin giriş tarihi : ");
                date = inp.nextInt();
                System.out.print("Fakülte girin : ");
                fakulte = inp.next();
                elektrik.add(new Elektrik(ad, soyad, date, fakulte));
                menu();
                break;
            case 6:
                System.out.println("\t\t------Bölümler------");
                System.out.println("1)Yazılım Mühendisliği " + "\t\t\t\t" + yzlm.size() + " öğrenci bulunmakta");
                System.out.println("2)Mekatronik Mühendisliği " + "\t\t\t" + mek.size() + " öğrenci bulunmakta");
                System.out.println("3)Makine Mühendisliği " + "\t\t\t\t" + makine.size() + " öğrenci bulunmakta");
                System.out
                        .println("4)Enerji Sistemleri Mühendisliği " + "\t\t" + enerji.size() + " öğrenci bulunmakta");
                System.out.println("5)Elektrik Mühendisliği " + "\t\t\t" + elektrik.size() + " öğrenci bulunmakta");
                System.out.println("6)Bütün bölümler" + "\t\t\t\t"
                        + (yzlm.size() + mek.size() + makine.size() + enerji.size() + elektrik.size())
                        + " öğrenci bulunmakta");
                System.out.println("7)Menü");
                System.out.print("Listelemek istediğiniz bölümü girin : ");
                int sec = inp.nextInt();
                print(sec);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Yanlış giriş");
                break;

        }
    }

    public static void print(int a) {
        Scanner inp = new Scanner(System.in);

        switch (a) {
            case 1:
                System.out.println("\n\t\t-----Yazılım Mühendisliği-----");
                for (Yazilim yazilim : yzlm) {
                    System.out.println("Öğrencinin ismi :" + yazilim.getOgrenciAd() + " " + yazilim.getOgrenciSoyad()
                            + "\tGiriş tarihi : " + yazilim.getEntryDate() + "\tÖğrenci numarası : "
                            + yazilim.hashCode() + "\tFakülte : " + yazilim.getFakulte());
                }
                System.out.println("\nMenüye gitmek için 1 e basın");
                switch (inp.nextInt()) {
                    case 1:
                        menu();
                        break;
                    default:
                        break;
                }

                break;
            case 2:
                System.out.println("\n\t\t-----Mekatronik Mühendisliği-----");
                for (Mekatronik yazilim : mek) {
                    System.out.println("Öğrencinin ismi :" + yazilim.getOgrenciAd() + " " + yazilim.getOgrenciSoyad()
                            + "\tGiriş tarihi : " + yazilim.getEntryDate() + "\tÖğrenci numarası : "
                            + yazilim.hashCode() + "\tFakülte : " + yazilim.getFakulte());
                }
                System.out.println("\nMenüye gitmek için 1 e basın");
                switch (inp.nextInt()) {
                    case 1:
                        menu();
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                System.out.println("\n\t\t-----Makine Mühendisliği-----");
                for (Makine yazilim : makine) {
                    System.out.println("Öğrencinin ismi :" + yazilim.getOgrenciAd() + " " + yazilim.getOgrenciSoyad()
                            + "\tGiriş tarihi : " + yazilim.getEntryDate() + "\tÖğrenci numarası : "
                            + yazilim.hashCode() + "\tFakülte : " + yazilim.getFakulte());
                }
                System.out.println("\nMenüye gitmek için 1 e basın");
                switch (inp.nextInt()) {
                    case 1:
                        menu();
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                System.out.println("\n\t\t-----Enerji Sistemleri Mühendisliği-----");
                for (Enerji yazilim : enerji) {
                    System.out.println("Öğrencinin ismi :" + yazilim.getOgrenciAd() + " " + yazilim.getOgrenciSoyad()
                            + "\tGiriş tarihi : " + yazilim.getEntryDate() + "\tÖğrenci numarası : "
                            + yazilim.hashCode() + "\tFakülte : " + yazilim.getFakulte());
                }
                System.out.println("\nMenüye gitmek için 1 e basın");
                switch (inp.nextInt()) {
                    case 1:
                        menu();
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                System.out.println("\n\t\t-----Elektrik Mühendisliği-----");
                for (Elektrik yazilim : elektrik) {
                    System.out.println("Öğrencinin ismi :" + yazilim.getOgrenciAd() + " " + yazilim.getOgrenciSoyad()
                            + "\tGiriş tarihi : " + yazilim.getEntryDate() + "\tÖğrenci numarası : "
                            + yazilim.hashCode() + "\tFakülte : " + yazilim.getFakulte());
                }
                System.out.println("\nMenüye gitmek için 1 e basın");
                switch (inp.nextInt()) {
                    case 1:
                        menu();
                        break;
                    default:
                        break;
                }
                break;
            case 6:
                System.out.println("\n\t\t------Bütün bölümler------\n");
                System.out.println("\t\t-----Yazılım Mühendisliği-----");
                for (Yazilim yazilim : yzlm) {
                    System.out.println("Öğrencinin ismi :" + yazilim.getOgrenciAd() + " " + yazilim.getOgrenciSoyad()
                            + "\tGiriş tarihi : " + yazilim.getEntryDate() + "\tÖğrenci numarası : "
                            + yazilim.hashCode() + "\tFakülte : " + yazilim.getFakulte());
                }
                System.out.println("\n\t\t-----Mekatronik Mühendisliği-----");
                for (Mekatronik yazilim : mek) {
                    System.out.println("Öğrencinin ismi :" + yazilim.getOgrenciAd() + " " + yazilim.getOgrenciSoyad()
                            + "\tGiriş tarihi : " + yazilim.getEntryDate() + "\tÖğrenci numarası : "
                            + yazilim.hashCode() + "\tFakülte : " + yazilim.getFakulte());
                }
                System.out.println("\n\t\t-----Makine Mühendisliği-----");
                for (Makine yazilim : makine) {
                    System.out.println("Öğrencinin ismi :" + yazilim.getOgrenciAd() + " " + yazilim.getOgrenciSoyad()
                            + "\tGiriş tarihi : " + yazilim.getEntryDate() + "\tÖğrenci numarası : "
                            + yazilim.hashCode() + "\tFakülte : " + yazilim.getFakulte());
                }
                System.out.println("\n\t\t-----Enerji Sistemleri Mühendisliği-----");
                for (Enerji yazilim : enerji) {
                    System.out.println("Öğrencinin ismi :" + yazilim.getOgrenciAd() + " " + yazilim.getOgrenciSoyad()
                            + "\tGiriş tarihi : " + yazilim.getEntryDate() + "\tÖğrenci numarası : "
                            + yazilim.hashCode() + "\tFakülte : " + yazilim.getFakulte());
                }
                System.out.println("\n\t\t-----Elektrik Mühendisliği-----");
                for (Elektrik yazilim : elektrik) {
                    System.out.println("Öğrencinin ismi :" + yazilim.getOgrenciAd() + " " + yazilim.getOgrenciSoyad()
                            + "\tGiriş tarihi : " + yazilim.getEntryDate() + "\tÖğrenci numarası : "
                            + yazilim.hashCode() + "\tFakülte : " + yazilim.getFakulte());
                }
                System.out.println("\nMenüye gitmek için 1 e basın");
                switch (inp.nextInt()) {
                    case 1:
                        menu();
                        break;
                    default:
                        break;
                }
                break;
            case 7:
                menu();
                break;

            default:
                System.out.println("Hatalı giriş");
                break;
        }
    }

}
