public class ForEach {
    public static void main(String[] args) {
        String[] names = {
            "Ilhan", "Revaliana", "Firmansyah",
            "Ahmad", "Kartaatmadja", "Thariq",
            "Zaky", "Rais"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("for each");
        for(var name : names){
            System.out.println(name);
        }

    }
}
