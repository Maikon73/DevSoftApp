/* Задание 3
Создайте программу, вычисляющую числа Фибоначчи. Числа Фибоначчи –
последовательность чисел, в котором каждое следующее число равно сумме двух
предыдущих. Начало этой последовательности – числа 1, 1, 2, 3, 5, 8, 13…
*/
public class Main {
    /**
     * Этот метод записывает в переменную next новое число Фибоначчи путем сложения предыдущих
     * Затем a принимает значение b, и b принимает значение next, и цикл повторяется
     * @param args Не используется.
     * @return Ничего.
     */
    public static void main(String[] args) {
        int n = 10; // количество чисел Фибоначчи которое быдет выведено в консоль
        int a = 0;
        int b = 1; // первое число Фибоначчи

        for (int i = 0; i < n; ++i) {
            System.out.println(b);
            int next = a + b;
            a = b;
            b = next;

        }
    }
}