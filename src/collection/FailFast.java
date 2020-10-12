package collection;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-23
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class FailFast {
    List<String> list = new ArrayList<>();

    FailFast() {
        for (int i = 0; i < 10000; i++) {
            list.add("index=" + i);
        }
    }

    public static void main(String[] args) {
        FailFast failFast = new FailFast();
//        new Thread(() -> {
//            for (int i = 0; i < failFast.list.size(); i++) {
//                if (i > 100 && i % 100 == 0) {
//                    failFast.list.remove(i);
//                }
//            }
//        }).start();

        new Thread(() -> {
            Iterator<String> iterator = failFast.list.iterator();
            while (iterator.hasNext()){
                String next = iterator.next();
                if (next.endsWith("100")){
                    iterator.remove();
                }
            }

        }).start();

        List<String> list1 = Collections.unmodifiableList(failFast.list);
        list1.add("");

    }
}
