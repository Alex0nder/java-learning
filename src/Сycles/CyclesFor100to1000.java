package Сycles;

public class CyclesFor100to1000 {
    public static void main(String[] args) {

        //Создаем цикл, в котром переменная равна 100, нам нужно выводить числа до тех пор
        // пока число не будет меньше или равна 100, прибавляя на 1
        for (int i = 100; i <= 1000; i++) {
            //Создаем условие с остатком от деления, Если i делится на 5 без остатка, то выводим i на экран
            if (i % 2 == 1 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
