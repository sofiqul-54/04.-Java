package Evidence4thExam;

public class SumForNumber {

    public static void main(String[] args) {
        int n = 25000;
        int sum = 0;
        while (true) {
            if (sum > 75000) {
                break;
            }else{
            
            sum+=n;
            }
            System.out.println(sum);
        }
    }
}
