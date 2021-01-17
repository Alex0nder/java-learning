package Rect;

public class Main {
    public static void main(String[] args) {

        //Присвоим прямоуголнику значение rect
        Rect rect = new Rect();

        //Задаим размеры прямоугольника
        rect.setDimens(20,30);

        //Выведем на экран значение периметра прямоугольника
        System.out.println(rect.perimeter());

        //Выведем значение площади прямоугольника
        System.out.println(rect.area());
    }
}
