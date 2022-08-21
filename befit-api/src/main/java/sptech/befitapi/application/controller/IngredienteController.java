package sptech.befitapi.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.befitapi.application.request.ValorNutricionalRequest;
import sptech.befitapi.application.response.ValorNutricionalResponse;
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
    public ValorNutricionalResponse getValorNutricional(@RequestBody List<ValorNutricionalRequest> valorNutricional){
        double totalProteina = 0.0;
        double totalLipidio = 0.0;
        double totalCarboidrato = 0.0;
        double totalSodio = 0.0;
        double totalCaloria = 0.0;

        for (ValorNutricionalRequest vn:
                valorNutricional) {
            totalProteina+= (vn.getProteina() * vn.getQuantidade());
            totalLipidio+= (vn.getLipidio() * vn.getQuantidade());
            totalCarboidrato+= (vn.getCarboidrato() * vn.getQuantidade());
            totalSodio+= (vn.getSodio() * vn.getQuantidade());
            totalCaloria+= (vn.getCaloria() * vn.getQuantidade());

        }

        return new ValorNutricionalResponse(totalProteina, totalLipidio, totalCarboidrato, totalSodio, totalCaloria);
    }
}
