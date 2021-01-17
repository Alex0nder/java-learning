package Dog;

public class Dog {
    //Создаем параметры собаки (кличка, порода, скорость)
    String name;
    String breed;
    int speed;


    void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "Бегу";

            //Проверяем, последнее ли это слово "Бегу" - если последнее, то ставим точнку, если нет, то запятую и пробел
            if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
    String info() {
        return "Кличка: " + name + " Порода: " + breed + " Скорость " + speed;
    }
}
