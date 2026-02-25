package br.com.talysson.todolistdesafio.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.talysson.todolistdesafio.ENTITY.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    
}
