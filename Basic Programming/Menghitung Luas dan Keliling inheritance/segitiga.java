public class segitiga {
    float alas;
    float tinggi;

    public segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public double luasSegitiga(){
        return alas * tinggi / 2;
    }
   public  double kelilingSegitiga (){
        return alas + tinggi + Math.sqrt(alas * alas+ tinggi * tinggi) ;

   }
}

