package com.example.TP_ApiConPaginacion.Controladores;

import com.example.TP_ApiConPaginacion.Entidades.Libro;
import com.example.TP_ApiConPaginacion.Servicios.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/libros")
public class LibroController extends  BaseControllerImpl<Libro, LibroServiceImpl>{
}
