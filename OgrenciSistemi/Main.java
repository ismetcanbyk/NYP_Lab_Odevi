package OgrenciSistemi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList yzlm = new ArrayList<>();

        Yazilim y1 = new Yazilim("ismet", "bıyık", 2021, "HFTTF");
        Yazilim y2 = new Yazilim("can", "byk", 2000, "HFTTF");

        yzlm.add(y1);
        yzlm.add(y2);


        for (Object object : yzlm) {
            System.out.println(object.toString());
        }

        y1.detail();
        
    }
}
