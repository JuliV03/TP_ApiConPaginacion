package com.example.TP_ApiConPaginacion.Controladores;
import com.example.TP_ApiConPaginacion.Entidades.Localidad;
import com.example.TP_ApiConPaginacion.Servicios.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/basedatos/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
}
