package week1.class_problems;
public class ReverseCustomerName {

    public static void main(String[] args) {
        String customerName = "Sunil";

        String reversed = reverseCustomerName(customerName);

        System.out.println("Original Name: " + customerName);
        System.out.println("Reversed Name: " + reversed);
    }

    static String reverseCustomerName(String customerName) {
        char[] chars = customerName.toCharArray();
        char[] reversedChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            reversedChars[i] = chars[chars.length - 1 - i];
        }

        return new String(reversedChars);
    }
}