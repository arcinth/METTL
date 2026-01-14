class Is_palindrome
{
    public static void main(String[] args)
    {
        int num = 262;
        int result = ispalindrome(num);
        System.out.println(result);
    }

    static int ispalindrome(int num){
        int rev=0;
        int temp=num;
        while(temp>0){
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;

        }
        if(rev==num){
            return 2;
        }
        return 1;



    }
}
