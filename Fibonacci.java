class Fibonacci {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;

        System.out.print("Fibonacci Series up to 100: ");

        while (a <= 100) {
            System.out.print(a + " ");

            int temp = a + b; 
            a = b;            
            b = temp;        
        }
    }
}
