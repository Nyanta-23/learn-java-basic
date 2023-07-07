public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Ilhan");
        sayHello("Ilhan", "Good Afternoon");

    }

    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello " + name);
    }
    static void sayHello(String name, String condition){
        System.out.println("Hello " + name + ", " + condition);
    }

}
