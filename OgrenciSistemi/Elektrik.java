package OgrenciSistemi;

public class Elektrik extends Student {

    public Elektrik(String ogrenciAd, String ogrenciSoyad, int entryDate, String fakulte) {
        super(ogrenciAd, ogrenciSoyad, entryDate, fakulte);
        setBolum("Elektrik Mühendisliği");
    }

    @Override
    public String createStudentNum() {
        int a = getOgrenciAd().hashCode();
        int b = getOgrenciSoyad().hashCode();
        if (getOgrenciSoyad().hashCode() < 0) {
            b = -1 * b;
        }
        if (getOgrenciAd().hashCode() < 0) {
            a = -1 * a;
        }
        String stdNum = a + "" + b;
        return stdNum;
    }

    @Override
    public void detail() {
        System.out.println("\t-----Öğrenci Detay-----");
        System.out.println("Öğrencinin adı : " + getOgrenciAd());
        System.out.println("Öğrencinin soyadı : " + getOgrenciSoyad());
        System.out.println("Öğrenci numarası : " + createStudentNum());
        System.out.println("Fakülte : " + getFakulte());
        System.out.println("Bölüm : " + getBolum());
        System.out.println("Giriş tarihi : " + getEntryDate());
    }

}
