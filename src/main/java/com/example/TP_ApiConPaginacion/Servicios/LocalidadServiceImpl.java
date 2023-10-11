package com.example.TP_ApiConPaginacion.Servicios;
import com.example.TP_ApiConPaginacion.Entidades.Localidad;
import com.example.TP_ApiConPaginacion.Repositorios.BaseRepository;
import com.example.TP_ApiConPaginacion.Repositorios.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;


@Service
public class LocalidadServiceImpl  extends  BaseServiceImpl<Localidad, Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepositoryRepository;
    public  LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository ) {
        super((baseRepository));
        this.localidadRepositoryRepository= localidadRepository;
    }

}
