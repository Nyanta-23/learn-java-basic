public class KonversiTipeDataPrimitifKeBukanPrimitif {
    public static void main(String[] args) {
        int iniInt = 100;

        Integer iniObj = iniInt;


        short iniShort = iniObj.shortValue();
        long iniLong = iniObj.longValue();
        float iniFloat = iniObj.floatValue();

        System.out.println(iniLong);


    }
}
