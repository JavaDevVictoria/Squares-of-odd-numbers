class SquaresOfOddNumbers {
  public static void main(String args[]) {
    int sum = 0;
    int square = 0;
    for (int i = 1; i<=50; i++)
    {
        if(i%2 != 0)
        {
            System.out.println("i is an odd number: " + i);
		    square = i * i;
            System.out.println("The square of i is: " + square);
		    sum = sum + square;
            System.out.println("The sum so far is: " + sum);
	    }
    }
    System.out.println(sum);
  }
}
