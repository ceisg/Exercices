package ex2;

public interface Stack {

	public boolean isEmpty();

	public void push(Value v);

	public Value pop() throws EmptyStackException;

	public Value peek() throws EmptyStackException;
}
