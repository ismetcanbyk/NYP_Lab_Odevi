package GPS;


public class GPSAlicisi {
    private int Sicaklik;
    public boolean isActive;
    private String gpsValue;

    public GPSAlicisi(){
        setSicaklik(sicaklikOlc());
        if(getSicaklik() >= 5 && getSicaklik() <= 40){
            isActive = true;
        }else{
            isActive = false;
        }
    }

    public int getSicaklik() {
        return Sicaklik;
    }

    public void setSicaklik(int sicaklik) {
        Sicaklik = sicaklik;
    }

    public String getGpsValue() {
        return gpsValue;
    }

    public void setGpsValue(String gpsValue) {
        this.gpsValue = gpsValue;
    }

    private int sicaklikOlc(){
        
        int randomNum = (int)(Math.random()*40);
        while(randomNum == 0){
            randomNum = (int)(Math.random()*40);
        }
        return randomNum;
    }

    public void uydudanVeriAl(int cumleCesidi){
        switch (cumleCesidi) {
            case 1:
                
                break;
        
            default:
                break;
        }

    }

    public String programaVeriGonder(){
        
        return getGpsValue();
    }
}
