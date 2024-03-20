public class Warmup2
{
    public static int close10(int a, int b)
    {
       int aDiff = Math.abs(a - 10);
       int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff)
        {
            return a;
        }
        if (bDiff < aDiff)
        {
            return b;
        }

        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
    }
}
