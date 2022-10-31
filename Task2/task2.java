import java.util.Arrays;

// Реализовать алгоритм сортировки вставками. 
//Применяется при маленьких массивах, до 47 элементов
class MyProgram {
    public static void main(String[] params){
        int[] array = new int [] {34, 23, 45, 56, 67, 65, 3, 7, 12, 87};
        Sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void Sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i;
            while (j>0 && array[j-1]>current){
                array[j]=array[j-1];
                j--;
            }
            array[j] = current;
            
        }
        
    }
}