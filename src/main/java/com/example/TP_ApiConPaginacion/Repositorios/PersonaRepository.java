package com.example.TP_ApiConPaginacion.Repositorios;


import com.example.TP_ApiConPaginacion.Entidades.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonaRepository extends BaseRepository<Persona, Long> {
    //Metodo de Query
    //Busca y devuelve una lista
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

   Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable); //Con paginación

    //busca y solo devuelve si lo encontró o no
   // boolean existsByDni (int dni);

    //JPQL parametros indexados
   // @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'") // Es para decir cuantos parámetros pasar '%?1%'
    //List<Persona> serach (@Param("filtro") String filtro);

   // @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'") // Es para decir cuantos parámetros pasar '%?1%'
    //Page<Persona> serach (@Param("filtro") String filtro, Pageable pageable);//Con paginación
    //JPQL parametros nombrados
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'")
    List<Persona> search(@Param("filtro") String filtro);


    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'")
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);//Con paginación

    //Query Nativo
    @Query(
            value = "SELECT * FROM persona  WHERE persona.nombre LIKE '%:filtro%' OR persona.apellido LIKE '%:filtro%'",
            nativeQuery = true
    )
    List<Persona> searchNativo (@Param("filtro") String filtro);


    @Query(
            value = "SELECT * FROM persona  WHERE persona.nombre LIKE '%:filtro%' OR persona.apellido LIKE '%:filtro%'",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo (@Param("filtro") String filtro, Pageable pageable);//Con paginación
}
