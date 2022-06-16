public class Methods {

   

    public static int fibLow (int x){
        int  currentPrime = 0;
        int isPrime = 0;
        int num1 = 0;
        int num2 = 1;
        int currentNumber = 0;

        while (num1 + num2 < x){
            currentNumber = num1 + num2;

            for (int i = 2; i < currentNumber; i++) {
                if(currentNumber % i == 0) {
                    isPrime++;
                }
            }
            if (isPrime == 0) {
                currentPrime = currentNumber;
            }

            isPrime = 0;

            num1 = num2;
            num2 = currentNumber;
        }

        return currentPrime;
    }

    public static int fibHigh (int x){
        int  currentPrime = 0;
          int isPrime = 0;
           int num1 = 0;
        int num2 = 1;
        int currentNumber = 0;

        while (x > currentNumber){
            currentNumber = num1 + num2;

            for (int i = 2; i < currentNumber; i++) {
                if(currentNumber % i == 0) {
                    isPrime++;
                }
            }
            if (isPrime == 0) {
                currentPrime = currentNumber;
            }
            isPrime = 0;
            num1 = num2;
            num2 = currentNumber;
        }

        return currentPrime;
    }

}
