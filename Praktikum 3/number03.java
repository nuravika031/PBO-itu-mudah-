
import java.util.Scanner;
import java.util.Stack;

public class number3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan sebuah String : ");
        String input = sc.nextLine();
        
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        System.out.println("String setelah dibalik : ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
        sc.close();
    }
}