
public class Main {
    public static void main(String[] args) {

        System.out.println("_______Задача №1_______");

        int[] spendingWeek = new int[]{112233, 445566, 101010, 202020, 303030};
        int spendingMonth = 0;

        for (int i = 0; i < spendingWeek.length; i++) {
            spendingMonth += spendingWeek[i];
        }
        System.out.println("Затраты за месяц составили: " + spendingMonth + " рублей.");

        System.out.println();

        System.out.println("_______Задача №2_______");
        int min = spendingWeek[0];
        int max = spendingWeek[0];

        for (int i = 0; i < spendingWeek.length - 1; i++) {
            if (max < spendingWeek[i + 1]) {
                max = spendingWeek[i + 1];
            }
            if (min > spendingWeek[i + 1]) {
                min = spendingWeek[i + 1];
            }
        }

        System.out.println("Минимальная сумма затрат за месяц " + min + " рублей , а максимальная " + max + " рублей.");
        System.out.println();

        System.out.println("_______Задача №3_______");

        spendingMonth = 0;
        for (int j : spendingWeek) {
            spendingMonth += j;
        }

        double averageSpending =  (double) spendingMonth / spendingWeek.length;
        System.out.println("Средняя еженедельная сумма затрат составила: " + averageSpending + " рублей.");
        System.out.println();

        System.out.println("_______Задача №4_______");
        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int j = reverseFullName.length - 1; j >= 0; j--) {
            System.out.print(reverseFullName[j]);
        }
        System.out.print(".");
    }

}

