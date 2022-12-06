package GPS;

public class Test {
    public static void main(String[] args) {
        GPSAlicisi g1 = new GPSAlicisi();       
        
        if(!g1.isActive){
            System.out.println("Sıcaklık değeri :"+g1.getSicaklik());
            System.out.println("Sıcaklık uygun değil !");
            System.exit(0);
        }
        
        Uydu u2 =  new Uydu(); 

        Uydu u = new Uydu(g1);
        
        GPSProgrami g = new GPSProgrami(g1);

   
    }
}
