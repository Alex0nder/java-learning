package Pizza;

public class Pizza {
    public static void main(String[] args) {
        //Дано = наши деньги
        int temp = 500;

        //Если денег больше или равно 500, то покупаем пиццу
        if (temp >= 500) {
            System.out.println("Покупаем Пиццу!");
        //Если денег больше 300, то покупаем гамбургер
        } else if(temp > 300) {
            System.out.println("Покупаем Гамбургер!");
        //Есди денег больше 150, то покупаем шаурму
        } else if(temp > 150) {
            System.out.println("Покупаем Шаурму!");
        //Если денег мало, то покупаем Доширак
        } else {
            System.out.println("Покупаем Доширак :(");
        }
    }
}
