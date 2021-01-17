package Main;

public class MyArrayList {

    //Создадим приватный массив строк на 10 элементов
    private String[] array = new String[10];

    //Создаем переменную size которая будет хранить в себе кол. элементов; Начальное значение 0
    private int size = 0;

    //Создадим добавление public void add с индексом size
    public void add (String s) {

        //Возьмем массив array, берем его элемент с индексом size и присваием ему значение s;
        array[size] = s;
        //увеоичваем на 1
        size++;

        //Делаем проверку
        //Если size равен длинне массива
        if (size == array.length) {
            //то в этом случае создаем новый массив (количество элементов в нем равно длине массива * 2)
            String[] newArray = new String[array.length * 2];

            //Теперь необходим все элементы из первого массива во второй
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            //Теперь массиву присваем ему новое значение newArray
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void remove(String s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals(array[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
        }
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return "Элемент не найден";
        }
    }
}
