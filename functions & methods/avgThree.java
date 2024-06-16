public class avgThree {
        public static double calculateAvg(int a,int b,int c){
                double avg =(a+b+c)/3;
            return avg;
        }
        public static void main(String args[]){
            double avg = calculateAvg(5, 10, 15);
            System.out.println(avg);
        }
    }
