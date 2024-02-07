// ##### CHALLENGE #####
// https://edabit.com/challenge/HDk4PC9w6KPS3X25W

public class Challenge {
    public static String repeat(String str, int n) {
        String [] lettersArray = str.split("(?!^)");
        String stringRepeated = "";

        for(String letter: lettersArray){
            for(int i = 0; i < n; i++){
                stringRepeated += letter;
            }
        }
        return stringRepeated;
    }
}