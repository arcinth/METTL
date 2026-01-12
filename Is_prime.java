class Is_prime
{
    public static void main(String[] args)
    {
        int num = 7;
        int result = isprime(num);
        System.out.println(result);
    }

    static int isprime(int num)
    {
        if (num <= 1)
            return 2;   

        for (int i = 2; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
                return 1;   
        }

        return 2;   
    }
}
