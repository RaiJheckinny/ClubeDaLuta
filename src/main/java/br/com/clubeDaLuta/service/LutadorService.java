package br.com.clubeDaLuta.service;

import br.com.clubeDaLuta.domain.Lutador;
import br.com.clubeDaLuta.repository.ILutadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LutadorService {

    @Autowired
    private ILutadorRepository lutadorRepository;

    public List<Lutador> getAllLutadores(){
        return lutadorRepository.findAll();
    };

    public void saveLutadores(Lutador lutador){
        lutador.setStatus("Pendente");
        lutador.setPagamentoLutador(0l);
        lutadorRepository.save(lutador);
    }
}
