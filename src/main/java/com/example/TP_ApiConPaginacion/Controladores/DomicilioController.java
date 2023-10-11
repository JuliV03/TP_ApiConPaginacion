package com.example.TP_ApiConPaginacion.Controladores;

import com.example.TP_ApiConPaginacion.Entidades.Domicilio;
import com.example.TP_ApiConPaginacion.Servicios.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/domicilios")
public class DomicilioController extends  BaseControllerImpl<Domicilio, DomicilioServiceImpl>{
}
