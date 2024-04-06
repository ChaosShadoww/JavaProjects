import java.util.Stack;
import java.util.Scanner;
public class StackAssignment {
	
	public static String parenthesis(String pE) {
		Stack<Character> s = new Stack();
		for(int i = 0; i < pE.length(); i++) {
			
			if(pE.charAt(i) == '(' || pE.charAt(i) == '{' || pE.charAt(i) == '[') {
				s.push(pE.charAt(i));	
			}else if(!s.empty() && (pE.charAt(i) == ')' && s.peek() == '(' || pE.charAt(i) == '}' && s.peek() == '{' ||
						pE.charAt(i)== ']' && s.peek() == '[')) {
								s.pop();
			}else {
				s.push(pE.charAt(i));
			}
			
			
		}
		if(s.isEmpty()) {
			return "Balanced";
		}
		else {
			return "Not balanced";
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the parenthesis expression:");
		String pE = parenthesis(scan.next());
		System.out.println(pE);
		
	
		
	}

}
