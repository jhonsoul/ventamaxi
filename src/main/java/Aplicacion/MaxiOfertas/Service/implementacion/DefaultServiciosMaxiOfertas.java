/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacion.MaxiOfertas.Service.implementacion;

import Aplicacion.MaxiOfertas.DTO.OfertaDiaDTO;
import Aplicacion.MaxiOfertas.DTO.PicoPlacaCelularDTO;
import Aplicacion.MaxiOfertas.DTO.PlatoDiaDTO;
import Aplicacion.MaxiOfertas.DTO.RuletaDTO;
import Aplicacion.MaxiOfertas.Service.ServicioMaxiOfertasService;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jhon
 */
@Service
public class DefaultServiciosMaxiOfertas implements ServicioMaxiOfertasService{

    @Override
    public PlatoDiaDTO platoDia() {
        String dia = obtenerDia();
        PlatoDiaDTO platoDiaDTO = new PlatoDiaDTO();    
        switch (dia) {
            case "Domingo":
                platoDiaDTO.setDescripcion("Lasagna de ragout de setas y champiñones, espinacas, pasas, nueces y queso Scamorza.");
                platoDiaDTO.setPreparacion("Ingredientes (para 4 raciones): 8 placas de lasaña precocida, 250 gr. de carne picada de "
                        + "ternera y cerdo, 400gr. de tomate natural triturado, 3 zanahorias, 1 cebolla, 4 dientes de ajo, 250 gr. "
                        + "de champiñones frescos, queso en lonchas o rallado, sal, pimienta, orégano, albahaca y aceite de oliva "
                        + "virgen extra.");
                platoDiaDTO.setTitulo("Lasagna de Champiñones");
                platoDiaDTO.setUrlImg("/img/lasagna_vegetal.jpg");
                break;
            case "Lunes":
                platoDiaDTO.setDescripcion("Lomo de merluza a la romana acompañado de arroz con verduras y guarnición a elegir.");
                platoDiaDTO.setPreparacion("Colocamos el pescado en una fuente y lo rociamos con jugo de limón y ponemos la sal, dejamos asi 10 minutos,"
                        + "Mientras ponemos en una sartén abundante aceite y cuando este caliente freimos las rodajas de pescado pasadas primero por "
                        + "harina y después por huevo batido, Dejamos a fuego medio hasta que este dorado el pescado por los 2 lados, sacamos y ponemos "
                        + "sobre papel de cocina para que absorva el aceite sobrante, Servimos calientes acompañados de unas buenas patatas a lo pobre y "
                        + "una buena ensalada.");
                platoDiaDTO.setTitulo("Merluza a la Romana");
                platoDiaDTO.setUrlImg("/img/merluza.jpg");
                break;
            case "Martes":
                platoDiaDTO.setDescripcion("Dos pechugas de pollo envueltas en bechamel y empanadas, huevo frito, ensalada de lechugas, tomate, patatas fritas y salsa de tomate Concassé.");
                platoDiaDTO.setPreparacion("Lo primero que vamos a hacer es pasar las pechugas por la plancha o sartén. Es necesario cocinarlas “en el punto” "
                        + "porque luego con el rebozado no se harían lo suficiente, Si queremos un mejor resultado visual del plato final, recortamos un "
                        + "poco los filetes con un cuchillo, para darles uniformidad y que se parezcan todos en tamaño, Salpimentamos los filetes al gusto "
                        + "y en una sartén (o plancha) con un poco de aceite de oliva, los pasamos vuelta y vuelta un par de minutos, Queremos que se cocinen "
                        + "“al punto”, hechos por fuera y jugosos por dentro. Retiramos y reservamos para más tarde, Una vez hechas las pechugas, pasamos a "
                        + "preparar una salsa bechamel, que ya he hecho muchas veces en el blog, Es importante que no nos queden grumos, así que si optáis "
                        + "por lo fácil, es aconsejable elaborarla con leche templada.");
                platoDiaDTO.setTitulo("Pechuga de Pollo Villaroy");
                platoDiaDTO.setUrlImg("/img/pollo_villaroy.jpg");
                break;
            case "Miércoles":
                platoDiaDTO.setDescripcion("Aceituna verde, ajo, carne de ternera, cebolla, limón, tomillo, vino blanco");
                platoDiaDTO.setPreparacion("Filetear la cebolla y los dientes de ajo y cocinar en una olla hasta que queden traslucidos, agregar la "
                        + "carne cortada en cubos grandes y cocinar durante 5min revolviendo para que la carne se dore en todos sus lados, agregar "
                        + "el vino blanco con el tomillo y dejar que rompa hervor, Una vez logrado el 1er hervor, bajar a fuego medio y agregar las "
                        + "aceitunas y el limón cortado en rodajas, tapar y cocinar durante 45min aprox, salpimentar, servir con couscous.");
                platoDiaDTO.setTitulo("Cacerola de ternera con aceitunas verdes y limón");
                platoDiaDTO.setUrlImg("/img/carne-de-ternera.jpg");
                break;
            case "Jueves":
                platoDiaDTO.setDescripcion("Ajo, cebolla, curry, pechuga de pollo, pepino, pimentón, tomate, comino, cúrcuma");
                platoDiaDTO.setPreparacion("En un recipiente mediano, combina el jugo de limón, el curry, el aceite de oliva, la sal, el comino y los dientes "
                        + "de ajo levemente aplastados, agrega el pollo y mezcla bien, deja que marine a temperatura ambiente durante 20 minutos, para "
                        + "preparar la salsa coloca en un recipiente pequeño el yogurt, el tahini, el jugo de limón y un diente de ajo picado. Reserva, "
                        + "coloca el pollo en palitos de brocheta y cocínalo. Puedes hacerlo en el horno o en una parrilla. Cocina el pollo hasta que "
                        + "quede bien tostado por fuera, luego coloca los panes de pita en el horno o en la parrilla, para que también queden bien tostados, "
                        + "coloca un pan de pita en cada plato y rellenalo con el pollo, lechuga, tomate y la salsa que preparaste, ¡Listo! Que tengas un buen "
                        + "provecho y sigue navegando con nosotros para encontrar más recetas deliciosas como esta.");
                platoDiaDTO.setTitulo("Shawarma de pollo");
                platoDiaDTO.setUrlImg("/img/pechuga-de-pollo.jpg");
                break;
            case "Viernes":
                platoDiaDTO.setDescripcion("Ají, ajo, caldo, cebolla, chorizo, laurel, orégano, panceta ahumada, perejil, zanahoria, tomate perita, tomate en lata, garbanzo, tomate ");
                platoDiaDTO.setPreparacion("Limpiar el mondongo e introducirlo en una cacerola con agua y sal gruesa, cocer a fuego lento durante hora y media. "
                        + "Retirar y cortar en tiras, en otra cacerola, rehogar la cebolla y el ajo picados, sumar los tomates peritas pelados y sin semillas "
                        + "previamente cortados en trozos pequeños, sumar las zanahorias peladas y cortadas en rodajas, la conserva de tomate y el ahí picado. "
                        + "Saltear 5 minutos e incorporar el caldo de verduras, los tomates deshidratados y cortados en trozos y las hierbas aromáticas, mezclar "
                        + "e incorporar el mondogo, el chorizo cortado en rodajas, la panceta, en cubos y pimienta, Dejar hervir lentamente hasta que el mondongo "
                        + "esté cocido (unos 40 minutos), por último, sumar los garbanzos y hervir 5 minutos más. Ir agregando caldo si es necesario, servir "
                        + "caliente y decorado con perejil picado.");
                platoDiaDTO.setTitulo("Mondongo con garbanzos, tomates secos y panceta ahumada");
                platoDiaDTO.setUrlImg("/img/mondongo.jpg");
                break;
            case "Sábado":
                platoDiaDTO.setDescripcion("Cebolla, huevo, lechuga, papa, tomate");
                platoDiaDTO.setPreparacion("Solicitar a la pescadería amiga que abra el Pacú en mariposa y lo despine (cuenta con una vértebra y espinas grandes). "
                        + "Pelar y cortar las cebollas en aros gruesos (de medio centímetro aproximadamente), pasar por huevo batido y harina. Reservar. "
                        + "Cortar las papas en bastón y reservar. Cortar los tomates redondos en rodajas de 2 centímetros. Pintar el pacú con adobo de pescado y oliva. "
                        + "Colocar sobre la parrilla caliente del lado de la carne blanca para sellar. Una vez que la carne esté marcada por los hierros de la parrilla, "
                        + "dar vuelta y volver a pintar. A los 20 minutos de cocción, colocar los tomates y cocerlos vuelta y vuelta. Salpimentar. El pacú estará cocido, "
                        + "dependiendo de su tamaño, a los 25 minutos aproximadamente con brasas candentes a media altura. Freír las papas por un lado y los aros de "
                        + "cebolla por otro. Servir sobre una tabla o plato redondo grande, en la base disponer las hojas de lechuga, sobre ellas el pacú, y encima los "
                        + "aros de cebolla y tomates. Acompañar con papas fritas.");
                platoDiaDTO.setTitulo("Pacú de río a las brasas");
                platoDiaDTO.setUrlImg("/img/tomate.jpg");
                break;
            default:
                break;
        }
        return platoDiaDTO;
    }
    
    @Override
    public OfertaDiaDTO ofertaDia() {
        String dia = obtenerDia();
        String mensaje = "Descuentos en los siguientes productos: ";
        OfertaDiaDTO oferta = new OfertaDiaDTO();
        switch (dia) {
        case "Domingo":
            oferta.setOferta("5%");
            oferta.setProductos( mensaje + "Detergente, Jabón de baño, Papel de baño y Cloro.");
            break;
        case "Lunes":
            oferta.setOferta("10%");
            oferta.setProductos(mensaje + "Arroz, Café, Azúcar y Aceite.");
            break;
        case "Martes":
            oferta.setOferta("20%");
            oferta.setProductos(mensaje + "Naranjas, Plátanos, Limones y Tortillas de maíz.");
            break;
        case "Miércoles":
            oferta.setOferta("15%");
            oferta.setProductos(mensaje + "Cereal, Jamón, Huevos y Queso blanco.");
            break;
        case "Jueves":
            oferta.setOferta("12%");
            oferta.setProductos(mensaje + "Sal, Harina de trigo, Maizena y Leche.");
            break;
        case "Viernes":
            oferta.setOferta("10%");
            oferta.setProductos(mensaje + "Pasta de dientes, Shampoo, Papel de baño y Royal.");
            break;
        case "Sábado":
            oferta.setOferta("8%");
            oferta.setProductos(mensaje + "Aguacate, Zanahorias, Lechuga y Galletas Marías.");
            break;
        default:
            break;
        }
        return oferta;
    }
    
    @Override
    public PicoPlacaCelularDTO picoPlaca(String numero) {
        String digito =  String.valueOf(numero.charAt(numero.length()-1));
        String dia = obtenerDia();
        PicoPlacaCelularDTO picoPlacaCelular = new PicoPlacaCelularDTO();
        picoPlacaCelular.setNumero(numero);
        if (!numero.equals(" ")) {
            if ((dia.equals("Lunes")&& (digito.equals("0") || digito.equals("1"))) ||
                (dia.equals("Martes")&& (digito.equals("2") || digito.equals("3"))) ||
                (dia.equals("Miércoles")&& (digito.equals("4") || digito.equals("5"))) ||
                (dia.equals("Jueves")&& (digito.equals("6") || digito.equals("7"))) ||
                (dia.equals("Viernes")&& (digito.equals("8") || digito.equals("9")))
                ) {
                picoPlacaCelular.setMensaje("Su número de celular " + numero + " tiene pico y placa hoy."); 
            } else {
                picoPlacaCelular.setMensaje("El número de celular " + numero + " no tiene pico y placa hoy."); 
            } 
        } else {
            picoPlacaCelular.setMensaje("Ingrese el número de su celular en el cuadro superior.");
        }
        return picoPlacaCelular;
    }

    @Override
    public RuletaDTO activaRuleta() {
        RuletaDTO ruleta = new RuletaDTO();
        int numero = numerosRandom();
        ruleta.setDescuento("La pagina otorga un " + numero + "% de descuento en su próxima compra.");
        return  ruleta;
    } 
    
    private String obtenerDia(){
        Calendar hoy = Calendar.getInstance();
        String[] dias = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        return dias[hoy.get(Calendar.DAY_OF_WEEK) - 1];
    }

    private int numerosRandom() {
        return ThreadLocalRandom.current().nextInt(10, 60);
    }
}
