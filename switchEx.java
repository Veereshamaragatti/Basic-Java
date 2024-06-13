import java.util.*;
public class switchEx {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int menu=sc.nextInt();
            switch(menu){
                case 1:System.out.println("Idli");
                        break;
                case 2:System.out.println("Dosa");
                        break;
                case 3:System.out.println("Palav");
                        break;
                case 4:System.out.println("Curd Rice");
                        break;
                default:System.out.println("wake up to reallity");
            }
        }
    }
    
