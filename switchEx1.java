import java.util.Scanner;
public class switchEx1 {
    public static void main(String[] args) {
        System.out.println("enter teh number 1-7 to choose the week");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch(num){
            case 1:System.out.println("this is sunday");
                    break;
            case 2:System.out.println("this is monday");
                    break;
            case 3:System.out.println("this is tuesday");
                    break;
            case 4:System.out.println("this is wednesday");
                    break;
            case 5:System.out.println("this is thursday");
                    break;
            case 6:System.out.println("this is friday");
                    break;
            case 7:System.out.println("this is saturday");
                    break;
            default:System.out.println("please enter the number from 1-7 to get the day");
        }
    }
}
