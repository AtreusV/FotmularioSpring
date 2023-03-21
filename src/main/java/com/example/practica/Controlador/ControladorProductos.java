package com.example.practica.Controlador;


import com.example.practica.Entidades.Productos;
import com.example.practica.Servicios.servicioProductos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ControladorProductos {

    servicioProductos servicio = new servicioProductos();


    @GetMapping("/listarproductos")
    public ArrayList<Productos> listar(){
        return servicio.mostrar();
    }

    @GetMapping("/listarcantidad")
    public int cantidadproductos(){
        return servicio.cantidad();
    }

}
