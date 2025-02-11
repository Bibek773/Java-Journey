package Basic_programs;

public class strings {
    public static void main(String[] args) {

        String name = "Bro";
        boolean result = name.equals("Bro");// gives true
        System.out.println(result);

        boolean result2 = name.equalsIgnoreCase("bro");// gives true
        System.out.println(result2);

        int len = name.length();
        System.out.println(len);

//        char abc = name.charAt(1);
//        int abc = name.indexOf("r");
//        boolean abc = name.isEmpty();
//        String abc = name.toUpperCase();
//        String abc = name.toLowerCase();
//        String abc = name.trim();

     String abc = name.replace('o','a');


        System.out.println(abc);
    }
}