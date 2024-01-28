// ##### CHALLENGE #####
//https://edabit.com/challenge/mvHZK6Dy3ZF8EFoG3
public class Challenge {
  public static int mean(int a) {
    int sum = 0;
    int count = 0;

    while (a > 0) {
      sum = sum + a % 10;
      a = a / 10;
      count++;
    }
    sum = sum / count;
    return sum;
  }
}
