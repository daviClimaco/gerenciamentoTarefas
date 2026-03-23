package daviClimaco.gerenciamentoTarefas.services;

import daviClimaco.gerenciamentoTarefas.entity.Tarefa;
import daviClimaco.gerenciamentoTarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaServices {

    private TarefaRepository tarefaRepository;

    public TarefaServices(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public void salvar(Tarefa tarefa){
        tarefaRepository.save(tarefa);
    }

    public void deletar(Long id){
        tarefaRepository.deleteById(id);
    }

    public Tarefa buscarPorId(Long id){
        return tarefaRepository.findById(id).orElse(null);
    }

    public List<Tarefa> buscarTodos(){
        return tarefaRepository.findAll();
    }
}