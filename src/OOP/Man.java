package OOP;

public class Man {
    private String name;
    private int age;

    //конструктор и поля с инициализацией
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Метод, который выводит информацию на экран имя и возраст
    public void showInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    //Для того чтобы получить доступ к private(модификатор доступа), то нужно использовать "Set+перменная"
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.printf("Возраст должен быть больше 0");
        }
    }

    //Чтобы получить значение поля, используется "Get+переменная"
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
