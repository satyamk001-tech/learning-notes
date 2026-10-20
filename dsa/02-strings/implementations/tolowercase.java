public class tolowercase {

    public static String toLowerCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                sb.append((char) (ch + 32)); // convert to lowercase
            } else {
                sb.append(ch); // keep as it is
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "HeLLo WoRLd";
        String result = toLowerCase(input);
        System.out.println(result);
    }
}

