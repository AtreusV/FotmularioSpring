package com.example.practica.Servicios;

import com.example.practica.Entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class servicioUsuario {

    ArrayList<Usuario> lista= new ArrayList<>();

    public  servicioUsuario(){
        lista.add(new Usuario(10,"Arturo","colombia",LocalDate.of(2023,02,28),"Arturo@mail.com"));
        lista.add(new Usuario(11,"Pablo","Ecuador",LocalDate.of(2023,03,14),"Pablo@mail.com"));
        lista.add(new Usuario(12,"Juan","Polonia",LocalDate.of(2023,04,16),"Juan@mail.com"));
    }

    public ArrayList<Usuario> listar(){
        return lista;
    }

    public String agregarUsuario(Usuario usuario){
        lista.add((usuario));
        return "registro exitoso";
    }

    public Usuario buscarusuario(int codigo){
        Usuario usu = null;

        for(Usuario u: lista){
            if(u.getIdUsuario()==codigo){
                usu=u;
            }
        }
        return usu;
    }
}

