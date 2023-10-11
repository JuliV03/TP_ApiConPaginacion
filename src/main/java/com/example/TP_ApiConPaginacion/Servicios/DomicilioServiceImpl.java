package com.example.TP_ApiConPaginacion.Servicios;

import com.example.TP_ApiConPaginacion.Entidades.Domicilio;

import java.util.List;

import com.example.TP_ApiConPaginacion.Repositorios.BaseRepository;
import com.example.TP_ApiConPaginacion.Repositorios.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio, Long> implements DomicilioService {
    @Autowired
    private DomicilioRepository domicilioRepositoryRepository;
    public  DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository, DomicilioRepository domicilioRepository ) {
        super((baseRepository));;
        this.domicilioRepositoryRepository = domicilioRepository;
    }

}