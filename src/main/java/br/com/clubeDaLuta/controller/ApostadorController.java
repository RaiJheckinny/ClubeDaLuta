package br.com.clubeDaLuta.controller;

import br.com.clubeDaLuta.domain.Apostador;
import br.com.clubeDaLuta.repository.IApostadorRepository;
import br.com.clubeDaLuta.service.ApostadorService;
import br.com.clubeDaLuta.service.LutadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/apostador")
public class ApostadorController {

    @Autowired
    private ApostadorService apostadorSevice;

    @Autowired
    private LutadorService lutadorService;

    @GetMapping("/form")
    public String formApostador(Model model) {

        List<String> times = new ArrayList<>();

        lutadorService.getAllLutadores().forEach(element -> times.add(element.getNome()));

        model.addAttribute("times", times);

        model.addAttribute("apostador", new Apostador());
        return "apostadorForm";
    }

    @PostMapping("/save")
    public String saveApostador(@ModelAttribute("apostador") Apostador apostador) {
        apostadorSevice.saveApostador(apostador);
        return "redirect:/apostador/list";
    }

    @GetMapping("/list")
    public String listApostadores(Model model) {
        model.addAttribute("apostadores", apostadorSevice.getAllApostadores());
        return "apostadorList";
    }
}
