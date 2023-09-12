package com.estudantes.estudantes.dtos;

public record EstudanteResponse(
    Long id,
    String name,
    String email,
    String curso,
    String telefone
) {
    
}
