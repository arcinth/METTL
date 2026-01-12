class IS_ODD{
    public static void main(String[] args) {
        int num = 5;
        int result =findeven(num);
        System.out.println(result);
 
    }
    static int findeven(int num){
        if(num%2!=0){
            return 2;
        }
        else{
            return 1;
        }
    }
}
