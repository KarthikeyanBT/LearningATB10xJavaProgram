package ex_15_Strings_Functions;

public class Lab141_String_Functions {
    public static void main(String[] args) {
        //length
        String name ="Karthik";
        System.out.println(name.length());

        //1. charAt()
        System.out.println(name.charAt(1));
        // 2. concat()
        System.out.println(name.concat("Eyan"));
        // 4. equals()
        System.out.println(name.equals("karthiK"));
        // 5. equalsIgnoreCase()
        System.out.println(name.equalsIgnoreCase("KArthik"));
        // 6. indexOf() //  Karthik -> ? o
        System.out.println(name.indexOf("a"));
        String s1 = "madam";
        // Returns the index within this string of the
        // first occurrence of the specified substring.
        System.out.println(s1.indexOf("m"));
        // 7. length()
        System.out.println(name.length());
        // 8. replace( , )
        System.out.println(name.replace('k','K'));
        // 9. split()
        String name1 = "karthik@gmail.com@123";
        String[] split = name1.split("@");

        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        System.out.println(" ---");
        // 10. substring( , )
        System.out.println(name.substring(1,3));
        String ss = "hamburger";
        System.out.println(ss.substring(4,8));
        // 11. toLowerCase()
        System.out.println(name.toLowerCase());
        // 12. toUpperCase()
        System.out.println(name.toUpperCase());
        // 14. startsWith()
        System.out.println(name.startsWith("K"));
        // 15. endsWith()
        System.out.println(name.endsWith("k"));
        // 17. trim()
        String kk = "   karthik  Eyan  ";
        System.out.println(kk.trim());
        // 18. compareTo()
        System.out.println(name.compareTo("Karthik"));
        // 19. compareToIgnoreCase()
        System.out.println(name.compareToIgnoreCase("karthik"));

        StringBuilder sb = new StringBuilder("Ajith");
        sb.append("Kumar");
        System.out.println(sb);

        StringBuilder bs = new StringBuilder("Hi");
        bs.append(" It's my World!");
        System.out.println(bs.toString());






    }
}
