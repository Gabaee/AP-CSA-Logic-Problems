public class Prob8
{
    public static void main(String[] args)
    {
        printLettersRecursively(5, 5);
    }
    public static void printLettersRecursively(int n,int count)
    {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        if(n != 0)
        {
            System.out.print(alpha.charAt(count) + " ");
            printLettersRecursively(n - 1, count + 1);
        }
    }
}
