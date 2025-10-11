public class Code3 {
    public static void main(String[] args) {
        String message = "Harshvardhan Patil";
        System.out.println(message);
        System.out.println(message.endsWith("PatilHarsh"));
        message = message.toLowerCase();
        System.out.println(message);
        System.out.println(message.toUpperCase());
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.indexOf("v"));
        System.out.println(message.replace("a", "A"));
        System.out.println(message.substring(0, 5));
        System.out.println(message.charAt(6));
        System.out.println(message.contains("patil"));
        System.out.println(message.startsWith("harsh"));    

        String message1 = "    Hello World    ";
        System.out.println(message1.trim());


    }
}
