package br.com.dio.desafio.dominio;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Conteudo {
    private final double XP_PADRAO = 10;
    private String titulo;
    private String descricao;

    public abstract double calcularXp();

}
