
/*
public class stringname {
    public static void main(String[] args) {
        
        StringBuilder s = new StringBuilder("");

        s.append("Satyam Kumar");
        
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.replace(1, 5, "aaaa"));
        System.out.println(s.toString().toLowerCase());
        System.out.println(s.toString().toUpperCase());
        System.out.println(s.replace(1, 2, "Satyam"));
        
    }
}
*/
public class stringname{
    public static void main(String[] args){
        String s1="Satyam ";
        String s2="Kumar";
        s1.concat("Kumar");
        System.out.println(s1+s2);
    }
}
