//Muhammad Farhan Darmawan
public class palindromeFarhan {
    private static boolean palindrome (String huruf) {

        int length = huruf.length();
            for (int i = 0; i < length / 2; i++) {
                if (huruf.charAt(i) != huruf.charAt(length - i - 1)){
                    return false;
            }
    }
    return true;
}



        public static void main(String[] args)  {
        System.out.println(palindrome("kupu-kupu"));//false
        System.out.println(palindrome("katak"));//true
    }
}