/*Muhammad Farhan Darmawan
* alterra immersive bootcamp*/

public class Main {
    public static void main(String[] args) {

        segitiga segiTiga = new segitiga (3, 4);
        Persegi persegi = new Persegi(4);
        persegiPanjang persegiPanjang = new persegiPanjang(7,8);
        System.out.println("Luas Segitiga :"+ segiTiga.luasSegitiga());
        System.out.println("Luas Persegi :" +persegi.luasPersegi());
        System.out.println("Luas Persegi Panjang:" + persegiPanjang.luasPersegiPanjang());
        System.out.println("Keliling Segitiga:" + segiTiga.kelilingSegitiga());
        System.out.println("Keliling Persegi:" +persegi.kelilingPersegi());
        System.out.println("keliling Persegi Panjang:" + persegiPanjang.kelilingPersegiPanjang());
    }
}