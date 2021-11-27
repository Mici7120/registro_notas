package com.api.registroNotas.Servicios;


import java.util.ArrayList;

import com.api.registroNotas.Modelos.EstudianteModelo;
import com.api.registroNotas.Repositorios.EstudianteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstudianteServicio {
    @Autowired
    EstudianteRepositorio repo;

    public ArrayList<EstudianteModelo> obtenerTodos(){
        return (ArrayList<EstudianteModelo>) repo.findAll();
    }

    public EstudianteModelo guardarEstudiante(EstudianteModelo estudiante){
        return estudiante;
    }

    public EstudianteModelo buscarEstudiantePorNombre(String nombre){
        return repo.findByNombre(nombre);
    }

    public EstudianteModelo buscarEstudiantePorApellidos(String apellidos){
        return repo.findByApellidos(apellidos);
    }

    public EstudianteModelo buscarEstudiantePorCodigo(String codigo){
        return repo.findByCodigo(codigo);
    }

    public EstudianteModelo buscarEstudiantePorCorreo(String correo){
        return repo.findByCorreo(correo);
    }
}
