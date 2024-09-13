
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

        for (int i = 0; i < spendingWeek.length - 1; ) {
            if (spendingWeek[i + 1] < spendingWeek[i]) {
                int box = spendingWeek[i];
                spendingWeek[i] = spendingWeek[i + 1];
                spendingWeek[i + 1] = box;
                i = 0;
            } else {
                i++;
            }
        }

        System.out.println("Минимальная сумма затрат за месяц " + spendingWeek[0] + " рублей , а максимальная " + spendingWeek[spendingWeek.length - 1] + " рублей.");
        System.out.println();

        System.out.println("_______Задача №3_______");

        for (int j : spendingWeek) {
            spendingMonth += j;
        }
        System.out.println("Средняя еженедельная сумма затрат составила: " + spendingMonth / spendingWeek.length + " рублей.");
        System.out.println();

        System.out.println("_______Задача №4_______");
        char[] reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int j = reverseFullName.length - 1; j >= 0; j--) {
            System.out.print(reverseFullName[j]);
        }
        System.out.print(".");
    }

}

