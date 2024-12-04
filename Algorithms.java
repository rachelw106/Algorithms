import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("Numbers.txt");
        int odds = odds();
        int evens = evens();
        int twoDigit = twoDigit();
        int greater = greater();
        int greatest = greatest();
        int least = least();
        int sum = sum();
        double avg = (double) sum / numofnums();
        System.out.println(odds);
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
            if (n % 10 < 10 && n % 10 >= 1)
                twoDigit++;
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
        int prev = 0;
        while (s.hasNext()) {
            int n = s.nextInt();
            if (n > prev) greatest = n;
            prev = n;
        }
        return greatest;
    }
    public static int least() throws FileNotFoundException{
        s = new Scanner(f);
        int least = 0;
        int prev = 0;
        while (s.hasNext()) {
            int n = s.nextInt();
            if (n < prev) least = n;
            prev = n;
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
    public static int numofnums() throws FileNotFoundException{
        s = new Scanner(f);
        int num = 0;
        while (s.hasNext()) {
            num++;
        }
        return num;
    }
}