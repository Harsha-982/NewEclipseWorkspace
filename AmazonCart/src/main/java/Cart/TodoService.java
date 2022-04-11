package Cart;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<String> todos= new ArrayList<String>();
	static {
		todos.add("Learn new concepts") ;
		todos.add("Learn spring");
	}
	public List<String> retriveTodos(){
		return todos;
	}
	public void addTodos(String name) {
		todos.add(name);
	}
}
 