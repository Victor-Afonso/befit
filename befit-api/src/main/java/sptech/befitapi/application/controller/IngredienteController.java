package sptech.befitapi.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sptech.befitapi.application.service.IngredienteService;
import sptech.befitapi.resources.repository.entity.Ingrediente;
import java.util.List;

@RestController
@RequestMapping("/ingrediente")
public class IngredienteController {

    @Autowired
    private IngredienteService ingredienteService;

    @GetMapping("/catalogo")
    public List<Ingrediente> getCatalogo() {
        return ingredienteService.findCatalogo();
    }

    @PostMapping
    public String adicionarIngrediente (@RequestBody Ingrediente ingrediente){

        return ingredienteService.adicionar(ingrediente);

    }

    @DeleteMapping("/{id}")
    public String excluirIngrediente (@PathVariable Integer id){
        return ingredienteService.deletar(id);
    }


}
