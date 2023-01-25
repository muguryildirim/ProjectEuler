/****************************************************************
* The prime factors of 13195 are 5, 7, 13 and 29.               *
* What is the largest prime factor of the number 600851475143 ? *
*****************************************************************/
public class ThirdQ {
    private static final long NUMBER = 600851475143L;

    public static void main(String[] args) {
        long time = System.nanoTime();
        long result = 0;
        for(int i = 2; i < NUMBER; i++) {
            if(NUMBER % i == 0 && isPrime(NUMBER / i)) {
                result = NUMBER / i;
                break;
            }
        }
        System.out.println("Result: " + result + "\nTime required to calculate in nanoseconds: " + (System.nanoTime() - time));
    }

    private static boolean isPrime(long l) {
        for(long num = 2, max = l / 2 ; num < max; num++) {
            if(l % num == 0) {
                return false;
            }
        }
        return true;
    }
}
 
