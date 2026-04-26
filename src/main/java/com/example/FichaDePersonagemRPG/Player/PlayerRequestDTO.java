package com.example.FichaDePersonagemRPG.Player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerRequestDTO {

    private String nome;
    private int idade;
    private String email;
}
