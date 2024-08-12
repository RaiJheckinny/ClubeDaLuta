package br.com.clubeDaLuta.controller;

import br.com.clubeDaLuta.domain.Apostador;
import br.com.clubeDaLuta.domain.Lutador;
import br.com.clubeDaLuta.service.LutadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lutador")
public class LutadorControler {

    @Autowired
    private LutadorService lutadorService;

    @GetMapping("/form")
    public String formLutador(Model model) {
        model.addAttribute("lutador", new Lutador());
        return "lutadorForm";
    }

    @PostMapping("/save")
    public String saveLutador(@ModelAttribute("lutador") Lutador lutador) {
        lutadorService.saveLutadores(lutador);
        return "redirect:/lutador/list";
    }

    @GetMapping("/list")
    public String listLutador(Model model) {
        model.addAttribute("lutadores", lutadorService.getAllLutadores());
        return "lutadorList";
    }
}
