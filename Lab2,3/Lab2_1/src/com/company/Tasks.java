package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*final int ReadConsole = 1;
        final int ReadFile = 2;
        int resm = Menu();


        Scanner Scan = new Scanner(System.in);


        if (resm == ReadConsole)
        {
            try {

                File D = new File("Dan.txt");
                logger.info("Получена ссылка на файл");
                Scanner Scan1 = new Scanner(D);
                logger.info("Создался сканер по этому файлу");
                Task1(Scan1, resm);
                Task2(Scan1, resm);
                Task3(Scan1, resm);
                Task4(Scan1, resm);
                Task5(Scan1, resm);
                Task6(Scan1, resm);
                Task7(Scan1, resm);
            }
            catch(Exception e)
            {
                logger.fatal("Файл \"Dan.txt\" отсутствует");
            }

        }
        else if (resm == ReadFile)
        {
            Task1(Scan, resm);
            Task2(Scan, resm);
            Task3(Scan, resm);
            Task4(Scan, resm);
            Task5(Scan, resm);
            Task6(Scan, resm);
            Task7(Scan, resm);
        }
        Task8();
    }

    /**
     * Функция вызывает контекстное меню «Выбор режима работы»
     * @return Scan1.nextInt() - возвращает выбор сделаный пользователем в виде целого числа*/
    /*public static int Menu()
    {
        logger.info("Вызов функции Menu()");
        Scanner Scan1 = new Scanner(System.in);
        System.out.println("Введите 1, если хотите считать значение с файла или 2, если хотите ввести в консоль");
        return Scan1.nextInt();
    }

    /** Задание 1
     * Вычислить значения выражения по формуле:
     * @Param Scan - Основной сканер
     * @Param resm - Результат функции menu()
     */
//    public static void Task1(Scanner Scan, int resm)
//    {
//        logger.info("Вызов функция Task1()");
//        try {
//            int x = Scan.nextInt();
//            double res;
//
//            if (resm==2)
//                System.out.println("Задание 1. Введите целое число х: ");
//            res = (2 * (1 / Math.tan(3 * x))) - ((Math.log(Math.cos(x))) / (Math.log(1 + Math.pow(x, 2))));
//            System.out.println("Результат задания 1: " + "\n" + res);
//        }
//        catch (Exception e) {
//            logger.fatal("Ошибка считывания данных");
//        }
//    }
//
//    /** Задание 2
//     * Дано а. Не используя никаких функций и никаких операций, кроме умножения,
//     * получить а8 за три операции; а10 и а16 за четыре операции.
//     * @Param Scan - Основной сканер
//     * @Param resm - Результат функции menu()*/
//    public static void Task2(Scanner Scan, int resm)
//    {
//        logger.info("Вызов функция Task2()");
//        try
//        {
//            if (resm==2)
//                System.out.println("\n Задание 2. Введите целое число a: ");
//            int a = Scan.nextInt();
//            long a2,a4,a8,a10, a16 = 0;
//
//            a2 = a*a;
//            a4 = a2*a2;
//            a8 = a4*a4;
//            a10 = a8*a2;
//            a16 = a8*a8;
//            System.out.println("\n Результат задания 2: ");
//            System.out.println(a8);
//            System.out.println(a10);
//            System.out.println(a16);
//        }
//        catch (Exception e)
//        {
//            logger.fatal("Ошибка считывания данных");
//        }
//
//    }
//    /** Задание 3
//     * Программа-льстец. На экране появляется вопрос «Кто ты: мальчик или девочка? Введи Д или М».
//     * В зависимости от ответа на экране должен появиться текст
//     * «Мне нравятся девочки!» или «Мне нравятся мальчики!».
//     * @Param Scan - Основной сканер
//     * @Param resm - Результат функции menu() */
//    public static void Task3(Scanner Scan, int resm)
//    {
//        logger.info("Вызов функция Task3()");
//        try
//        {
//            if (resm==2)
//                System.out.println("\n Задание 3. Кто ты: мальчик или девочка? Введи Д или М: ");
//            char gender = Scan.next().charAt(0);
//            System.out.println("\nРезультат задания 3: ");
//
//            if (gender == 'Д' || gender == 'д') {
//                System.out.println("Мне нравятся девочки!");
//            } else
//            if (gender == 'М' || gender == 'м') {
//                System.out.println("Мне нравятся мальчики!");
//            } else
//                System.out.println("Ты кто?");
//        }
//        catch (Exception e)
//        {
//            logger.fatal("Ошибка считывания данных");
//        }
//
//    }
//
//    /** Задание 4
//     * Даны действительные числа a, b, с. Удвоить эти числа, если a<b<c,
//     * и заменить их абсолютными значениями, если это не так.
//     * @Param Scan - Основной сканер
//     * @Param resm - Результат функции menu() */
//    public static void Task4(Scanner Scan, int resm)
//    {
//        logger.info("Вызов функция Task4()");
//
//        try {
//            int Num = 0;
//            ArrayList<Integer> number = new ArrayList<>();
//
//            if (resm==2)
//                System.out.println("\n Задание 4. Введите 3 действительных числа: ");
//
//            for (int i=0; i<3; i++) {
//                Num=Scan.nextInt();
//                number.add(Num);
//            }
//
//            System.out.println("\nРезультат задания 4: ");
//
//            /*if (number.get(0)<number.get(1) && number.get(1)<number.get(2)) {
//                for (int i=0; i<3;i++) {
//                    number.set(i, number.get(i)*2);
//                    System.out.println(number.get(i));
//                }
//            }*/
//            else {
//                for (int i=0; i<3;i++) {
//                    number.set(i, Math.abs (number.get(i)));
//                    System.out.println(number.get(i));
//                }
//            }
//        }
//        catch (Exception e)
//        {
//            logger.fatal("Ошибка считывания данных");
//        }
//
//    }
//
//    /** Задание 5
//     *Даны два действительных положительных числа x и у. Арифметические действия над числами пронумерованы
//     * (1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление).
//     * Составить программу, которая по введенному номеру выполняет то или иное действие над числами. (switch)
//     *
//     * @Param Scan - Основной сканер
//     * @Param resm - Результат функции menu()*/
//    public static void Task5(Scanner Scan, int resm)
//    {
//        logger.info("Вызов функция Task5()");
//
//        try
//        {
//            int numberOp;
//            float y,x;
//
//            if (resm==2) {
//                System.out.println("\nЗадание 5");
//                System.out.println("Введите первое число (действительное положительное): ");
//            }
//
//            x = Scan.nextFloat();
//
//            if (resm == 2)
//                System.out.println("Введите первое число (действительное положительное): ");
//
//            y = Scan.nextFloat();
//            if (resm == 2)
//                System.out.println("Введите номер операции (1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление): ");
//
//            numberOp = Scan.nextInt();
//
//            System.out.println("\nРезультат задания 5: ");
//            switch (numberOp)
//            {
//                case 1:
//                    System.out.println("Результат сложения: " + (x + y));
//                    break;
//                case 2:
//                    System.out.println("Результат вычитания: " +(x - y));
//                    break;
//                case 3:
//                    System.out.println("Результат умножения: " +(x * y));
//                    break;
//                case 4:
//                    System.out.println("Результат деления: " +(x / y));
//                    break;
//                default:
//                    System.out.println("Такой операции нет");
//            }
//        }
//        catch (Exception e)
//        {
//            logger.fatal("Ошибка считывания данных");
//        }
//
//    }
//
//    /** Задание 6
//     * Найти натуральное число n диапазоне от 1 до n с максимальной суммой делителей.
//     * @Param Scan - Основной сканер
//     * @Param resm - Результат функции menu()
//     * */
//    public static void Task6(Scanner Scan, int resm)
//    {
//        logger.info("Вызов функция Task6()");
//
//        try
//        {
//            float n;
//            int maxsum = 0;
//            int numbermax = 0;
//
//            if (resm == 2)
//                System.out.println("\n Задание 6. Введите натуральное число  n: ");
//
//            n = Scan.nextFloat();
//
//            for (int i = 1; i <= n; i++)
//            {
//                int sum = 0;
//
//                for (int j = 1; j <= i; j++) {
//                    if(i%j==0) {
//                        sum+=j;
//                    }
//                }
//                if (sum>maxsum) {
//                    numbermax = i;
//                    maxsum = sum;
//                }
//            }
//            System.out.println("\nРезультат задания 6: ");
//            System.out.println("Число " + numbermax + " имеет максимальную сумму делителей - " + maxsum);
//        }
//        catch (Exception e)
//        {
//            logger.fatal("Ошибка данных");
//        }
//
//    }
//
//    /** Задание 7
//     * Дано натуральное число n и действительное x. Найти сумму n членов ряда.
//     * @Param Scan - Основной сканер
//     * @Param resm - Результат функции menu()
//     */
//    public static void Task7(Scanner Scan, int resm)
//    {
//        logger.info("Вызов функция Task7()");
//        try
//        {
//            int n;
//            double x,S = 0;
//
//            if (resm == 2) {
//                System.out.println("\nЗадание 7");
//                System.out.println("Введите натуральное число  n: ");
//            }
//
//            n = Scan.nextInt();
//
//            if (resm == 2)
//                System.out.println("Введите действительное число  х: ");
//
//            x = Scan.nextDouble();
//
//            for (int i=1; i<=n; i++) {
//                S+=(Math.pow(-1, i-1) * ((Math.cos(2*i+1)*x)/(Math.pow(2*i+1, 2))));
//            }
//
//            S=x+S;
//
//            System.out.println("\nРезультат задания 7: ");
//            System.out.println("Сумма членов ряда: " + S);
//        }
//        catch (Exception e)
//        {
//            logger.fatal("Ошибка данных");
//        }
//
//    }
//
//    /**  Задание 8
//     * Написать программу, которая выводит таблицу квадратов первых пяти целых положительных четных чисел.
//     * @Param Scan - Основной сканер
//     * @Param resm - Результат функции menu()
//     */
//    public static void Task8()
//    {
//        logger.info("Вызов функция Task8()");
//        System.out.println("\n Результат задания 8: ");
//        for (int i = 2; i<=10; i+=2){
//            System.out.println("Квадат " + i + " = " + (int) Math.pow(i,2));
//        }
//    }
//
//}*/
public class Tasks {
    /**
     * Этот метод выводит результат выражения e^x - x - 2 + (1+x)^x при вводимой переменной x
     * @param workingMode используется для выбора ввода переменных
     * @throws FileNotFoundException обработчик ошибок при вводе из файла
     */
    public void task1(int workingMode) throws FileNotFoundException {
        double x;
        double result;

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите x ");
            x = scanner.nextInt();
        } else {
            String path = "C:\\JavaProjects\\Lab2\\Lab2_1\\src\\1TaskData.txt";
            Scanner scanner = new Scanner(new File(path));
            x = scanner.nextInt();
            System.out.println("Ввод x из файла, x=" + x);
        }

        result = Math.exp(x) - x - 2 + Math.pow((1+x), x);
        System.out.println("Результат равен " + result);
    }

    /**
     * Этот метод находит сумму арифметической прогрессии
     * @param workingMode используется для выбора ввода переменных
     * @throws FileNotFoundException обработчик ошибок при вводе из файла
     */
    public void task2(int workingMode) throws FileNotFoundException {
        int ArProg; // первый член и сумма членов
        int NumSum; // знаменатель
        int count; // число членов прогрессии

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первый член прогрессии ");
            ArProg = scanner.nextInt();
            System.out.println("Введите знаменатель прогрессии ");
            NumSum = scanner.nextInt();
            System.out.println("Введите число членов прогрессии ");
            count = scanner.nextInt();
        } else {
            String path = "C:\\JavaProjects\\Lab2\\Lab2_1\\src\\2TaskData.txt";
            Scanner scanner = new Scanner(new File(path));
            ArProg = scanner.nextInt();
            System.out.println("Первый член прогрессии " + ArProg);
            NumSum = scanner.nextInt();
            System.out.println("Знаменатель прогрессии " + NumSum);
            count = scanner.nextInt();
            System.out.println("Число членов прогрессии " + count);
        }

        while (count > 0) {
            ArProg += NumSum;
            count--;
        }
        System.out.println("Сумма членов арифметической прогрессии " + ArProg);
    }

    /**
     * Этот метод перераспределяет значения переменных x и y так, чтобы в x оказалось большее из этих
     * значений, а в у — меньшее.
     * @param workingMode используется для выбора ввода переменных
     * @throws FileNotFoundException обработчик ошибок при вводе из файла
     */
    public void task3(int workingMode) throws FileNotFoundException {
        double x;
        double y;
        double tmp;

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите x ");
            x = scanner.nextDouble();
            System.out.println("Введите y ");
            y = scanner.nextDouble();
        } else {
            String path = "C:\\JavaProjects\\Lab2\\Lab2_1\\src\\3TaskData.txt";
            Scanner scanner = new Scanner(new File(path));
            x = scanner.nextDouble();
            System.out.println("Ввод x из файла, x=" + x);
            y = scanner.nextDouble();
            System.out.println("Ввод y из файла, y=" + y);
        }

        if (x < y) { // Если y больше значение переменных меняется
            tmp = y;
            y = x;
            x = tmp;
        } else if (y == x) {
            System.out.println("X и Y одинаковые");
        }
        System.out.println("X равен " + x + " Y равен " + y);
    }
    /**
     * Этот метод определяет по двум углам существует ли треугольник и прямоугольный ли он
     * @param workingMode используется для выбора ввода переменных
     * @throws FileNotFoundException обработчик ошибок при вводе из файла
     */
    public void task4(int workingMode) throws FileNotFoundException {
        double a, b;

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите угол a ");
            a = scanner.nextDouble();
            System.out.println("Введите угол b ");
            b = scanner.nextDouble();
        } else {
            String path = "C:\\JavaProjects\\Lab2\\Lab2_1\\src\\4TaskData.txt";
            Scanner scanner = new Scanner(new File(path));
            a = scanner.nextDouble();
            System.out.println("Ввод a из файла, a=" + a);
            b = scanner.nextDouble();
            System.out.println("Ввод b из файла, b=" + b);
        }
        if (a <= 90 && b <= 90 ) {
            System.out.println("Треугольник существует");
            if (a == 90 || b == 90 || (a + b == 90)) System.out.println("Треугльник прямоугольный");

        }
    }
    /**
     * Этот метод выводит вес где ед. измерения зависит от введенного числа
     * @param workingMode используется для выбора ввода переменных
     * @throws FileNotFoundException обработчик ошибок при вводе из файла
     */
    public void task5(int workingMode) throws FileNotFoundException {
        int number;
        int weight;

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("0-Килограмм");
            System.out.println("1-Миллиграмм");
            System.out.println("2-Грамм");
            System.out.println("3-Тонна");
            System.out.println("4-Центнер");
            System.out.println("Введите число ");
            number = scanner.nextInt();
            System.out.println("Введите вес ");
            weight = scanner.nextInt();
        } else {
            String path = "C:\\JavaProjects\\Lab2\\Lab2_1\\src\\5TaskData.txt";
            Scanner scanner = new Scanner(new File(path));
            number = scanner.nextInt();
            System.out.println("Ввод из файла числa " + number);
            weight = scanner.nextInt();
            System.out.println("Ввод из файла веса " + weight);
        }

        System.out.print(weight);
        if (number >= 0 && number < 5) {
            switch (number) {
                case 0:
                    System.out.println(" Килограмм");
                    break;
                case 1:
                    System.out.println(" Миллиграмм");
                    break;
                case 2:
                    System.out.println(" Грамм");
                    break;
                case 3:
                    System.out.println(" Тонна");
                    break;
                case 4:
                    System.out.println(" Центнер");
                    break;
            }
        }
    }
    /**
     * Этот метод выводит все двухначные числа, сумма квадратов цифр которых кратна M.
     * @param workingMode используется для выбора ввода переменных
     * @throws FileNotFoundException обработчик ошибок при вводе из файла
     */
    public void task6(int workingMode) throws FileNotFoundException {
        int m;

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число m ");
            m = scanner.nextInt();
        } else {
            String path = "C:\\JavaProjects\\Lab2\\Lab2_1\\src\\6TaskData.txt";
            Scanner scanner = new Scanner(new File(path));
            m = scanner.nextInt();
            System.out.println("Ввод из файла числa " + m);
        }
        for (int i = 1; i < 10; i++) //Первая цифра двухзначного числа
            for (int j = 0; j < 10; j++){ //Вторая цифра двухзначного числа
                if (i*i + j*j == m) System.out.println(i + "" + j);
            }
    }

    /**
     *Этот метод возврашает факториал числа n
     * @param n число которое будет возводистя в факториал
     * @return на возврат факториал числа
     */
    public long factorialUsingForLoop(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    /**
     * Этот метод выводит сумму sum членов ряда n
     * sum = 1 + 3x^2 + ... + 2n + 1 / n! * x^(2n)
     * @param workingMode используется для выбора ввода переменных
     * @throws FileNotFoundException обработчик ошибок при вводе из файла
     */
    public void task7(int workingMode) throws FileNotFoundException {
        int n;
        double x;
        int sum = 0;

        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число n ");
            n = scanner.nextInt();
            System.out.println("Введите число x ");
            x = scanner.nextInt();
        } else {
            String path = "C:\\JavaProjects\\Lab2\\Lab2_1\\src\\7TaskData.txt";
            Scanner scanner = new Scanner(new File(path));
            n = scanner.nextInt();
            System.out.println("Ввод из файла числa n " + n);
            x = scanner.nextInt();
            System.out.println("Ввод из файла числa x " + x);
        }

        for (int i = 0; i < n; i++) {
                sum += 2 * n + 1 /  factorialUsingForLoop(n) + 3 * Math.pow(x,3 * n);
        }
        System.out.println("Сумма равна " + sum);
    }
    /**
     * Этот метод выводит вычисляет сумму первых n целых положительных целых чисел.
     * @param workingMode используется для выбора ввода переменных
     * @throws FileNotFoundException обработчик ошибок при вводе из файла
     */
    public void task8(int workingMode) throws FileNotFoundException {
        int n; // Кол-во суммируемых чисел
        int sum = 0;


        if (workingMode == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число n ");
            n = scanner.nextInt();
        }
        else {
            String path = "C:\\JavaProjects\\Lab2\\Lab2_1\\src\\8TaskData.txt";
            Scanner scanner = new Scanner(new File(path));
            n = scanner.nextInt();
            System.out.println("Ввод из файла числa a " + n);
        }

        for (int i = 1; i < n; i++) {
            sum += n;
        }

        System.out.println("Сумма первых " + n + " целых положительных чисел равна " + sum);
    }
}

