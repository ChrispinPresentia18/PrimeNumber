public class PrimeNumberChecker {
    private int number;

    public PrimeNumberChecker(int number) {
        this.number = number;
    }

    public Boolean check() {
        if(number<2) return false;
        int maxDivisor = number / 2;
        for(int i = 2; i< maxDivisor; i++){
            if(isDivisibleBy(i) == 0) return false;
        }
        return true;
    }

    private int isDivisibleBy(int divisor) {
        return number % divisor;
    }
}
