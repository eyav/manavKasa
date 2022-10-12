import java.util.Scanner;
public class manavKasa {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, kilo, toplam;

        Scanner input= new Scanner(System.in);
        System.out.println("Kaç armut Kilo Almak İstiyorsun?");
        armut= input.nextDouble();

        System.out.println("Kaç elma Kilo Almak İstiyorsun?");
        elma= input.nextDouble();

        System.out.println("Kaç domates Kilo Almak İstiyorsun?");
        domates= input.nextDouble();

        System.out.println("Kaç muz Kilo Almak İstiyorsun?");
        muz= input.nextDouble();

        System.out.println("Kaç patlican Kilo Almak İstiyorsun?");
        patlican= input.nextDouble();

        toplam=(armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.0);
        System.out.println("Toplam tutarınız:"+toplam);


    }
}
