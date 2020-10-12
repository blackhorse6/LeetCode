package others;

import java.util.List;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-29
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class JavaGroupByDemo {
    public static void main(String[] args) {
        KotlinGroupByDemo demo = new KotlinGroupByDemo();
        List<Bean> beans = demo.mockDemo();
        demo.groupBy(beans);
    }
}
