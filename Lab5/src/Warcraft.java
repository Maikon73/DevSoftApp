import java.util.Random;

public class Warcraft {
    /**
     * Этот метод эмулирует работу следующего процесса «Warcraft». Заданное количество юнитов
     * добывают золото равными порциями из одной шахты, задерживаясь в пути на
     * случайное время, до ее истощения. Работа каждого юнита реализуется в
     * порожденном процессе (потоке).
     * @param args Не используется
     */
    public static void main(String[] args) {
        int numUnits = 5; // количество юнитов
        int goldPerMine = 10; //количество золота за заход в шахту
        int goldMined = 0; // количество добытого золота

        Mine mine = new Mine(); // создаем шахту

        Unit[] units = new Unit[numUnits]; // создаем массив для юнитов
        for (int i = 0; i < numUnits; i++) {
            units[i] = new Unit("Батраком " + (i + 1) + " ", mine, goldPerMine); // создаем юнитов и передаем им ссылку на шахту и количество золота, которое они должны добыть
            units[i].start(); // запускаем поток для каждого юнита
        }

        System.out.println("Нужно больше золота!");

        // ждем, пока все юниты добудут золото из шахты
        for (Unit unit : units) {
            try {
                unit.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // считаем общее количество добытого золота
        for (Unit unit : units) {
            goldMined += unit.getGoldMined();
        }

        // выводим результаты
        System.out.println("Всего золота добыто: " + goldMined);
        System.out.println("Золото оставшееся в золотом руднике: " + mine.getGoldInMine());
        System.out.println("Золотой рудник обрушился(");

    }
}

class Unit  extends Thread {
    private String UName;
    private Mine mine;
    private int goldPerMine;
    private int goldMined;

    public Unit(String UName, Mine mine, int goldPerMine) {
        this.UName = UName;
        this.mine = mine;
        this.goldPerMine = goldPerMine;

    }

    @Override
    public void run() {
        while (mine.getGoldInMine() > 0) {
            int delay = new Random().nextInt(100); // случайная задержка для эмуляции времени, затраченного на добычу золота
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            goldMined += mine.mineGold() * goldPerMine; // добываем золото из шахты
            System.out.println("Всего золота добыто " + UName + goldMined);
            if (mine.getGoldInMine() > 0)
                System.out.println("Золото оставшееся в золотом руднике: " + mine.getGoldInMine());
        }
    }

    public int getGoldMined() {
        return goldMined;
    }
}

class Mine {
    private int goldInMine;

    public Mine() {
        goldInMine = 15000; // начальное количество золота в шахте
    }

    public synchronized int mineGold() {
        if (goldInMine <= 0) {
            return 0;
        }
        goldInMine -= 10;
        return 1;
    }

    public synchronized int getGoldInMine() {
        return goldInMine;
    }
}