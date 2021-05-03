package homework6;

public class MainClass {


    public static int[] metod1(int[] array) throws RuntimeException {
        int count = array.length % 4;
        System.out.println(count);
        int[] arrayCount = new int[count];
        if (array.length > 4) {
            for (int i = 0; i < arrayCount.length; i++) {
                arrayCount[i] = array[array.length - (count - i)];
                System.out.println(arrayCount[i]);
            }
        } else {
            throw new RuntimeException();
        }
        return arrayCount;
    }

    public static boolean metod2(int[] array) {
        boolean bool = true;
        boolean boolone = false;
        boolean boolfour = false;
        for(int a : array){
            if( a!=1 && a!=4){
                bool = false;
            } else{
                if(a == 1) boolone = true;
                if(a == 4) boolfour = true;
                bool = (boolone && boolfour);
            }
        }
        System.out.println(bool);
        return bool;
    }


    public static void main(String[] args){

        int array1[] = {1, 2, 3, 4, 5, 6, 7};
        //int array1[] = {1, 2, 3};
        metod1(array1);
        //int array2[] = {1, 4, 2};
        int array2[] = {1, 1, 1, 1};
        metod2(array2);
    }
}
