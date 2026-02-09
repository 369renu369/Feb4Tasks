public class Primenumbers {
    public static void main(String[]arg){
        int x = 5;
        int count = 0;
        if(x>1){
            for(int i = 1; i<=x;i++){
                if(x%i==0){
                    count++;

                }
            }
            if(count==2);
            System.out.println("It is a Prime number");
        }
        else{
            System.out.println("It is not a Prime Number");
        }
    }
   
}
