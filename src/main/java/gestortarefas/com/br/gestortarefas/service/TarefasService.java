package gestortarefas.com.br.gestortarefas.service;

import gestortarefas.com.br.gestortarefas.entity.Tarefa;
import gestortarefas.com.br.gestortarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TarefasService {

    @Autowired
    private TarefaRepository tarefaRepo;

    public Tarefa salvarTarefa(Tarefa tarefa){
        if(tarefa.getStatusTarefa().equals("pendente")){
            return tarefaRepo.save(tarefa);
        } else if (tarefa.getStatusTarefa().equals("finalizada")) {
            return tarefaRepo.save(tarefa);
        } else if (tarefa.getStatusTarefa().equals("urgente")) {
            return tarefaRepo.save(tarefa);
        } else {
            throw new RuntimeException("Erro ao salvar Tarefa");
        }
    }


}
