import java.net.SocketTimeoutException;
import java.util.Scanner;

public class manavKasa {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double armut = 2.14, armutKilo;
        double elma = 3.67, elmaKilo;
        double domates = 1.11, domatesKilo;
        double muz = 0.95, muzKilo;
        double patlican = 5, patlicanKilo;
        double total;
        System.out.println("Armut kaç kilo ? :");
        armutKilo= scan.nextDouble();
        System.out.println("Elma kaç kilo ? :");
        elmaKilo= scan.nextDouble();
        System.out.println("Domates kaç kilo ? :");
        domatesKilo = scan.nextDouble();
        System.out.println("Muz kaç kilo ? :");
        muzKilo = scan.nextDouble();
        System.out.println("Patlican kaç kio ? :");
        patlicanKilo = scan.nextDouble();
        total = (armut*armutKilo) + (elma*elmaKilo) + (domates*domatesKilo) + (muz*muzKilo) + (patlican*patlicanKilo);
        System.out.println("Toplam tutar: "+total +" TL");
    } 
}
