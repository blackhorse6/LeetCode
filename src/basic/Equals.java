package basic;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-23
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class Equals {
    public Equals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    //    @Override
//    public boolean equals(Object obj) {
//
//        if (obj instanceof Equals){
//            return this.age==((Equals) obj).age&&
//                    this.name.equals(((Equals) obj).name);
//        }else {
//            return false;
//        }
//    }
//
//    @Override
//    public int hashCode() {
//        return age *name.hashCode();
//    }
   public static class Inner {

    }
}
