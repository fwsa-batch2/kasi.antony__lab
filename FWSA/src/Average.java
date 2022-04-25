public class Average {
    public static void main(String[] args){
        double sum=0;
        double[] num={9,8,7,6,5,4};
        int length= num.length;
        for (double i : num){
            sum = sum + i;
        }
        System.out.println("The average of the number is ="+sum/length);
    }

}
