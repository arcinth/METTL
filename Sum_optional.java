class  Sum_optional
{
    public static void main(String[] args)
    {
        int num = 26568;
        String option="odd";
        int result = sum(num,option);
        System.out.println(result);
    }

    static int sum(int num,String option){
        int sum=0;
        while(num>0){
            int digit=num%10;
            if(option.equals("even")){

                if(num%2==0){
                    sum=sum+digit;
                }
            else{
                if(num%2!=0){
                    sum=sum+digit;
                }
                    
            }
            }
            num=num/10;
            
            
        }
        return sum;
    }
        

       
}
       
