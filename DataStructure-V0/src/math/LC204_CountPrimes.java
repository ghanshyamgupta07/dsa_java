package math;

class LC204_CountPrimes {
    public static void main(String[] args) {
        int res = countPrimes(1000);
        System.out.println(res);
    }
    public static int countPrimes(int n) {
        if(n <= 2) return 0; //Checking 0 & 1
        boolean[] composites = new boolean[n];
//        int limit = (int)Math.sqrt(n);
        //Array of compoites --> True represent composite and False represents primes
        for(int i = 2; i <= Math.sqrt(n)+1; i++){
            if(composites[i] == false) {
                //Mark all the multiples of i as true.
                //The first index to be flipped to true, is i*i
                for(int j = i*i; j < n; j=j+i){
                    composites[j] = true;
                }
            }
        }
        int count = 0;
        for(int i = 2; i < n; i++) {
            if(composites[i] == false) count++;
        }
        return count;
    }
}

