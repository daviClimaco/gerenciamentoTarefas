package daviClimaco.gerenciamentoTarefas.controller;

import daviClimaco.gerenciamentoTarefas.entity.Tarefa;
import daviClimaco.gerenciamentoTarefas.services.TarefaServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("tarefas")
public class TarefaController {

    private TarefaServices tarefaServices;

    public TarefaController(TarefaServices tarefaServices) {
        this.tarefaServices = tarefaServices;
    }

    @PostMapping
    public void salvar(@RequestBody Tarefa tarefa){
        tarefaServices.salvar(tarefa);
    }

    @GetMapping
    public List<Tarefa> buscarTodos(){
        return tarefaServices.buscarTodos();
    }

    @GetMapping("{id}")
    public Tarefa buscarPorId(@PathVariable Long id){
        return tarefaServices.buscarPorId(id);
    }

    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id){
        tarefaServices.deletar(id);
    }
}