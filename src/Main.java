import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int select;
        int balance = 1000;
        int girilenpara;
        int cikanpara;

        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz:");
            userName = inp.nextLine();
            System.out.print("Parolanızı giriniz: ");
            password = inp.nextLine();

            if (userName.equals("isa") && password.equals("123")) {
                System.out.println("Başarılı bir şekilde giriş yaptınız.");
                System.out.println("Hesabınızdaki Toplam Bakiyeniz :"+balance+" TL");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış Yap");
                    System.out.print("Seçimiz :");
                    select = inp.nextInt();
                    if(select==1){
                        System.out.print("Yatırmak istediğiniz tutarı giriniz :");
                        girilenpara=inp.nextInt();
                        balance+=girilenpara;
                        System.out.println("Hesabınızdaki Toplam Tutar :"+balance+" TL");
                        System.out.println("Başka bir işlem yapmak istiyormusunuz");
                    }
                    if(select==2){
                        System.out.print("Çekmek istediğiniz tutarı giriniz :");
                        cikanpara= inp.nextInt();
                        balance-=cikanpara;
                        System.out.println("Hesabınızdaki kalan para tutarı :"+balance+" TL");
                    }
                    if(select==3){
                        System.out.println("Hesabınızdaki toplam tutar: "+balance+ "TL");
                    }

                }
                while (select!=4);  //4 işlemini (çıkış yap )seçene kadar döngü devam eder.
                break;
            } else {
                right--;
                System.out.println("Hatalı giriş.Lütfen tekrar deneyiniz.");

                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.");
                } else {
                    System.out.println("Kalan hakkınız :" + right);
                }
            }

        }
    }
}