package Сonditioner;

public class Сonditioner {
    public static void main(String[] args) {

        //Дано - Температура в комнате
        int temp = 22;

        //Сколько сейчас времени?
        int time = 24;

        //Поздно или нет?
        boolean late = time >= 23;

        //Жарко или холодно в комнате - true или false
        boolean hot = temp > 25;

        //Кондиционер выключается если не жарко (или ||) (и &&) уже поздно
        if (!hot && late) {
            System.out.println("Кондиционер выключен");
        }
    }
}
