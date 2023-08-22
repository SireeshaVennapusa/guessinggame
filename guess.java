import java.util.Scanner;
public class guess{
public static void guessingNumberGame()
{
Scanner sc=new Scanner(System.in);
int number=1 + (int)(100*Math.random());
int K=6;
int i,guess=0;
System.out.println("choosen a number between 1 to 100."+"Guess the number"+"within 5 trials");
for(i=0;i<K;i++)
{
 System.out.println("Guess the number:");
 guess=sc.nextInt();
if(number==guess)
{
 System.out.println("Congratulations!!"+"you guessed the number.");
 break;
}
else if(number>guess&&i!=K-1)
{
System.out.println("the number is greater than "+ guess);
}
else if(number<guess&&i!=K-1)
{
 System.out.println("the number is less than "+ guess);
}
}
if(i==K)
{
 System.out.println("your " + K +" trials have been completed and you lost the game");
System.out.println("the number was "+number);
}
}
public static void main(String arg[])
{
 guessingNumberGame();
}
}


