package com.example.TP_ApiConPaginacion.Entidades;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "libro")
public class Libro extends Base{
    private String titulo;
    private int fecha;
    private String genero;
    private int paginas;

    @ManyToMany(cascade = CascadeType.REFRESH)
    @JoinTable(
            name = "libro_autor",
            joinColumns = @JoinColumn(name = "id_libro"),
            inverseJoinColumns = @JoinColumn(name = "id_autor")
    )
    @EqualsAndHashCode.Exclude
    @Builder.Default
    private List<Autor> autores = new ArrayList<>();

}