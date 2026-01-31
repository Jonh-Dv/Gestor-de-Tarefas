package gestortarefas.com.br.gestortarefas.repository;

import gestortarefas.com.br.gestortarefas.entity.Tarefa;
import org.springframework.data.repository.CrudRepository;

public interface TarefaRepository extends CrudRepository<Tarefa,Integer> {
}
