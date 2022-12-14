package OgrenciSistemi;

import java.util.Random;

public class Yazilim extends Student {

    public Yazilim(String ogrenciAd, String ogrenciSoyad, int entryDate, String fakulte) {
        super(ogrenciAd, ogrenciSoyad, entryDate, fakulte);
        setBolum("Yazılım Mühendisliği");
    }

    @Override
    public String createStudentNum() {
        String stdNum ;
        int rnd = (int) (Math.random()*1000);
        stdNum = getEntryDate()+"12"+rnd;
       
        return stdNum;
    }

    @Override
    public void detail() {
       System.out.println("\t-----Öğrenci Detay-----");
       System.out.println("Öğrencinin adı : " + getOgrenciAd());
       System.out.println("Öğrencinin soyadı : "+getOgrenciSoyad());
       System.out.println("Öğrenci numarası : "+createStudentNum());
       System.out.println("Fakülte : "+getFakulte());
       System.out.println("Bölüm : "+getBolum());
       System.out.println("Giriş tarihi : "+getEntryDate());

        
    }
    
}
