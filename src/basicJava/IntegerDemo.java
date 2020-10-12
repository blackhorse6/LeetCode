package basicJava;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-17
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class IntegerDemo {
    private InterfaceDemo interfaceDemo;

    public static void main(String[] args) {
        IntegerDemo demo = new IntegerDemo();
        demo.setInterfaceDemo(() -> {

        });
    }

    public void setInterfaceDemo(InterfaceDemo interfaceDemo) {
        this.interfaceDemo = interfaceDemo;
    }
}
