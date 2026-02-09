class Reverse {

    public static int reversenumber(int number) {
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            number = number / 10;
            reversed = reversed * 10 + digit;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int number = 8795;
        System.out.println("reverse of " + number + " is " + reversenumber(number));
    }
}
