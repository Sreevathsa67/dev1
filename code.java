public class BrokenCode {
    public static void main(String[] args) {
        // Error 1: Assigning a String to an Integer variable
        int number = "Hello"11; 
//hello11
        // Error 2: Calling a method that doesn't exist
        System.out.println(number.toUppercase()); 
    }
}
