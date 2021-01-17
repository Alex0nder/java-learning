package Speed;

public class Speed {
    public static void main(String[] args) {

        //Дано 1000 дней
        int days = 1000;

        //Скорость света км в сек
        int speed = 300000;

        //Из количество дней получаем кол. секунд; Дни * сутки(24) * мин. часах(60) * сек.в мин.(60) = расстояние
        long seconds = days * 24 * 60 * 60;

        //Чтобы получить расстояние, нужно умножить скорость на время
        long distance = speed * seconds;
        System.out.println(distance);

    }
}
