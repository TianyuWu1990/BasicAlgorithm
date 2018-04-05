public class FactorialFactor {
    int factor(int number)
    {
        number = number > 0 ? number : -1*number;
        int factor = 2;
        int total = 0;
        while(number > 1)
        {
            while(number%factor==0)	{
//printf("%d, ", factor);
                total++;
                number/=factor;
            }
            factor++;
        }

//printf("\n");
        return total;
    }

    void factorial_factor(int number)
    {
        number = number > 0 ? number : -1*number;
        int total = 0;
        for(int i = number; i > 1; i--)	{
            total += factor(i);
        }
        System.out.println("total = " + total);
    }
}
