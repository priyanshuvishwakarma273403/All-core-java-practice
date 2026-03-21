package ReflectionPractice;

import java.lang.reflect.*;

public class Practice1 {
    private String company = "OpenAi";
    private int id = 101;
    private String name = "Priyanshu";

    public Practice1(int id,String name) {
        this.id = id;
        this.name = name;
    }

    public Practice1() {
        System.out.println("Default Constructor");
    }

    public void show(){
        System.out.println("Show method called");
    }

    private  void privateMethod(){
        System.out.println("Private method called");
    }

    @Override
    public String toString() {
        return id + "  "+ name ;
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException {
//
        Class<Practice1> p1 = Practice1.class;
        for(Field f : p1.getDeclaredFields()){
            int mod = f.getModifiers();
            System.out.println(f.getName()+ " -> "+ Modifier.toString(mod));
        }





//        Class<Practice1> clazz = Practice1.class;
//
//        Constructor<Practice1> c2 = clazz.getConstructor();
//        Practice1 pc = c2.newInstance();
//
//        Constructor<Practice1> c3 = clazz.getConstructor(int.class,String.class);
//        Practice1 p2 = c3.newInstance(201,"Karan");
//        System.out.println(p2);

//        Practice1 p = new Practice1();
//        Class<?> clazz = p.getClass();
//
//        for(Method m : clazz.getMethods()){
//            System.out.println("Method name: " + m.getName());
//        }
//
//        Method show = clazz.getMethod("show");
//        show.invoke(p);
//
//
//        Method pm = clazz.getDeclaredMethod("privateMethod");
//        pm.setAccessible(true);
//        pm.invoke(p);


//        Practice1 pc = new Practice1();
//        Class<Practice1> c1 = Practice1.class;
//        Field f = Practice1.class.getDeclaredField("name");
//        f.setAccessible(true);
//        f.set(pc,"Priyanshu");
//        System.out.println(pc);
//        pc.show();
//        pc.privateMethod();
//        pc.toString();
//
//        Class<?> c2 = c1.getClass();
//        for (Field g : c2.getFields()) {
//            System.out.println("Public field : " + g.getName());
//        }
////
//        for (Field g : c2.getDeclaredFields()) {
//            System.out.print("Private field : " + g.getName());
//        }
    }
}
