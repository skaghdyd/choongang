package chap13_3;

public class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	
	public static void main(String[] args) {
		Product product = new Product();
	}
}
