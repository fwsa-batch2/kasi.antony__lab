public class Sortoutarray {
    public static void main(String args[]){
        int[] array={1,3,2,5,4};
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j< array.length;j++){
                int temporary=0;
                if(array[i]>array[j]){
                    temporary=array[i];
                    array[i]=array[j];
                    array[j]=temporary;
                }
            }
            if( array[i] != 0){
                System.out.print(array[i]+",");
            }
            else {
                System.out.print(array[i]);
            }
        }
    }
}
