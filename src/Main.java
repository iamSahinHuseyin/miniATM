import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //while döngüsü yardımıyla mini ATM uygulaması

        String sysTcNo = "999999999";
        String sysSifre = "030799";
        String tcNo, sifre;

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen TC Kimlik numaranızı giriniz:");
        tcNo = sc.nextLine();
        System.out.print("Lütfen şifrenizi giriniz:");,
        sifre = sc.nextLine();

        if(tcNo.length() == 11) {
            if (sysTcNo==tcNo || sifre==sifre) {
                System.out.print("Başarı bir şekilde giriş yaptınız.");
            }
        }
        else{
            System.out.print("Tc Kimlik numaranız 11 haneli olmalıdır!");
        }



    }
}