package OOP;

public class Box {

    //Этот класс будет описывать коробку которая содержит 3 переменные (это класс, а не объект)
    double width; // Ширина
    double height; // Высота
    double length; // Длинна

    Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(double size) {
        width = size;
        height = size;
        length = size;
    }

    Box() {
        width = 0;
        height = 0;
        length = 0;
    }

    Box(Box box) {
        this.width = box.width;
        this.height = box.height;
        this.length = box.length;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume() { return width * height * length; }

    void showVolume() {
        System.out.println(volume());
    }

    Box increase(int i) {
        return new Box(width * i, height * i, length * i);
    }

    int compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if (thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }
}
