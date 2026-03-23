package daviClimaco.gerenciamentoTarefas.repository;

import daviClimaco.gerenciamentoTarefas.entity.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}