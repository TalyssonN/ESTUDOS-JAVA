package br.com.talysson.todolistdesafio.SERVICE;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import br.com.talysson.todolistdesafio.ENTITY.Todo;
import br.com.talysson.todolistdesafio.REPOSITORY.TodoRepository;
import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> Create(Todo todo) {
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() {
        Sort sort = Sort.by("prioridade").descending().and(
            Sort.by("nome").ascending()
        );

        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(long id){
        todoRepository.deleteById(id);
        return list();
    }
}
