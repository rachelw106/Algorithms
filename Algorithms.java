import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static File g;
    private static Scanner s, ss;
    public static void main(String[] args) throws FileNotFoundException {
        g = new File("words.txt");
        System.out.println("Two Letter Words: " + twoLetter());
        System.out.println("Number of Longest Words: " + longest());
        System.out.println("Palindromes: " + palindromes());


        f = new File("Numbers.txt");
        System.out.println("odds: " + odds());
        System.out.println("evens: " + evens());
        System.out.println("Two Digit Numbers: " + twoDigit());
        System.out.println("Greater than 500:" + greater());
        System.out.println("Greatest: " + greatest());
        System.out.println("Least: " + least());
        System.out.println("Sum: " + sum());
        double avg = (double) sum() / (odds()+evens());
        System.out.println("Average: " + avg);
        System.out.println("Mode: " + mode());

        s.close();
    }

    public static int twoLetter() throws FileNotFoundException{
        s = new Scanner(g);
        int two = 0;
        while (s.hasNextLine()) {
            String str = s.nextLine();
            if(str.length() == 2) two++;
        }
        return two;
    }
    public static int longest() throws FileNotFoundException{
        s = new Scanner(g);
        ss = new Scanner(g);
        int longest = 0;
        while (s.hasNextLine()) {
            String str = s.nextLine();
            if(str.length() > longest) longest = str.length();
        }
        int count = 0;
        while(ss.hasNextLine()) {
            String str = ss.nextLine();
            if(str.length() == longest) count++;
        }
        return count;
    }
    public static int palindromes() throws FileNotFoundException{
        s = new Scanner(g);
        int a = 0;
        while (s.hasNextLine()) {
            String str = s.nextLine();
            int len = str.length();
            int count = 0;
            for(int i = 0; i < len/2; i++) {
                if(str.substring(i,i+1).equals(str.substring(len-i-1,len-i))) count++;
            }
            if(count == len/2) a++;
        }
        return a;
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
    public static int mode() throws FileNotFoundException
    {
        s = new Scanner(f);
        int[] nums = new int[1000];
        while(s.hasNextInt())
        {
            nums[s.nextInt()]++;
        }
        int max = nums[0];
        int mode = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if (nums[i] > max)
            {
                mode = i;
                max = nums[i];
            }
        }
        return mode;
    }
}