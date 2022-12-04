package GPS;

public class GPSProgrami {

    private String konumVerisi;
    private String enlemDegeri = "";
    private String boylamDegeri = "";

    public void setKonumVerisi(String konumVerisi) {
        this.konumVerisi = konumVerisi;
    }

    public String getKonumVerisi() {
        return konumVerisi;
    }

    public void setEnlemDegeri(String enlemDegeri) {
        this.enlemDegeri = enlemDegeri;
    }

    public String getEnlemDegeri() {
        return enlemDegeri;
    }

    public void setBoylamDegeri(String boylamDegeri) {
        this.boylamDegeri = boylamDegeri;
    }

    public String getBoylamDegeri() {
        return boylamDegeri;
    }

    public GPSProgrami(GPSAlicisi gA) {
        konumBilgisi(gA.programaVeriGonder());
    }

    private void konumBilgisi(String konumVeri) {

        setKonumVerisi(konumVeri);
        String gpsTur = getKonumVerisi().substring(0, getKonumVerisi().indexOf(","));

        System.out.println("Gps türü : " + gpsTur);
        int count = 0;

        if (getKonumVerisi().contains("N")) {
            System.out.print("Kuzey - ");
        } else {
            System.out.print("Güney - ");
        }

        if (getKonumVerisi().contains("W")) {
            System.out.println("Batı");
        } else {
            System.out.println("Doğu");
        }

        for (int i = 0; i < getKonumVerisi().length(); i++) {

            if (Character.isDigit(getKonumVerisi().charAt(i))) {
                count++;

                if (count <= 2) {
                    setEnlemDegeri(getEnlemDegeri() + getKonumVerisi().charAt(i));
                } else {
                    setBoylamDegeri(getBoylamDegeri() + getKonumVerisi().charAt(i));
                }
            }
        }

        System.out.println("Enlem değeri : " + getEnlemDegeri());
        System.out.println("Boylam değeri : " + getBoylamDegeri());

    }

}
