public class Objective7Lab4 {
  public static void main(String[] args) {
    int counter = 1;
    int sum = 0;

    while(counter <= 20) {
      sum += counter;
      counter = counter + 1;
    }
    System.out.println(sum);
  }
}
