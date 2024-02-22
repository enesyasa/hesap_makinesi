import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan input almak için Scanner nesnesi oluşturuluyor.
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan birinci sayıyı girmesini iste.
        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        // Kullanıcıdan ikinci sayıyı girmesini iste.
        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        // Kullanıcıya hangi işlemi yapmak istediğini gösteren bir menü göster.
        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1- Toplama");
        System.out.println("2- Çıkarma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");

        // Kullanıcıdan bir işlem seçmesini iste.
        int secim = scanner.nextInt();

        double sonuc = 0;

        // Switch-case yapısı ile seçilen işlemi gerçekleştir.
        switch (secim) {
            case 1:
                sonuc = sayi1 + sayi2;
                break;
            case 2:
                sonuc = sayi1 - sayi2;
                break;
            case 3:
                sonuc = sayi1 * sayi2;
                break;
            case 4:
                // Sıfıra bölme hatasını kontrol et.
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("Hata: Sıfıra bölme hatası!");
                    return;
                }
                break;
            default:
                // Geçersiz seçim durumu.
                System.out.println("Geçersiz seçim!");
                return;
        }

        // Sonucu ekrana yazdır.
        System.out.println("Sonuç: " + sonuc);
    }
}
