package java8;

/**
 * User          : zhouchenbin
 * Date          : 2020-10-09
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class Lambda {
    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        lambda.setIL(new IL() {
            @Override
            public void il() {

            }
        });
        lambda.setIL(() -> {

        });

    }
    void interface1(){
        setIL(new IL() {
            @Override
            public void il() {

            }
        });
    }
    void lambda1(){
        setIL(() -> {

        });
    }


    void setIL(IL il) {

    }

}

interface IL {
    void il();
}