package gestortarefas.com.br.gestortarefas.service;

import gestortarefas.com.br.gestortarefas.entity.Tarefa;
import gestortarefas.com.br.gestortarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;

@Service
public class TarefasService {

    @Autowired
    private TarefaRepository tarefaRepo;

    public boolean validarStatusAndPrioridade(Tarefa tarefa){
        if(!tarefa.getStatusTarefa().equals("pendente") && !tarefa.getStatusTarefa().equals("finalizada")){
            if(!tarefa.getPrioridadeTarefa().equals("alta") && !tarefa.getPrioridadeTarefa().equals("media") && !tarefa.getPrioridadeTarefa().equals("baixa")){
                return false;
            } else {
                return false;
            }
        }
        return true;
    }

    public Tarefa salvarTarefa(Tarefa tarefa){
        if(!validarStatusAndPrioridade(tarefa)){
            throw new IllegalArgumentException("Status ou Prioridade inválidos.");
        }
        tarefa.setDataCriacaoTarefa(LocalDateTime.now());
        return tarefaRepo.save(tarefa);
    }

    public Tarefa listarTarefaPorId(int idTarefa){
        return tarefaRepo.findById(idTarefa).orElse(null);
    }


}
