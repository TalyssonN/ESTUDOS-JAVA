package br.com.talysson.todolistdesafio.CONTROLLERS;
import br.com.talysson.todolistdesafio.ENTITY.Todo;
import org.springframework.web.bind.annotation.RestController;
import br.com.talysson.todolistdesafio.SERVICE.TodoService;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/todos")
public class TodoController {
    private TodoService todoService;

    
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping
    List<Todo> create(@RequestBody Todo todo){
        return todoService.Create(todo);
    }

    @GetMapping
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    List<Todo> list(){
        return todoService.list();
    }

    List<Todo> update(@RequestBody Todo todo){
        return todoService.update(todo);
    }

    @DeleteMapping("{id}")
    List<Todo> delete(@PathVariable("id") Long id){
        return todoService.delete(id);
    }

}
