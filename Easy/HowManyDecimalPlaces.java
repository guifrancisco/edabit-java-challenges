// ##### CHALLENGE #####
// https://edabit.com/challenge/kQZH2EDsn7LYvXk9S

public class Challenge {
  public static int getDecimalPlaces(String num) {

    if (!num.contains(".")) {
      return 0;
    }
    String[] aNum = num.split("\\.");

    return aNum[1].length();
  }
}
