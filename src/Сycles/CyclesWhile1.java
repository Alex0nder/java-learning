package Сycles;

public class CyclesWhile1 {
    public static void main(String[] args) {

        //Циклы
        //Начальное значение
        int i = 1;
        //Будем повторять пока i меньше 1000
        while (i <= 1000) {
            System.out.println(i);
            //Увеличиваем на 1
            i++;

            //Если хотим прервать цикл
            if (i == 5) {
                break;
            }
        }
    }
}
