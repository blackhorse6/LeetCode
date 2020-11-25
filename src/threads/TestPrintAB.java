package threads;

/**
 * User          : zhouchenbin
 * Date          : 2020/11/25
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class TestPrintAB {
    public static void main(String[] args) {
        PrintAB printAB = new PrintAB();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                    printAB.printA();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true)
                    printAB.printB();
            }
        }).start();


    }
}
