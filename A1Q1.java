import java.util.Scanner;
class Arithmetic{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("enter num1:");
		int num1 = sc.nextInt();

		System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

		System.out.print("select the Arithmetic operation you want to perform");
		System.out.print("(1.add),(2.sub),(3.mul),(4.div),(5.mod)\n ");
 int operation = sc.nextInt();
		int ans;

    switch(operation){
    case 1:
    	ans = num1 + num2;
    	System.out.println("addition of num1 and num2=" + ans);
    break;
    case 2:
        ans = num1 - num2;
    	System.out.println("subtraction of num1 and num2=" + ans);
    break;
    case 3:
        ans = num1 * num2;
    	System.out.println("multiplication of num1 and num2=" + ans);
    break;
    case 4:
        ans = num1 / num2;
    	System.out.println("division of num1 and num2=" + ans);
    break;
    case 5:
        ans = num1 % num2;
    	System.out.println("modulo of num1 and num2=" + ans);
    break;
    default:
    System.out.println("enter valid operator");	
    }	
	}
}
