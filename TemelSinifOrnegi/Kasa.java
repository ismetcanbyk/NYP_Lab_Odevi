package TemelSinifOrnegi;
public class Kasa {
    private String name;
    private double topSatis = 0;
    private double gunlukKar = 0;
    private double salataKar;
    private int tatliSayisi;
    private int salataSayisi;

    Kasa(String name) {
        this.name = name;
        System.out.println("\n\t----HOŞ GELDİN "+this.name.toUpperCase()+" ----");
    }

    Kasa() {
        System.out.println("\n\t------HOŞ GELDİN------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public double getTopSatis() {
        return topSatis;
    }

    public void setTopSatis(double topSatis) {
        this.topSatis = topSatis;
    }

    public double getGunlukKar() {
        return gunlukKar;
    }

    public void setGunlukKar(double gunlukKar) {
        this.gunlukKar = gunlukKar;
    }

    public double getSalataKar() {
        return salataKar;
    }

    public void setSalataKar(double salataKar) {
        this.salataKar = salataKar;
    }

    public int getTatliSayisi() {
        return tatliSayisi;
    }

    public void setTatliSayisi(int tatliSayisi) {
        this.tatliSayisi = tatliSayisi;
    }

    public int getSalataSayisi() {
        return salataSayisi;
    }

    public void setSalataSayisi(int salataSayisi) {
        this.salataSayisi = salataSayisi;
    }




    public void hesapla(int secim, double fiyat) {
        topSatHesapla(fiyat);
        gunlukKrHesapla(secim, fiyat);
    }
    
    
    private void topSatHesapla(double fiyat) {
        setTopSatis(getTopSatis()+fiyat);
    }


    // 1	Salata	    %30
    // 2	Hamburger	%25
    // 3	Pizza	    %35
    // 4	Tatlı	    %20


    private void gunlukKrHesapla(int secim, double fiyat) {
        switch (secim) {
            case 1:
            salataKari(fiyat*0.3);
            setGunlukKar(getGunlukKar()+fiyat*0.3);
                break;
            case 2:
            setGunlukKar(getGunlukKar()+fiyat*0.25);
                break;
            case 3:
            setGunlukKar(getGunlukKar()+fiyat*0.35);
                break;
            case 4:
            tatliSayisiArttir();
            setGunlukKar(getGunlukKar()+fiyat*0.2);
                break;
            case 5:
            System.exit(0);
                break;
            
            default:
                break;
        }
    }

    private void salataKari(double kar) {
        setSalataKar(getSalataKar()+kar);
    }

    private void tatliSayisiArttir() {
        setTatliSayisi(getTatliSayisi()+1);
    }

    public void fisYazdir() {
        System.out.println("\t------- Bilgi Fişi -------");
        System.out.println("Toplam satış miktarı : " + getTopSatis());
        System.out.println("Günlük kar miktarı : " + getGunlukKar());
        System.out.println("Salata karı : "+getSalataKar());
        System.out.println("Tatlı sayısı : " + getTatliSayisi());
    }

}
