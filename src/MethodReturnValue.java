public class MethodReturnValue {
    public static void main(String[] args) {

        var results1 = sum(100, 200);
        System.out.println(results1);

        System.out.println(sum(200, 300));

        System.out.println(hitung(100, "+", 200));
        System.out.println(hitung(100, "-", 200));
        System.out.println(hitung(100, "*", 200));
        System.out.println(hitung(100, "/", 200));
        System.out.println(hitung(100, "%", 200));
    }

    static int sum(int value1, int value2){
        return value1 + value2;
    }

    static int hitung(int value1, String operasi, int value2) {
        switch (operasi){
            case "+" :
                return value1 + value2;
            case "-" :
                return value1 - value2;
            case "x", "X", "*" :
                return value1 * value2;
            case "/" :
                return value1 / value2;
            case "%" :
                return value1 % value2;
            default:
                return 0;
        }
    }
}
