/*
The program prints the balance of an account after the first, second, and third year.
The account has an initial balance of $1,000 and earns 5% interest per year
*/
public class Exercise14 {
    public static void main(String[] args)
    {
        System.out.println("Initial Balance: $" + 1000);
        System.out.println("After 1 year: $" + (1000 + 0.05*1000));
        System.out.println("After 2 years: $" + ((1000 + 0.05*1000)+0.05*(1000 + 0.05*1000)));
        System.out.println("After 3 years: $" + (((1000 + 0.05*1000)+0.05*(1000 + 0.05*1000)) + 0.05*((1000 + 0.05*1000)+0.05*(1000 + 0.05*1000))));
    }
}
