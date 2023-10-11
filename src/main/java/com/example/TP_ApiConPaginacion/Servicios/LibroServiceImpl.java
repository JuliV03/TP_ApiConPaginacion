package com.example.TP_ApiConPaginacion.Servicios;

import com.example.TP_ApiConPaginacion.Entidades.Libro;
import com.example.TP_ApiConPaginacion.Repositorios.BaseRepository;
import com.example.TP_ApiConPaginacion.Repositorios.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro, Long> implements LibroService {
    @Autowired
    private LibroRepository libroRepositoryRepository;
    public  LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository ) {
        super((baseRepository));;
        this.libroRepositoryRepository = libroRepository;
    }

}
