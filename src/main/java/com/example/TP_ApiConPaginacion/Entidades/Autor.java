package com.example.TP_ApiConPaginacion.Entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "autor")
public class Autor extends Base {
    private String nombre;
    private String apellido;
    private String biografia;

}