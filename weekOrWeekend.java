import java.util.*;
public class weekOrWeekend {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int day=sc.nextInt();
            switch(day){
                // case 1:System.out.println("weekday");
                //         break;
                // case 2:System.out.println("weekday");
                // break;
                // case 3:System.out.println("weekday");
                // break;
                // case 4:System.out.println("weekday");
                // break;
                // case 5:System.out.println("weekday");
                // break;
                // case 6:System.out.println("weekend");
                // break;
                // case 7:System.out.println("weekend");
                // break;
                // default:System.out.println("sorry");
                case 1,2,3,4,5 :System.out.println("weekday");
                case 6,7:System.out.println("weekend");
                default:System.out.println("invalid day");
            }
        }
    }
    

