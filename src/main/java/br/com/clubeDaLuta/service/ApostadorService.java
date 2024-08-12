package br.com.clubeDaLuta.service;

import br.com.clubeDaLuta.domain.Apostador;
import br.com.clubeDaLuta.repository.IApostadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApostadorService {

    @Autowired
    private IApostadorRepository apostadorRepository;

    public List<Apostador> getAllApostadores() {
        return apostadorRepository.findAll();
    }

    public void saveApostador(Apostador apostador) {
        apostador.setStatus("Pendente");
        apostadorRepository.save(apostador);
    }
}
