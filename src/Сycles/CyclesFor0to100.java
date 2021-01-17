package Сycles;

public class CyclesFor0to100 {
    public static void main(String[] args) {
        for (int i = 1000; i > 0; i--) {

            //Если i делится на 3 без остатка, то выводим i на экран
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
