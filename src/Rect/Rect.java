package Rect;

public class Rect {
    //Создадим параментры прямоугольника ширина и высота переменной double
    double width;
    double height;

    void setDimens(double width, double height) {
        this.width = width; // ширина
        this.height = height; // высота
    }

    //Площадь прямоуголника =
    double area() {
        return width * height; // ширину умножить на высоту
    }
    //Периметр прямоугольника
    double perimeter() {
        return (width + height) * 2; // ширину сложить на высоту и умножить на 2
    }
}
