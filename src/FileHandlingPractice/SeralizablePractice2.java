package FileHandlingPractice;

import java.io.*;

class User implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    transient String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    public String toString() {
        return "User{" + "name=" + name + ", password=" + password + '}';
    }
}

public class SeralizablePractice2 {
    public static void main(String[] args) throws IOException {
        User user = new User("admin", "admin123");
        System.out.println("Original user: " + user);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))){
            oos.writeObject(user);
        }catch(IOException ioe){
            ioe.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))){
            User desealizedUser = (User) ois.readObject();
            System.out.println("Desealized user: " + desealizedUser);  // Password is null
        }catch (IOException | ClassNotFoundException ioe){
            ioe.printStackTrace();
        }
    }
}
