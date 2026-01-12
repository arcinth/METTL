class Prime_Range
{
    public static void main(String[] args)
    {
        
        int n=5;
        primerange(n);
        
    }

    static void primerange(int n)
    {
        
        
        for(int num=2;num<=n;num++){
            int flag=0;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(num);
                
            }
            
            
        }
        
    }
}
