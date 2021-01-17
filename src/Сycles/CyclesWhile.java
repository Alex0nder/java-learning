package Сycles;

public class CyclesWhile {
    public static void main(String[] args) {

        //Создаем значение 1000
        int i = 1000;

        //Условие выполняем пока i > 0
        while (i >= 0) {
            //Выведем только четные числа
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i--;
        }
    }
}
