public class tabung {
    double jariJari;
    double tinggi;

    public tabung(double jariJari, double tinggi) {
        this.jariJari = jariJari;
        this.tinggi = tinggi;
    }
    public double volumeTabung (){
        return Math.PI * jariJari * jariJari * tinggi;
    }
}
