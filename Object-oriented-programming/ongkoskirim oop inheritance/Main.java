/*Muhammad Farhan Darmawan
Immersive program Alterra
Programming Basic*/
public class Main {
    public static void main(String[] args) {

        hitungOngkos ongkosKirim = new hitungOngkos(5000, 50,1);
        ongkosKirim.setPanjang(5);
        ongkosKirim.setLebar(2);
        ongkosKirim.setTinggi(4);
        ongkosKirim.setBerat(1);
        System.out.println( "harga ongkos kirim:Rp." + ongkosKirim.hitungOngkos1());

    }
}