import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //mini ATM uygulaması

        String sysTcNo = "123456789";
        String sysSifre = "030799";
        int bakiye=1453,tutar=0;


        String tcNo, sifre;

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen TC Kimlik numaranızı giriniz:");
        tcNo = sc.nextLine();

        if(tcNo.length() == 9) {
            if (tcNo.equals(sysTcNo)) {

                System.out.println("Tc Kimlik numaranız doğrudur...");
                System.out.print("Lütfen şifrenizi giriniz:");
                sifre = sc.nextLine();
                if (sifre.equals(sysSifre)){
                    System.out.println("Şifreniz doğrudur. Yönlendiriliyorsunuz...");
                    System.out.print("Yapmak istediğiniz işlemi lütfen seçiniz:\n" +
                            "1: Bakiye öğrenme. \n" +
                            "2: Para Çekme.\n" +
                            "3: Para Yatırma.\n" +
                            "4: Çıkış.\n ");
                    int secim= sc.nextInt();
                    switch (secim){
                        case 1:
                            System.out.println("Buradan sadece bakiye öğrenme işlemi yapabilirsiniz.");
                            System.out.print("Bakiyeniz: " + bakiye);
                            break;
                        case 2:
                            System.out.println("Buradan sadece para çekme işlemi yapabilirsiniz.");
                            System.out.println("Bakiyeniz: " + bakiye);
                            System.out.print("Lütfen çekmek istediğiniz tutarı giriniz: ");
                            tutar= sc.nextInt();
                            if (bakiye>=tutar)
                            {
                                System.out.println(tutar + " kadar para çekiyorsunuz.");
                                bakiye = bakiye - tutar;
                                System.out.print("Yeni Bakiyeniz: " + bakiye );
                            }
                            else {
                                System.out.println("Bakiyeniz: " + bakiye);
                                System.out.print("Lütfen bakiyeniz kadar para çekebilirsiniz.");
                            }
                            break;
                        case 3:
                            System.out.println("Buradan sadece para yatırma işlemi yapabilirsiniz.");
                            System.out.println("Bakiyeniz: " + bakiye);
                            System.out.print("Lütfen yatırmak istediğiniz tutarı giriniz: ");
                            tutar= sc.nextInt();
                            if (bakiye>tutar)
                            {
                                bakiye = bakiye + tutar;
                                System.out.print("Yeni Bakiyeniz: " + bakiye );
                            }
                            else {
                                System.out.print("0 miktarda para yatırma işlemi yapamazsınız.");
                            }
                            break;
                        case 4:
                            System.out.print("Güvenli bir şekilde çıkış yapıyorsunuz... HOŞÇAKALIN! ");
                            break;
                    }
                }
                else {
                    System.out.print("Şifreniz hatalıdır!");
                }
            }
            else {
                System.out.print("Tc Kimlik numaranız hatalıdır!");
            }
        }
        else{
            System.out.print("Tc Kimlik numaranız 11 haneli veya boş olmalıdır!");
        }



    }
}