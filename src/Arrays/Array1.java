package Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] daysInMonth = new int[13];

        //Если забудем указать значение элементам массива, то всем массивам присоется 0
        //При инициализации массива при помощи ключевого слова new элементу массива
        //присваивается значение по умолчанию;

        daysInMonth[0] = 31;
        daysInMonth[1] = 28;
        daysInMonth[2] = 31;
        daysInMonth[3] = 30;
        daysInMonth[4] = 31;
        daysInMonth[5] = 31;
        daysInMonth[6] = 30;
        daysInMonth[7] = 31;
        daysInMonth[8] = 30;
        daysInMonth[9] = 31;
        daysInMonth[10] = 30;
        daysInMonth[11] = 31;
        daysInMonth[12] = 31;

        //Обычне присваивание с выводом значения
//        for (int i = 0; i<12; i++) {
//            System.out.println(daysInMonth[i]);
//        }

        //Создаем цикл, он будет выполнятся пока i меньше 12
        for (int i = 0; i < daysInMonth.length; i++) {
            System.out.println(daysInMonth[i]);
        }
    }
}

