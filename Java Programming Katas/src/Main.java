import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
int num = 0 , sum=0;

        System.out.println("please enter a number : ");

        Scanner in = new System(num);

        for (int i = 0; i < num; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                sum += i;
            }
        }
        System.out.println("the total sum of multiples is : " + sum);

    }


    //=================== has three
     boolean hasThree(int num1, int num2)
    {
        int hasThreeTotal = 0;
        System.out.println("Enter the two integer values : ");

        hasThreeTotal = num1 + num2;

        if(num1 == 3 || num2 == 3 && hasThreeTotal.Contains(3) )
            return true ? false;

    }
}