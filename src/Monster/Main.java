package Monster;

public class Main {
    public static void main(String[] args) {

        //Создаем монстров и присваиваем ему значение
        Monster monster1 = new Monster();
        Monster monster2 = new Monster(1,1,1);
        Monster monster3 = new Monster(4,2);

        //Задаем монстру голос
        monster1.voice();
        monster2.voice(3);
        monster2.voice(5,"Я монстр 3");
    }
}
