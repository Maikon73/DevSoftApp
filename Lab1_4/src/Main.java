import java.util.Scanner;
/*Задание 4
Создайте программу, вычисляющую факториал целого числа.
*/
public class Main {
    /**
     * Этот метод выводит факториал числа factorialOfNumber который
     * высчитывается в переменной answer
     * @param args Не используется.
     * @return Ничего.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 1; // Ответ
        int factorialOfNumber = in.nextInt(); // Число которе будет возводиться в факториал
        for (int i = 1; i <= factorialOfNumber; i++) {
            answer = answer * i;
        }
        System.out.println(answer);
    }
}