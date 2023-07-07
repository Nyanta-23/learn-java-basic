public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Ilhan", "Pagi");
        sayHello("Ahmad", "Siang");
        sayHello("Thariq", "Malam");

    }

    static void sayHello(String name, String time){
        System.out.println("Selamat " + time + ", " + name + " semoga harimu menyenangkan");
    }
}
