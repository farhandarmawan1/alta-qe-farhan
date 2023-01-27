public class hitungOngkos extends ongkosKirim {
    double hargaStandar ;
    double minimalDimensi;
    double minimalBerat;

    public hitungOngkos(double hargaStandar, double minimalDimensi, double minimalBerat) {
        this.hargaStandar = hargaStandar;
        this.minimalDimensi = minimalDimensi;
        this.minimalBerat = minimalBerat;
    }

    public double hitungOngkos1() {
        //hitung dimensi dan berat
        double dimensi = this.panjang * this.lebar * this.tinggi;
        double beratPembulatan = Math.ceil(this.berat);
        if (dimensi < this.minimalDimensi && beratPembulatan == 1) {
            return hargaStandar;
        }
        //hitung harga
        else {
            double biayaTambahanDimensi = Math.floor(dimensi/ hargaStandar) * hargaStandar;
            double biayaTambahanBerat = (beratPembulatan - 1) * hargaStandar;
            double biayaTambahan = biayaTambahanDimensi + biayaTambahanBerat;
            return hargaStandar + biayaTambahan;
        }

    }
}
