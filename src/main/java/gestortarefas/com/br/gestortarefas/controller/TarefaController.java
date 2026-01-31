package gestortarefas.com.br.gestortarefas.controller;

import gestortarefas.com.br.gestortarefas.entity.Tarefa;
import gestortarefas.com.br.gestortarefas.service.TarefasService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefasService tarefaService;

    @PostMapping("/salvartarefa")
    public ResponseEntity<Tarefa> salvarTarefa(@RequestBody Tarefa tarefa){
        Tarefa salva = tarefaService.salvarTarefa(tarefa);
        return ResponseEntity.status(HttpStatus.CREATED).body(salva);
    }

    @GetMapping("/listartarefaporid/{idTarefa}")
    public ResponseEntity<Tarefa> listarTarefaPorId(@PathVariable int idTarefa){
        Tarefa tarefa = tarefaService.listarTarefaPorId(idTarefa);
        return ResponseEntity.status(HttpStatus.OK).body(tarefa);
    }

    @GetMapping("/listartodastarefas")
    public ResponseEntity<List<Tarefa>> listarTarefa(){
        List<Tarefa> tarefas = tarefaService.listarTodasTarefas();
        return ResponseEntity.status(HttpStatus.OK).body(tarefas);
    }

}
