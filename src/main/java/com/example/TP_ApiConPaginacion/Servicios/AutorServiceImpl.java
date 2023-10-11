package com.example.TP_ApiConPaginacion.Servicios;

import com.example.TP_ApiConPaginacion.Entidades.Autor;
import com.example.TP_ApiConPaginacion.Repositorios.AutorRepository;
import com.example.TP_ApiConPaginacion.Repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepositoryRepository;
    public  AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository ) {
        super((baseRepository));
        this.autorRepositoryRepository = autorRepository;
    }
}
