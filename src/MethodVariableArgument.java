public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80, 80, 80, 80, 80, 80, 70};

        sayCongrats("Ilhan", values);

        sayCongrats("Ahmad", 80, 50, 80, 80, 80, 80, 70);
    }

    static void sayCongrats(String name, int... values){
        int total  = 0;
        for(int value : values){
            total += value;
        }

        int finalValue = total / values.length;
        System.out.println(finalValue);

        String statement =
                finalValue >= 75 ? "Selamat " + name + ", Anda lulus" : "Maaf " + name + ", Anda belum lulus";

        System.out.println(statement);

    }
}
