// ##### CHALLENGE #####
// https://edabit.com/challenge/aWzxPLibBLJgn8AbZ

public class ExistsANumberHigher {
    public static boolean existsHigher(int[] arr, int n) {

        boolean isHigher = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > n || arr[i] == n){
                isHigher = true;
            }
        }
        return isHigher;
    }
}