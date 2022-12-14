package OgrenciSistemi;

public abstract class Student {
    private int ogrenciNo;
    private String ogrenciAd;
    private String ogrenciSoyad;
    private int entryDate;
    private String fakulte;
    private String bolum;

    public Student(String ogrenciAd, String ogrenciSoyad, int entryDate, String fakulte) {
        this.ogrenciAd = ogrenciAd;
        this.ogrenciSoyad = ogrenciSoyad;
        this.entryDate = entryDate;
        this.fakulte = fakulte;
    }

    public abstract String createStudentNum();
    public abstract void detail();

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public String getOgrenciAd() {
        return ogrenciAd;
    }
    
    public String getOgrenciSoyad() {
        return ogrenciSoyad;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getFakulte() {
        return fakulte;
    }

    public int getEntryDate() {
        return entryDate;
    }

}
