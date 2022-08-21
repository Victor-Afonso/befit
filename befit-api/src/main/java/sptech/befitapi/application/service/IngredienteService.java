package sptech.befitapi.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sptech.befitapi.resources.repository.IngredienteRepository;
import sptech.befitapi.resources.repository.entity.Ingrediente;

import java.util.List;

@Service
public class IngredienteService {
    @Autowired
    private IngredienteRepository ingredienteRepository;

    public List<Ingrediente> findCatalogo(){
        return ingredienteRepository.findAll();
    }

    public String adicionar(Ingrediente ingrediente){
         ingredienteRepository.save(ingrediente);

         return "Adicionado";

    }

    public String deletar(Integer id){
        ingredienteRepository.deleteById(id);

        return "Ingrediente removido";
    }

}
