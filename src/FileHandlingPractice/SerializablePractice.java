package FileHandlingPractice;

import java.io.*;

class SerializablePractice implements Serializable {
    int id ;
    String name;

    public SerializablePractice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) throws IOException {
        SerializablePractice s1 = new SerializablePractice(1,"Ram");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("demo.txt"));
        oos.writeObject(s1);
        oos.close();
    }
}
