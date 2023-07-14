import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        int yapilacakIslem;//Bakiye
        int test = 3;
        float balanca = 1453.00F;
        String usurName, Password;

    while(test>0) {
        System.out.print("Kullanıcı Adınızı Giriniz:");
        usurName = imp.next();
        System.out.print("Şifrenizi Giriniz:");
        Password = imp.next();

        if (usurName.equals("Mete") && Password.equals("3939")) {

            do {
                System.out.print("1- Hesaba Para Aktarma \n 2- Hesaptan Para Çekme \n 3-Bakiye Sorgulama \n 4-Çıkış Yapmak ");
                System.out.println("Yapmak İstediğinz İşlemin Numarasını giriniz: "+"\n");
                yapilacakIslem = imp.nextInt();

                switch (yapilacakIslem) {
                    case (1):
                        System.out.print("Yüklemek İstediğiniz Miktarı Giriniz:");
                        Float eklenecekPara = imp.nextFloat();
                        balanca += eklenecekPara;
                        System.out.println(eklenecekPara + " Tl Eklenmiş olup Güncel Bakiyeniz: " + balanca+"\n");
                        break;

                    case (2):
                        System.out.print("Çekmek İstediğiniz Miktarı Giriniz: ");
                        Float AlinacakPara = imp.nextFloat();
                        if (AlinacakPara > balanca) {
                            System.out.println("Bakiye yetersiz."+"\n");
                        } else {
                            balanca -= AlinacakPara;
                            System.out.println(AlinacakPara + " Tl Çekilmiş olup Güncel Bakiyeniz: " + balanca+"\n");
                            break;
                        }
                    case (3):
                        System.out.println("Hesabınızda Bulunan Miktar: " + balanca +"\n");
                        break;

                }

            } while(yapilacakIslem!=4);
            System.out.println("Tekrar görüşmek üzere.");
            break;
        } else {
            test--;
            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");

            if (test == 0) {
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kalan Hakkınız : " + test);
            }
        }
    }

    }
}