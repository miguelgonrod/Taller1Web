package com.web.taller1.controllers;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/grupo-web-wiki")
public class RouteController {

    @GetMapping(value = {"/", ""})
    public ModelAndView getHomePage() {
        return new ModelAndView("team");
    }

    @GetMapping("/proyecto")
    public ModelAndView getProjectPage() {
        return new ModelAndView("proyecto");
    }

    @GetMapping("/requerimientos")
    public ModelAndView getRequirementsPage() {
        return new ModelAndView("requerimientos");
    }

    @GetMapping("/arquitectura")
    public ModelAndView getArchitecturePage() {
        return new ModelAndView("arquitectura");
    }

    @GetMapping("/desarrollo")
    public ModelAndView getDevelopmentPage() {
        return new ModelAndView("desarrollo");
    }

    @GetMapping("/pruebas")
    public ModelAndView getTestPage() {
        return new ModelAndView("pruebas");
    }

    @GetMapping("/despliegue")
    public ModelAndView getDeploymentPage() {
        return new ModelAndView("despliegue");
    }

    @GetMapping("/contactenos")
    public ModelAndView getContactPage() {
        return new ModelAndView("contactenos");
    }

}
