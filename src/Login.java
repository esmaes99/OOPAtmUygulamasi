import java.util.Scanner;

public class Login {
    public boolean login (Hesap hesap){
        Scanner sc = new Scanner(System.in);
        String kullaniciAdi;
        String parola;

        System.out.print("Kullanıcı adı: ");
        kullaniciAdi = sc.nextLine();
        System.out.print("Parola: ");
        parola = sc.nextLine();

        if (hesap.getKullaniciAdi().equals(kullaniciAdi) && hesap.getParola().equals(parola)){
            System.out.println();
            return true;
        }
        else{
            return false;
        }

    }
}
