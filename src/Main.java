import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı girin :");
        int sonuc=sum(scanner.nextInt());
        System.out.println(sonuc);
    }

    static int sum(int sayi) {
        int durum=sayi;
        int sonuc=0;
        if (sayi != 0) {
            sonuc = durum + sum(durum - 1);
        }
        return sonuc;
    }
}