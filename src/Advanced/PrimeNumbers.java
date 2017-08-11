package Advanced;

public class PrimeNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double lastPrime = 0;
        double noOfPrimes = 0;
        for(double i = 0; i<3000000; i++)
        {
            if(CalcPrimeNumbers(i) == true)
            {
                noOfPrimes = noOfPrimes + 1;
                lastPrime = i;
            }
        }
        System.out.println("Last prime number is: "+lastPrime);
        System.out.println("There were : "+noOfPrimes+ " prime numbers");
    }

    public static boolean CalcPrimeNumbers(double num){
        if ( num > 2 && num%2 == 0 ) {
            //System.out.println(num);
            return false;
        }
        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        //System.out.println(num);
        return true;
    }
}
