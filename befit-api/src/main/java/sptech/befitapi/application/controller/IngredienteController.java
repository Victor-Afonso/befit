package sptech.befitapi.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.befitapi.application.entity.ValorNutricional;
import sptech.befitapi.resources.repository.IngredienteRepository;
import sptech.befitapi.resources.repository.entity.Ingrediente;

import java.util.List;

@RestController
@RequestMapping("/ingrediente")
public class IngredienteController {

    @Autowired
    private IngredienteRepository ingredienteRepository;

    @GetMapping("/catalogo")
    public List<Ingrediente> getCatalogo(){
            return ingredienteRepository.findAll();
    }

    @GetMapping("/valor-nutricional")
    public List<ValorNutricional> getValorNutricional(@RequestBody List<ValorNutricional> valorNutricional){
        for (ValorNutricional vn:
                valorNutricional) {
            vn.setProteina(vn.getProteina() * vn.getQuantidade());
            vn.setLipidio(vn.getLipidio() * vn.getQuantidade());
            vn.setCarboidrato(vn.getCarboidrato() * vn.getQuantidade());
            vn.setSodio(vn.getSodio() * vn.getQuantidade());
            vn.setCaloria(vn.getCaloria() * vn.getQuantidade());

        }
        return valorNutricional;
    }
}
