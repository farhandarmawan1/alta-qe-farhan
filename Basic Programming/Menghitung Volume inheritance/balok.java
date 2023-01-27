public class balok {
    double panjang;
    double lebar;
    double tinggi;

    public balok(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    public double volumeBalok(){
        return panjang *lebar *tinggi;
    }
}
