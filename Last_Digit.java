class Last_Digit{
    public static void main(String[] args) {
        int num = -197;
        int result =lastdigit(num);
        System.out.println(result);
 
    }
    static int lastdigit(int num){
        return Math.abs(num%10);
    }
}
