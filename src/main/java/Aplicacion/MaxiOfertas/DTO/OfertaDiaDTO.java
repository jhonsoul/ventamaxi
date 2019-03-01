/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.MaxiOfertas.DTO;

/**
 *
 * @author Jhon
 */
public class OfertaDiaDTO {
    private String oferta;
    private String productos;

    public OfertaDiaDTO() {
    }

    public OfertaDiaDTO(String oferta, String productos) {
        this.oferta = oferta;
        this.productos = productos;
    }

    public String getOferta() {
        return oferta;
    }

    public void setOferta(String oferta) {
        this.oferta = oferta;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }
    
}
