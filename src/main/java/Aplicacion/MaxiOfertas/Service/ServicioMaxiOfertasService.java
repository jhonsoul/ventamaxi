/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.MaxiOfertas.Service;

import Aplicacion.MaxiOfertas.DTO.OfertaDiaDTO;
import Aplicacion.MaxiOfertas.DTO.PicoPlacaCelularDTO;
import Aplicacion.MaxiOfertas.DTO.PlatoDiaDTO;
import Aplicacion.MaxiOfertas.DTO.RuletaDTO;

/**
 *
 * @author Jhon
 */
public interface ServicioMaxiOfertasService {
    
    public PicoPlacaCelularDTO picoPlaca(String numero);
    public RuletaDTO activaRuleta();
    public OfertaDiaDTO ofertaDia();
    public PlatoDiaDTO platoDia();
}
