package WhatToDo;

public class WhatToDo {
    public static void main(String[] args) {

        //Дано - Время
        int time = 14;

        //Какая погода - true или false
        boolean isGoodWeather = false;

        //Условие времени, время меньше или равно 23 + время меньше или равно 5
        boolean late = time >= 23 || time <= 5;

        //Если поздно - то идем спать
        if (late) {
            System.out.println("Спать");
        }

        //Если не поздно и хорошая погода - то идем гулять
        if (!late && isGoodWeather) {
            System.out.println("Гулять");
        }

        //Если не поздно и не хорошая погода -
        if (!late && !isGoodWeather) {
            System.out.println("Читать книгу");
        }
    }
}
