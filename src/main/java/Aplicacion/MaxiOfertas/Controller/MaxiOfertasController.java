/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.MaxiOfertas.Controller;

import Aplicacion.MaxiOfertas.DTO.OfertaDiaDTO;
import Aplicacion.MaxiOfertas.DTO.PicoPlacaCelularDTO;
import Aplicacion.MaxiOfertas.DTO.PlatoDiaDTO;
import Aplicacion.MaxiOfertas.DTO.RuletaDTO;
import Aplicacion.MaxiOfertas.Service.ServicioMaxiOfertasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Jhon
 */
@Controller
@RequestMapping("/maxiofertas")

public class MaxiOfertasController {
    @Autowired
    ServicioMaxiOfertasService serviciosMaxiOfertas;
    
    @GetMapping("/picoplacacel")
    public String picoPlacaCel(
            @RequestParam(defaultValue = " ", name="numero", required = false) String numero,
                    Model modelo) {
        PicoPlacaCelularDTO picoPlacaCelularObjeto = serviciosMaxiOfertas.picoPlaca(numero);
        modelo.addAttribute("celular", picoPlacaCelularObjeto);
        return "picoplaca.html";
    }
    
    @GetMapping("/descuentos")
    public String descuentos(Model modelo) {
        OfertaDiaDTO ofertaDiaObjeto = serviciosMaxiOfertas.ofertaDia();
        modelo.addAttribute("descuento", ofertaDiaObjeto);
        return "descuentos.html";
    }
    
    @GetMapping("/ruleta")
    public String ruleta(Model modelo) {
        RuletaDTO ruletaObjeto = serviciosMaxiOfertas.activaRuleta();
        modelo.addAttribute("ruleta", ruletaObjeto);
        return "ruleta.html";
    }
    
    @GetMapping("/platodia")
    public String platoDia(Model modelo) {
        PlatoDiaDTO platoDiaObjeto = serviciosMaxiOfertas.platoDia();
        modelo.addAttribute("plato", platoDiaObjeto);
        return "plato.html";
    }
}
