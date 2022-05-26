import java.util.Scanner;

public class basithesapmakinesi {
    public static void main(String[] args){

        //Switch case ile basit hesap makinesi

        int s1, s2, islem;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        s1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        s2 = input.nextInt();

        System.out.println("Bir işlem seçiniz\n 1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
        islem = input.nextInt();

        switch (islem) {

            case 1:
                System.out.print("Toplam : " + (s1 + s2));
                break;
            case 2:
                System.out.print("Çıkarma : " + (s1 - s2));
                break;
            case 3:
                System.out.print("Çarpma : " + (s1 * s2));
                break;
            case 4:
                System.out.print("Bölme : " + (s1 / s2));
                break;
        }
    }

}
