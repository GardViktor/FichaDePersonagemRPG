package com.example.FichaDePersonagemRPG.Player;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.FichaDePersonagemRPG.Personagem.PersonagemResponseDTO;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerResponseDTO {

    private Long id;
    private String nome;
    private int idade;
    private String email;
    private List<PersonagemResponseDTO> personagens;
}
