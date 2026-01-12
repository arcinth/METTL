class Digit_count
{
    public static void main(String[] args)
    {
        int num=1015;
        
        int result = digitcount(num);
        System.out.println(result);
    }

    static int digitcount(int num)
    {
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
       

        
    }
}
