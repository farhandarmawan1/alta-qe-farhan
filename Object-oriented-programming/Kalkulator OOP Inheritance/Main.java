/*Muhammad Farhan Darmawan
Immersive program Alterra
Programming Basic*/
public class Main {
    public static void main(String[] args) {
        //Pemanggilan Class
        perkalian perkalian = new perkalian();
        pembagian bagi = new pembagian();
        Penjumlahan jumlah = new Penjumlahan();
        pengurangan kurang= new pengurangan();
        //input angka untuk dihitung
        perkalian.setInputAngka(10);
        perkalian.setInputangka2(10);
        bagi.setInputAngka(12);
        bagi.setInputangka2(3);
        jumlah.setInputAngka(3);
        jumlah.setInputangka2(4);
        kurang.setInputAngka(15);
        kurang.setInputangka2(4);
        //hasil kalkulatur
        System.out.println("Jumlah perkalian:" + perkalian.jumlahPerkalian());
        System.out.println("Jumlah pembagian:" +bagi.jumlahPembagian());
        System.out.println("Jumlah Penjumlahan:"+jumlah.jumlahPenjumlahan());
        System.out.println("Jumlah Penjumlahan:"+kurang.jumlahPengurangan());
    }
}