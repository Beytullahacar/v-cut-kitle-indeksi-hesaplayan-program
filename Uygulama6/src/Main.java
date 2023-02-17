import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kg,boy,sonuc;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kilonuzu giriniz : ");
        kg = scan.nextDouble();
        System.out.print("Boyunuzu giriniz : ");
        boy = scan.nextDouble();

        sonuc = kg / (boy*boy);

        System.out.println("Vücut kitle indeksiniz : " + sonuc);

    }
}