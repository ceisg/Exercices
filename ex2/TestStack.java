package ex2;

import java.util.ArrayList;

public class TestStack {

	public static void main(String[] args) {

		LIFOStack pile = new LIFOStack();

		pile.push(new Value("Java", 1));
		pile.push(new Value("C++", 2));
		pile.push(new Value("TypeScript", 3));
		pile.push(new Value("C#", 4));

		
		try {
			
			System.out.println(pile.peek());
			System.out.println(pile.pop());
			System.out.println(pile.isEmpty());
		
		}catch (EmptyStackException e) {

			e.printStackTrace();
		}

	}

}
