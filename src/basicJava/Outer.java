package basicJava;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-17
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class Outer {
    private int age = 1;

    class Inner {
        private int age = 2;

        public void print() {
            int age = 3;
            System.out.println("局部变量=" + age);
            System.out.println("内部变量=" + this.age);
            System.out.println("外部类变量=" + Outer.this.age);
        }
    }

    void outMethod() {
        int a = 10;
        class Inner {
            void innerMethod() {
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.print();
    }
}
