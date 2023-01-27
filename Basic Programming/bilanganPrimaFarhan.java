//Muhammad Farhan Darmawan

public class bilanganPrimaFarhan {
    private static boolean primeNumber(int number) {
        int cekPrime=0;
        boolean prime;

        for(int i=1; i<=number; i++){
            if(number % i == 0){
                cekPrime++;
            }
        }

        if(cekPrime == 2){
            prime = true;
        }else{
            prime = false;
        }
        return prime;

    }

    public static void main(String[] args) {
        System.out.println(primeNumber(7));
        System.out.println(primeNumber(10));
    }
}