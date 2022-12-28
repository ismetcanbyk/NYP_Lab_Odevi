package TRY_CATCH.UcgenKontrol;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k1, k2, k3;
        double alan;
        int cevre;
        double u;

        try {
            System.out.print("1.Kenarı girin : ");
            k1 = inp.nextInt();
            System.out.print("2.Kenarı girin : ");
            k2 = inp.nextInt();
            System.out.print("3.Kenarı girin : ");
            k3 = inp.nextInt();
            if (k1 + k2 > k3 && k1 + k3 > k2 && k2 + k3 > k1) {
                System.out.println("Üçgen oluştu !");
                cevre = k1 + k2 + k3;
                System.out.println("Çevre : " + cevre);
                u = cevre / 2;
                alan = Math.sqrt(u * (u - k1) * (u - k2) * (u - k3));
                System.out.println("Alan : " + alan);
            } else {
                throw new Excep();
            }

        } catch (Excep e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Hatalı giriş");
        }
    }
}
