package Cart;

public class Todo {
	private String name;

	public String toString() {
		return String.format("Todo [name=%s]", name);
	}

	public Todo(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
