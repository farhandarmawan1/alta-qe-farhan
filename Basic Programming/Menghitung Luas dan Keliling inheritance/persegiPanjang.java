public class persegiPanjang {
    double panjang;
    double lebar;

    public persegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    public double luasPersegiPanjang (){
        return panjang * lebar;
    }
    public double kelilingPersegiPanjang (){
        return 2 * (panjang +lebar);
    }
}
