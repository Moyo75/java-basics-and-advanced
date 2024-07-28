import java.util.ArrayList;
import java.util.List;

public class Todos {
    private List<Todo> todos;

    public Todos(Todo todo) {
        if(todo != null) {
            this.todos.add(todo);
        }
    }

    public Todos(List<Todo> todos) {
        this.todos = todos;
    }

    public void getAllTodos() {
        todos.forEach(item -> System.out.println(item.getName()));
    }

    public static void main(String[] args) {
        Todo Todo1 = new Todo("Wake Up!");
        Todo Todo2 = new Todo("Brush your teeth!");
        Todo Todo3 = new Todo("Go to work!");

        List<Todo> numbers = new ArrayList<Todo>();

        numbers.add(new Todo("Sleep!"));
        numbers.add(new Todo("Eat!"));
        numbers.add(new Todo("Drink!"));

        Todos todos = new Todos(numbers);
        todos.getAllTodos();

    }
}
