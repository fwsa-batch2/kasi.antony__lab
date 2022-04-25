public class Armstrongnumber {
    public static void main(String[] args){
        int number=153;
        int orignal=number;
        int remainder;
        int result=0;
        while(number != 0){
            remainder = number % 10;
            result += Math.pow(remainder,3);
            number /= 10;
        }
        if (result == orignal) {
            System.out.println(orignal +  " is Armstrong number");
        }
        else{
            System.out.println(orignal+ " is Not Armstrong number");
        }
    }
}
