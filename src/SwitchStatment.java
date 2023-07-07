public class SwitchStatment {
    public static void main(String[] args) {

        var nilai = "A";

        switch (nilai){
            case "A":
                System.out.println("Wow anda lulus dengan baik");
                break;
            case "B":
            case "C":
                System.out.println("Nilai anda cukup baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        switch (nilai){
            case "A" -> System.out.println("Wow anda lulus dengan baik");
            case "B", "C" -> System.out.println("Nilai anda cukup baik");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }

        String ucapan;

        switch (nilai){
            case "A" -> ucapan = "Wow, anda lulus Dengan Baik";
            case "B", "C" -> ucapan = "Nilai anda Cukup Baik";
            case "D" -> ucapan = "Anda tidak lulus";
            default -> {
                ucapan = "Mungkin anda salah jurusan";
            }
        }

        System.out.println(ucapan);


        String say = switch (nilai){
            case "A":
                yield "Wow anda lulus dengan baik";
            case "B", "C":
                yield "Anda Lulus";
            case "D":
                yield "Anda tidak lulus";
            default:
                yield "Mungkin anda salah jurusan";
        };

        System.out.println(say);
    }
}
