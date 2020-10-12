package basicJava;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-17
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class LambdaDemo {

    private void inner() {
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        });
    }

    private void lambda() {
        new Thread(() -> {

        });
    }
}
