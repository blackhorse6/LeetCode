package threads;

/**
 * User          : zhouchenbin
 * Date          : 2020-10-29
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class MultiThread {
    public static void main(String[] args) {

        Thread runner = new Thread(new DaemonRunner(), "daemonRunner");
        runner.setDaemon(true);
        runner.start();
    }

    static class DaemonRunner implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println("DaemonRunner finnally run");

                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println("DaemonRunner finnally finish");
            }
        }
    }
}
