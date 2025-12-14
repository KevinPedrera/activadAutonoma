package com.itsqmet.controlador;

import com.itsqmet.modelo.hClinica;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/historiaClinica")
public class HistoriaClinicaController {

    // Mostrar
    @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        model.addAttribute("historiaClinica", new hClinica());
        return "pages/hClinicaForm";
    }

    // Guardar
    @PostMapping("/guardar")
    public String guardarHistoria(
            @Valid @ModelAttribute("historiaClinica") hClinica historiaClinica,
            BindingResult result,
            Model model
    ) {
        if (result.hasErrors()) {
            result.getFieldErrors().forEach(error ->
                    System.out.println(error.getField() + " → " + error.getDefaultMessage())
            );
            return "pages/hClinicaForm";
        }
        model.addAttribute("datos", historiaClinica);
        return "pages/hClinicaResumen";
    }
}
