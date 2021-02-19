public class Main {
    public static void main(String[] args){

        //Object Oriented (Nesne Yönelimli) Atm Programı
        //Login Class'ı kullanıcı girişini kontrol edecek.
        //Hesap Class'ı hesap işlemlerini yapacak.
        //Atm ise Atm'mizi çalıştıracak.

        ATM atm = new ATM();
        Hesap hesap = new Hesap("Esma","1234560",5000);

        atm.calis(hesap);


    }
}
