public class Activity2 {
    public static void main(String[] args) {
  
        int a = 45, b = 77, c = 23;
        int largest;



        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("Largest value: " + largest);
    }
}