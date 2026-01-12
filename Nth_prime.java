class Nth_prime
{
    public static void main(String[] args)
    {
        
        int n=5;
        int result = nthprime(n);
        System.out.println(result);
    }

    static int nthprime(int n)
    {
        int num=2;
        int count=0;
        while(true){
            int flag=0;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                count++;
                if(count==n){
                    return num;
                }
            }
            num++;
        }
    }
}
