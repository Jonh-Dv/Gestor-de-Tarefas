package gestortarefas.com.br.gestortarefas.entity;

import jakarta.persistence.Column;;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "TAREFA")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TAREFA")
    private int idTarefa;

    @Column(name = "NOME_TAREFA", nullable = false, length = 100)
    private String nomeTarefa;

    @Column(name = "DESCRICAO_TAREFA", length = 255)
    private String descricaoTarefa;

    @Column(name = "STATUS_TAREFA")
    private String statusTarefa;

    @Column(name = "PRIORIDADE_TAREFA")
    private String prioridadeTarefa;

    @Column(name = "DATA_CRIACAO_TAREFA")
    private LocalDateTime dataCriacaoTarefa;

}
