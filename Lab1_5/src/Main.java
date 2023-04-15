import java.util.Scanner;
/*Задание 5
Дано целое число. Вывести его строку-описание вида «отрицательное четное
число», «нулевое число», «положительное нечетное число»
*/
public class Main {
    /**
     * Этот метод проверяет введенное число на четность, отрицательность и равно ли оно нулю
     * @param args Не используется.
     * @return Ничего.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (number == 0) System.out.println("Нулевое число"); // если число равно нулю дальше проверка не идет
        else {
            if (number > 0) System.out.print("Положительное ");
            else System.out.print("Отрицательное "); // так как в данном месте number не может быть равен нулю число может быть либо положительным либо отрицательным
            if (number % 2 == 0) System.out.println("чётное число");
            else System.out.println("нечётное число");
        }
    }
}