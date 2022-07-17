import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        int secim;
        int hak = 3;
        int bakiye = 1500;

        Scanner girdi = new Scanner(System.in);

        while (hak > 0) {

            System.out.print("Kullanici Adiniz : ");
            userName = girdi.nextLine();
            System.out.print("Sifreniz : ");
            password = girdi.nextLine();
            if ((userName.equals("Berkay") && password.equals("berkay123"))) {
                System.out.println("Kodluyoruz Bank'a Hosgeldiniz.");
                do {
                    System.out.println("1-Para Yatirma\n2-Para Cekme\n3-Bakiye Sorgulama\n4-Cikis");
                    System.out.print("Lutfen Yapmak Istediginiz Islemi Secin : ");
                    secim = girdi.nextInt();

                    switch (secim) {
                        case 1:
                            System.out.print("Yatirmak Istediginiz Tutar : ");
                            int miktar = girdi.nextInt();
                            bakiye += miktar;
                            System.out.println("Guncel Bakiyeniz : " + bakiye + " tl");
                            break;
                        case 2:
                            System.out.print("Cekmek Istediginiz Tutar : ");
                            int miktar2 = girdi.nextInt();
                            if (miktar2 > bakiye) {
                                System.out.println("Yetersiz Bakiye.");
                            } else {
                                bakiye -= miktar2;
                                System.out.println("Guncel Bakiye : " + bakiye + " tl");
                            }
                            break;
                        case 3:
                            System.out.println("Guncel Bakiye : " + bakiye + "tl");
                        default:
                            System.out.println("Lutfen Gecerli Bir Sayi Giriniz.");
                    }
                } while (secim != 4);
                break;

            } else {
                hak--;
                System.out.print("Hatali Giris Yaptiniz. ");
                System.out.println("Kalan Hakkiniz " + hak);
            }
            if (hak == 0) System.out.print("Kartiniz Bloke. Gecmis olsun.");
        }
    }
}