package GPS;

public class Uydu {

    public Uydu(){
        System.out.println("Giriş parametresi bulunamadı !");
        System.exit(0);
    }

    public Uydu(GPSAlicisi gA){
        System.out.println("Gps Alıcısına Bağlanıldı !");
        gA.uydudanVeriAl(veriTuruSec());

    }
    

    private int veriTuruSec(){
        
        int randNum = (int)(Math.random()*3+1);
        return randNum;
    }


}
