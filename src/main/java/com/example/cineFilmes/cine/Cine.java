package com.example.cineFilmes.cine;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name="cine")
@Entity(name="cine")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Cine {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String imagem;
    private Long classificacao;

}
