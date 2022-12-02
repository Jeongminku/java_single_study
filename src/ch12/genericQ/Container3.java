package ch12.genericQ;

public class Container3 <T, U> {
	private T t;
	private U u;
	public T getKey() {
		return t;
	}
	
	public U getValue() {
		return u;
	}
	
	public void set(T t, U u) {
		this.t = t;
		this.u = u;
	}
	

	
}
