package Сycles;

public class CyclesWhile2 {
    public static void main(String[] args) {

        //
        //Сумма чисел
        int sum = 0;

        //Количество чисел
        int count = 1;

        //Создадим цикл - сумма должна быть меньше или равна 100
        while (count <= 100 ) {

            //Прибавляем на сумму
            sum += count;
            //Прибовляем количество на 1
            count++;
        }

        //Результат вычесления (среднее арифмитическое) сумма чисел разделить на их количество
        float result = sum / (float) count;

        //Выводим на экран деление
        System.out.println(result);



    }
}
