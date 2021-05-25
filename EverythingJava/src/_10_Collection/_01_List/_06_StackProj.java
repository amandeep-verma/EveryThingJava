package _10_Collection._01_List;
import java.util.Stack;

public class StackProj6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<Integer>();
		
		
		for(int i=1;i<10;i++)
			st.add(i);
		
		System.out.println(st);
		
		st.push(9);
		System.out.println("after pushing "+st);
		
		if(st.size()>0)
			System.out.println("popping out "+st.pop());
		System.out.println("after popping "+st);
		
		System.out.println(st.indexOf(1));
		
		System.out.println(st.isEmpty());
		
		
	}

}
