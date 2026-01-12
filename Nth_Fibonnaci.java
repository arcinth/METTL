class Nth_Fibonnaci
{
    public static void main(String[] args)
    {
        int a=0;;
        int b=1;
        int n=5;
        int result = nthfib(a,b,n);
        System.out.println(result);
    }

    static int nthfib(int a,int b,int n)
    {
        int sum=0;
        for(int i=2;i<=n;i++){
        
            sum=a+b;
            a=b;
            b=sum;
        }
        return b;

        
    }
}
