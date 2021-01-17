package Time;

public class Time {
    public static void main(String[] args) {
        //Дано секунды
        int seconds = 100000;

        //Посчитаем, сколько секунд в минутах, сколько скунд в часах и сколько секунд в сутках

        //В одной секунд минуте - 60 сек
        int secondsInMinutes = 60;

        //Вычисляем сколько секунд в часу - минуты-секунды умножаем на 60сек
        int secondsInHours = secondsInMinutes * 60;

        //Вычисляем сколько секунд в днях - часы-скунды умножаем на 24
        int secondsInDays = secondsInHours * 24;

        //Вычисляем кол. дней - оно равно общему количеству секунд деленному на количество секунд в днях
        int days = seconds / secondsInDays;

        //Вычисляем кол. часов - берем остаток от деления (из предыдущего действия) делям его на кол. скунд в минутах
        int hours = (seconds % secondsInDays) / secondsInHours;

        int minutes = ((seconds % secondsInDays) % secondsInHours) / secondsInMinutes;

        //Вычисляем количество секунд - берем общее количество секунд и вычитаем количество секунд,
        // которое ушло на формирование дней, часов и минут
        int leftSeconds = seconds - days * secondsInDays - hours * secondsInHours - minutes * secondsInMinutes;

        //Выводим информацию на экран
        System.out.println("Дано количество секунд: " + seconds);
        System.out.println("Это равно");
        System.out.println("Дней: " + days);
        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + leftSeconds);
    }
}
