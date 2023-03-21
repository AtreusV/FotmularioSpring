package com.example.practica.Servicios;

import com.example.practica.Entidades.Productos;

import java.util.ArrayList;

public class servicioProductos {

    private ArrayList<Productos> lista = new ArrayList<>();

    public servicioProductos(){
        lista.add(new Productos(1,50,"Manzana","Fruta",5200.0,0));
        lista.add(new Productos(2,50,"Papa","Vegetales",2200.0,0));
        lista.add(new Productos(3,50,"Fresa","Fruta",4600.0,0));
        lista.add(new Productos(4,50,"Jabon de baño","Aseo",10300.0,0));
        lista.add(new Productos(5,50,"Frijol","Grano",10400.0,0));
    }

    public ArrayList<Productos> mostrar(){
        return lista;
    }

    public int cantidad(){
        return lista.size();
    }
}
