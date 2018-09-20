package DimensionalArrays;

public class ArrayAsmetodArguments {

    public static void main(String[] args) {
int x []= {8, 6, 5, 89, 4, 8};
        displayArray(x);
        transfArray(x);
        displayArray(transfArray(x));
    }

    public static void displayArray(int[] arr) {
        for (int i : arr) {

            System.out.println(i + "");
        }
    }
    public static int [] transfArray (int[] sourceArray){
    int[] targetArray = new int [sourceArray.length];
    System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
    return targetArray;
    }
    

}
