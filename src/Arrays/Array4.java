package Arrays;

public class Array4 {
    public static void main(String[] args) {

        //Создадим массив чисел размером 900 элементов
        int[] first = new int[900];

        //Создадим цикл в котором присвоем значение элементам этого массива
        for (int i = 0; i < first.length; i++) {
            first[i] = i + 100;
        }

        //Создадим второй массив по длине равный первому; Проинициализировать его в обратном порядке
        //Мы уверены что второй массив совпадает по длинне с первым
        int[] second = new int[first.length];

        //Присваемваем значение элементам второго массива
        for (int i = 0, j = first.length - 1; i < first.length; i++, j--) {
            second[j] = first[i];
        }

        //В цикле выведем все значения второго массива
        for (int i : second) {
            System.out.println(i);
        }
    }
}
