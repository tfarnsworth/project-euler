import java.util.ArrayList;

public class question2 {
    public static void main(String[] args) {
        int sum = 2;
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(2);

        int firstPrevious = fib.get(0);
        int secondPrevious = fib.get(1);
        int newFib = firstPrevious + secondPrevious;

        while (newFib < 4000000) {
            fib.add(newFib);
            firstPrevious = secondPrevious;
            secondPrevious = newFib;
            newFib = firstPrevious + secondPrevious;
            if(newFib%2 == 0) {
                sum += newFib;
            }
        }

        System.out.println(sum);
    }
}
