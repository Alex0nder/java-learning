package Arrays;

public class Array2 {
    public static void main(String[] args) {

        //Создадим новый массив из 100 чисел
        int[] nums = new int[100];

        //Создадим цикл от 0 до 1000 шагов в 10
        for (int i = 0; i < nums.length; i++) {

            //Присвоем значение элментам массива. У всех элементов по порядку с шагом в 10
            nums[i] = i * 10;
        }

        //Выведем все циклы массива
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
