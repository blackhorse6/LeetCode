package basicJava;

import basic.Person;

import java.io.*;

/**
 * User          : zhouchenbin
 * Date          : 2020-10-26
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        outPut();
        inPut();
    }

    private static void outPut()throws IOException{
        FileOutputStream file = new FileOutputStream("serializable.txt");
        ObjectOutputStream outputStream = new ObjectOutputStream(file);
        Person person = new Person("zhouchenbin", 22);
        outputStream.writeObject(person);
    }

    private static void inPut() throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("serializable.txt");
        ObjectInputStream inputStream = new ObjectInputStream(file);
        Object object = inputStream.readObject();
        if (object instanceof Person){
            System.out.println(object);
        }
    }
}
