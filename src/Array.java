public class Array {
    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[4];
        stringArray[0] = "Muhamad";
        stringArray[1] = "Ilhan";
        stringArray[2] = "Revaliana";
        stringArray[3] = "Firmansyah";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        System.out.println(stringArray[3]);

        stringArray[1] = "Reza";
        System.out.println(stringArray[1]);

        String[] stringArray2 = new String[4];

        System.out.println(" ");

        String[] listNama = {
            "Ilhan", "Ahmad", "Thoriq"
        };

        listNama[0] = null;

        for(byte i = 0; i < listNama.length; i++){
            System.out.println(listNama[i]);
        }

        int[] arrayInt = new int[]{
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        };

        long[] arrayLong = {
                10L, 20L, 30L, 40L, 50L, 60L, 70L, 80L, 90L, 100L
        };


        arrayLong[0] = 0;
        System.out.println(arrayLong.length);

        String[][] members = {
                {
                    "ILhan", "Revaliana", "Firmansyah"
                },
                {
                    "Ahmad", "Firmansyah", "Kartaatmadja"
                },
                {
                    "Thariq", "Zaky", "Rais"
                }
        };


        System.out.println(members[1][2]);

    }
}
