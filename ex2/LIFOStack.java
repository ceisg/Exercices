package ex2;

import java.util.ArrayList;

public class LIFOStack implements Stack {

	//-----------------------------------------------------------
		private ArrayList<Value> values;
	//-----------------------------------------------------------
	
	public LIFOStack() { 
		this.values = new ArrayList<Value>();
	}
	//-----------------------------------------------------------
	
	public boolean isEmpty() {
		return this.values.size() == 0; // this.values.isEmpty()
	}
	//-----------------------------------------------------------
	
	public void push(Value v) {
		this.values.add(v);
	}
	//-----------------------------------------------------------
	public Value pop() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Pile Vide");
		}
		return this.values.remove(this.values.size() - 1);
	}
	//-----------------------------------------------------------	
	
	public Value peek() throws EmptyStackException {
		if (isEmpty()) {
			throw new EmptyStackException("Pile Vide ");
		}
		return this.values.get(this.values.size() - 1);
	}
	//-----------------------------------------------------------
}
