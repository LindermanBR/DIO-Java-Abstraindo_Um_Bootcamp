package br.com.dio.desafio.dominio;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Curso extends Conteudo{
    private int cargaHoraria;


    @Override
    public double calcularXp() {
        return this.getXP_PADRAO()  * cargaHoraria;
    }
}
