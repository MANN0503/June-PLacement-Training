public class Main {
    public static void main(String[] args) {
        String s = "Hello 84, this 47@692";
        int i = 0, max = 0;
        while (i < s.length()) {
            String s1 = "";
            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                s1 = s1 + s.charAt(i);
                i++;
            }
            if (!s1.equals("")) {
                max = Math.max(Integer.parseInt(s1), max);
            }
            i++;
        }
        System.out.println("Maximum number: " + max);
    }
}