import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Girilen 2 sayı ile kullanıcının seçtiği 4 işlemleri yapabilen bir hesap makinesi yapınız.

        Scanner scan = new Scanner(System.in);

        int value1;
        int value2;
        double result;
        int operation;

        System.out.print("1. sayıyı giriniz: ");
        value1 = scan.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        value2 = scan.nextInt();

        System.out.println("1. Toplama, 2. Çıkarma, 3. Çarpma, 4. Bölme");
        System.out.print("İşlem Seçiniz: ");
        operation = scan.nextInt();

        if (operation == 1){
            result = value1+value2;
            System.out.println("Sonuç: " + value1 + "+" + value2 + "=" + result);
        } else if (operation == 2) {
            result = value1-value2;
            System.out.println("Sonuç: " + value1 + "-" + value2 + "=" + result);
        } else if (operation == 3) {
            result = value1*value2;
            System.out.println("Sonuç: " + value1 + "*" + value2 + "=" + result);
        }else {
            result = value1/value2;
            System.out.println("Sonuç: " + value1 + "/" + value2 + "=" + result);
        }

    }
}