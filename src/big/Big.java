package big;

import java.math.BigDecimal;

/**
 * User          : zhouchenbin
 * Date          : 2020/11/26
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class Big {
    public static void main(String[] args) {

        test();
    }

    public static void test() {
        System.out.println(new BigDecimal(1.25).doubleValue());
        System.out.println(new BigDecimal(1.10).toBigInteger());
        System.out.println(2 << 15);
        System.out.println(Math.pow(2,41));
        System.out.println(4.5E15);
        System.out.println(0.1+0.2);

    }
}
