// ##### CHALLENGE #####
//https://edabit.com/challenge/NjJ9gGNPGaQGxTxCc

public class Challenge {
    public static boolean PrimeNumberInRange(int n1, int n2) {
        int primeFlag = 0;
        
        for (int num = n1; num <= n2; num++) {
            if (num < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int i = 2; i <= num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primeFlag = 1;
                break; 
            }
        }
        return primeFlag == 1;
    }
}