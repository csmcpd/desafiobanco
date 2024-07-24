package com.javapoobanco.desafiobanco;

import java.util.List;
import lombok.*;

@Getter
@Setter

public class Banco {

    private String nome;
    private List<Conta> contas;

}
