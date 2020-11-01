package basicJava;

/**
 * User          : zhouchenbin
 * Date          : 2020-10-23
 * ----      Title           ----
 * 反射
 * ----      Description     ----
 * ----      Example         ----
 */
public class Reflection {

    public static void main(String[] args) throws ClassNotFoundException {

        Class aClass = "Reflkection".getClass();
        Class<?> bClass = Class.forName("java.lang.String");
        System.out.println(aClass == bClass);

        //1 Object类中的getClass()返回一个Class类型的实例
        Boolean carson =true;
        Class classType = carson.getClass();
        System.out.println(classType);

        //2
        Class booleanClass = Boolean.class;
        System.out.println(booleanClass);

    }


}
