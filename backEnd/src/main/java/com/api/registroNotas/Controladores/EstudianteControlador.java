package com.api.registroNotas.Controladores;

import java.util.ArrayList;

import com.api.registroNotas.Modelos.EstudianteModelo;
import com.api.registroNotas.Servicios.EstudianteServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiante")
public class EstudianteControlador {

    @Autowired
    EstudianteServicio servicio;

    @GetMapping()
    public ArrayList<EstudianteModelo> getTodos(){
        return servicio.obtenerTodos();
    }

}
