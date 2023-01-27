/*Muhammad Farhan Darmawan
immersive alterra program
Basic programming menghitung volume*/
public class Main {
    public static void main(String[] args) {

   balok balok = new balok(3,6,10);
   kubus kubus = new kubus(10);
   tabung tabung = new tabung(7,10);
        System.out.println("Volume Kubus:"  +kubus.volumeKubus());
        System.out.println("Volume balok:" + balok.volumeBalok());
        System.out.println("Volume tabung:" + tabung.volumeTabung());
    }
}