package Arrays;

public class Array3 {
    public static void main(String[] args) {

        //Если мы не хотим менять массив. т.е присваивать новое значение
        //Создадим новый массив из 100 чисел
        int[] nums = new int[100];

        //Создадим цикл от 0 до 1000 шагов в 10
        for (int i = 0; i < nums.length; i++) {

            //Присвоем значение элментам массива. У всех элементов по порядку с шагом в 10
            nums[i] = i * 10;
        }
        for (int i : nums) {
            System.out.println(i);
        }

        //Если вместо int - char c циклом for - в нем пустое значение
        //В нем пустое значение, так что будет пустой вывод после первого массива
        char[] chars = new char[10];
        for (char ch : chars) {
            System.out.println(ch);
        }
    }
}
