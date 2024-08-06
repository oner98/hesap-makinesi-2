package aaccdd;
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("İlk sayıyı girin: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("İkinci sayıyı girin: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Yapmak istediğiniz işlemi seçin (+, -, *, /): ");
        char islem = scanner.next().charAt(0);
        
        double sonuc;
        
        switch (islem) {
            case '+':
                sonuc = num1 + num2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '-':
                sonuc = num1 - num2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '*':
                sonuc = num1 * num2;
                System.out.println("Sonuç: " + sonuc);
                break;
            case '/':
                if (num2 != 0) {
                    sonuc = num1 / num2;
                    System.out.println("Sonuç: " + sonuc);
                } else {
                    System.out.println("Hata: Bir sayıyı sıfıra bölemezsiniz.");
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçtiniz.");
                break;
        }
        
        scanner.close();
    }
}

