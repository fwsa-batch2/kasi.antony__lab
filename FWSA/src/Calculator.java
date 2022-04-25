public class Calculator {
    //CONSTRUCTOR CALCULATOR
    int number1,number2;
    Calculator(int n1, int n2){
        number1=n1;
        number2=n2;
    }

    public static int add(int number1, int number2){
        return number1+number2;
    }
    public static int sub(int number1, int number2){
        return number1-number2;
    }
    public static int mul(int number1,int number2){
        return number1*number2;
    }
    public static double div(double number1,double number2){
        return number1/number2;
    }

    public static void main(String[] args){
        Calculator total=new Calculator(10,5);
        System.out.println(add(total.number1,total.number2));
        System.out.println(sub(total.number1,total.number2));
        System.out.println(mul(total.number1,total.number2));
        System.out.println(div(total.number1,total.number2));
    }

    //METHOD CALCULATOR
//    public static void main(String[] args){
//        int sum=add(5,10);
//        System.out.println("The addition of the number is= "+sum);
//        int sub=subract(10,5);
//        System.out.println("The addition of the number is= "+sub);
//        int mul=multiply(10,5);
//        System.out.println("The addition of the number is= "+mul);
//        int div=division(10,5);
//        System.out.println("The addition of the number is= "+div);
//    }
//    public static int add(int num1 , int num2){
//        int sum=num1+num2;
//        return sum;
//    }
//    public static int subract(int num1 , int num2){
//        int sub=num1-num2;
//        return sub;
//    }
//    public static int multiply(int num1 , int num2){
//        int mul=num1*num2;
//        return mul;
//    }
//    public static int division(int num1 , int num2){
//        int div=num1/num2;
//        return div;
//    }
}

