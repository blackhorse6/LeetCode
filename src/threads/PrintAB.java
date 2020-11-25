package threads;

/**
 * User          : zhouchenbin
 * Date          : 2020/11/25
 * ----      Title           ----
 * 使用两个线程输出ABABAB
 * ----      Description     ----
 * 1 同步方法A和B，分别输出A和B
 * 2
 * ----      Example         ----
 */
public class PrintAB {
    private boolean flag = false;

    public synchronized void printA() {
        if (!flag) {
            this.notify();
            System.out.print("A");
            flag = true;
            try {
                //释放锁
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void printB() {
        if (flag) {
            //唤醒其他等待线程，继续执行
            this.notify();
            System.out.print("B");
            flag = false;
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
