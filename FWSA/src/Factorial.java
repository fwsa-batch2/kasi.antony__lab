public class Factorial {
    public static void main(String[] args){
        int a=6,fact=1;
        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "  +a+ " is " +fact );
    }

    public static class PrimitveDatatypes {
        public static void main(String[] args) {
            boolean bool=true;
            char gender='M';
            byte a=21;
            short c=12345;
            int b=11000;
            long d=123456789l;
            float f =12.3456789f;
            double e=1234.567890987654321;

            System.out.println(bool+" "+gender+" "+a+" "+c+" "+b+" "+d+" "+e+" "+f);
        }

    }
}

