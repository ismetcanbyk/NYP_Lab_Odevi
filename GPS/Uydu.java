package GPS;

public class Uydu {

    public Uydu(){
        System.out.println("Giriş parametresi bulunamadı !");
        System.exit(0);
    }

    public Uydu(GPSAlicisi gA){
        System.out.println("Gps Alıcısına Bağlanıldı !");


    }
    

    public void veriTuruSec(int veriTuru){

    }

    private int veriTuruSec(){
        int randNum = (int)(Math.random()*10);

        while(randNum == 0 || randNum>3){
            randNum = (int)(Math.random()*10);
        }

        return randNum;

    }


}
