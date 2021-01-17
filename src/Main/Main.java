package Main;

public class Main {
    public static void main(String[] args) {
        MyArrayList employees = new MyArrayList();
        employees.add("Никита");
        employees.add("Игорь");
        employees.add("Ваня");
        employees.add("Иван");
        employees.add("Максим");
        employees.add("Ирина");
        employees.add("Алексей");

        //Удаление
        employees.remove("Ваня");
        employees.remove("Алексей");
        employees.remove("Георгий");

//        employees.remove(2);
//
//        for (int i = 1; i <= 100; i++) {
//            employees.add("Сотрудник " + i);
//        }

        for (int i = 0; i < employees.getSize(); i++) {
            System.out.println(employees.get(i));
        }


//        String[] employees = {
//                "Никита",
//                "Игорь",
//                "Ольга",
//                "Василий",
//                "Максим"
//        };
//        String[] second = new String[employees.length +1];
//        for (int i = 0; i < employees.length; i++) {
//            second[i] = employees[i];
//        }
//        second[second.length - 1] = "Иван";
//        employees = second;
//        employees[1] = null;
//
//        String[] newNames = new String[employees.length - 1];
//        for (int i = 0, j = 0; i < employees.length; i++) {
//            if (employees[i] != null) {
//                newNames[j] = employees[i];
//                j++;
//            }
//        }
//        employees = newNames;
//
//        for (String name : employees) {
//            System.out.println(name);
//        }

    }
}
