package com.example.FichaDePersonagemRPG.Player;

import com.example.FichaDePersonagemRPG.Personagem.PersonagemModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDTO {

    private Long id;
    private String nome;
    private int idade;
    private String email;
    private List<PersonagemModel> personagens;
}
