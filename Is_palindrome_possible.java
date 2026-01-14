class Is_palindrome_possible
{
    public static void main(String[] args)
    {
        int num = 2621;
        int result = ispalindrome(num);
        System.out.println(result);
    }

    static int ispalindrome(int num){
        int[] seen= new int[10];

        while (num>0){
            int digit=num%10;
            seen[digit]++;
            num=num/10;
        }
        int count=0;
        for(int i=0;i<seen.length;i++){
            if(seen[i]%2!=0){
                count++;
            }
        }
        if(count<=1){
            return 2;
        }
        return 1;
    }
}
