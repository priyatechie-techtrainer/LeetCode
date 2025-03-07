class Solution {


    public int[] closestPrimes(int left, int right) {
  final boolean[] isPrime = sieveEratosthenes(right + 1);
        List<Integer> primeArr = new ArrayList<>();
        for(int i=left;i<=right;i++)
        if(isPrime[i])
            primeArr.add(i);

        if (primeArr.size() < 2)
      return new int[] {-1, -1};

    int minDiff = Integer.MAX_VALUE;
    int n1 = -1;
    int n2 = -1;

    for (int i = 1; i < primeArr.size(); ++i) {
       int diff = primeArr.get(i) - primeArr.get(i - 1); 
      if (diff < minDiff) {
        minDiff = diff;
        n1 = primeArr.get(i - 1);
        n2 = primeArr.get(i);
      }
    }
      
return new int[] {n1,n2};


        
    }
      private boolean[] sieveEratosthenes(int n) {
    boolean[] isPrime = new boolean[n];
    Arrays.fill(isPrime, true);
    isPrime[0] = false;
    isPrime[1] = false;
    for (int i = 2; i * i <= n; ++i) // Fixed condition
      if (isPrime[i])
        for (int j = i * i; j < n; j += i)
          isPrime[j] = false;
    return isPrime;
  }
}