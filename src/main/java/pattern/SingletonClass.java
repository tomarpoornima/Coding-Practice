package pattern;
import java.util.*;

public final class SingletonClass {
    private static SingletonClass INSTANCE;
    private String info = "Initial info class";

    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonClass();
        }
        return INSTANCE;
    }

    public String getInfo(){
        return info;
    }
    public void setInfo(String info){
        this.info = info;
    }

    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass.getInfo());

        SingletonClass singletonClass1 = SingletonClass.getInstance();
        singletonClass1.setInfo("New class info");

        System.out.println(singletonClass.getInfo());
        System.out.println(singletonClass1.getInfo());
    }

}
