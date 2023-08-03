public class Main {
    int[] expenses = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] salary = new int[30];
        for (int i = 0; i < salary.length; i++) {
            salary[i] = random.nextInt(100_000) + 100_000;
        }
        return salary;

    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1 ");

        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        // «Сумма трат за месяц составила … рублей».


        int[] salary = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей ");

    }

    public static void task2() {
        System.out.println("Задача 2 ");
        //Также бухгалтерия попросила найти минимальную и максимальную трату за день.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
        // «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        int[] salary = generateRandomArray();
        int maxSalary = -1;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > maxSalary) {
                maxSalary = salary[i];

            }

        }
        System.out.println("Максимальная зарплата составляет  " + maxSalary);

        int minSalary = 300_000;
        for (int i = 1; i < salary.length; i++) {
            if (salary[i] < minSalary) {
                minSalary = salary[i];
            }

        }
        System.out.println("Минимальная зарплата составляет   " + minSalary);
    }


    public static void task3() {
        System.out.println("Задание 3");

        //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
        //Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на
        // количество дней), и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
        //Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.

        int[] salary = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < salary.length; i++) {
            sum += salary[i];
        }
        double averageSalary = sum / salary.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSalary + " рублей");
    }

    public static void task4() {
        System.out.println("Задание 4");

        //В бухгалтерской книге появился баг. Что-то пошло нет так — фамилии и имена сотрудников начали отображаться
        // в обратную сторону. Т. е. вместо «Иванов Иван» мы имеем «навИ вонавИ». Данные с именами сотрудников
        // хранятся в виде массива символов — char[ ].
        //Напишите код, который в случае такого бага будет выводить фамилии и имена сотрудников в корректном виде.
        // В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено: Ivanov Ivan.
        //Важно: не используйте дополнительные массивы для решения этой задачи. Необходимо корректно пройти по
        // массиву циклом и распечатать его элементы в правильном порядке.

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {

            System.out.print(reverseFullName[i]);

        }

    }


}









            
