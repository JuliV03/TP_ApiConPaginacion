package com.example.TP_ApiConPaginacion.Controladores;

import com.example.TP_ApiConPaginacion.Entidades.Autor;
import com.example.TP_ApiConPaginacion.Servicios.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl> {
}
