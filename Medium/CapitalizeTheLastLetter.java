// ##### CHALLENGE #####
// https://edabit.com/challenge/CYm9fzo63bQNbWfnN

public class Challenge {
	public static String capLast(String str) {
		    StringBuilder finalPhrase = new StringBuilder();
		
        String[] phrases = str.split(" ");

        for(int i = 0; i < phrases.length; i++){
            finalPhrase.append(phrases[i].substring(0, phrases[i].length() - 1))
                .append(Character.toString(phrases[i].charAt(phrases[i].length() - 1)).toUpperCase());
            if (i < phrases.length - 1) {
                finalPhrase.append(" ");
            }
        }
        return finalPhrase.toString();
	}
}
