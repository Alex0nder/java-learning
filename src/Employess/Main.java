package Employess;

public class Main {
    public static void main(String[] args) {

        MyArrayList employess = new MyArrayList();
        employess.add("Никита");
        employess.add("Игорь");
        employess.add("Ваня");
        employess.add("Иван");
        employess.add("Максим");
        employess.add("Ирина");
        employess.add("Алексей");

        employess.remove("Ваня");
        employess.remove("Алексей");
        employess.remove("Роман");

//        employess.remove(2);
//
//        for (int i = 1; i <= 100; i++) {
//            employess.add("Сотрудник " + i);
//        }
//
        for (int i = 0; i < employess.getSize(); i++) {
            System.out.println(employess.get(i));
        }

//        String[] employess = {
//                "Никита",
//                "Игорь",
//                "Ольга",
//                "Василий",
//                "Максим",
//        };
//        String[] second = new String[employess.length + 1];
//        for (int i = 0; i < employess.length; i++ ) {
//            second[i] = employess[i];
//        }
//        second[second.length - 1] = "Иван";
//        employess = second;
//        employess[1] = null;
//
//        String[] newNames = new String[employess.length - 1];
//        for (int i = 0, j = 0; i < employess.length; i++) {
//            if (employess[i] != null) {
//                newNames[j] = employess[i];
//                j++;
//            }
//        }
//
//        employess = newNames;
//
//        for (String name : employess) {
//            System.out.println(name);
//        }
    }
}
