import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s, ss;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        System.out.println("odds: " + odds);

        int evens = evens();
        System.out.println("evens: " + evens);

        int twoDigit = twoDigit();
        System.out.println("Two Digit Numbers: " + twoDigit);

        int greater = greater();
        System.out.println("Greater than 500:" + greater);

        int greatest = greatest();
        System.out.println("Greatest: " + greatest);

        int least = least();
        System.out.println("Least: " + least);

        int sum = sum();
        System.out.println("Sum: " + sum);

        double avg = (double) sum / (odds+evens);
        System.out.println("Average: " + avg);

        int mode = mode();
        System.out.println("Mode: " + mode);

        s.close();
    }

    public static int odds() throws FileNotFoundException{
        s = new Scanner(f);
        int odds = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 != 0)
                odds++;
        }
        return odds;
    }
    
    public static int evens() throws FileNotFoundException{
        s = new Scanner(f);
        int evens = 0;
        while (s.hasNext()) {
            if (s.nextInt() % 2 == 0)
                evens++;
        }
        return evens;
    }
    public static int twoDigit() throws FileNotFoundException{
        s = new Scanner(f);
        int twoDigit = 0;
        while (s.hasNext()) {
            int n = s.nextInt();
            if (n >= 10 && n < 100) twoDigit++;
        }
        return twoDigit;
    }
    public static int greater() throws FileNotFoundException{
        s = new Scanner(f);
        int greater = 0;
        while (s.hasNext()) {
            if (s.nextInt() > 500)
                greater++;
        }
        return greater;
    }
    public static int greatest() throws FileNotFoundException{
        s = new Scanner(f);
        int greatest = 0;
        while (s.hasNext()) {
            int n = s.nextInt();
            if (n > greatest) greatest = n;
        }
        return greatest;
    }
    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = 999;
        while (s.hasNext()) {
            int n = s.nextInt();
            if (n < least) least = n;
        }
        return least;
    }
    public static int sum() throws FileNotFoundException{
        s = new Scanner(f);
        int sum = 0;
        while (s.hasNext()) {
            sum += s.nextInt();
        }
        return sum;
    }
    public static int mode() throws FileNotFoundException{
        s = new Scanner(f);
        ss = new Scanner(f);
        int mode = 0;
        while (s.hasNext()) {
            int count = 0;
            int n = s.nextInt();
            while(ss.hasNext()) {
                int m = ss.nextInt();
                if(n == m) count++;
            }
            if(count >= mode) mode = n;
        }
        return mode;
    }
}