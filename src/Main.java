public class Main {
    public static void main(String[] args) {
task1();
task2();
task3();
    }
    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";

        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
        System.out.printf("ФИО сотрудника - %s", fullName);
    }

    public static void task2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
        String fullNameInUpperCase = fullName.toUpperCase();
        System.out.println();
        System.out.println(fullNameInUpperCase);
    }
    public static void task3() {
        String firstName = "Семён";
        String middleName = "Семёнович";
        String lastName = "Иванов";
        String fullName = String.format("%s %s %s", lastName, firstName, middleName);
        char incorrectSymbol = 'ё';
        char correctSymbol = 'е';
        String correctFullName = fullName.replace(incorrectSymbol, correctSymbol);
        System.out.println(correctFullName);
    }
}