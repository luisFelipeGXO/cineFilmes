package com.example.cineFilmes.cine;

public record CineResponseDTO(Long id, String titulo, String imagem, Long classificacao) {

    public CineResponseDTO(Cine cine) {
        this(cine.getId(), cine.getTitulo(), cine.getImagem(), cine.getClassificacao());

    }
}
