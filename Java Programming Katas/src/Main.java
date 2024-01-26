import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
int num , sum=0;

        System.out.println("please enter a number : ");

        Scanner input = new Scanner (System.in);
        num = input.nextInt();

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

        Scanner first = new Scanner (System.in);
        num1 = first.nextInt();

        Scanner sec = new Scanner (System.in);
        num2 = sec.nextInt();

        hasThreeTotal = num1 + num2;

        return
        (num1 == 3 || num2 == 3 && hasThreeTotal.Contains(3) ) ?
             true : false;

    }
}