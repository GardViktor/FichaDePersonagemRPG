package com.example.FichaDePersonagemRPG.Personagem;

import com.example.FichaDePersonagemRPG.Player.PlayerResponseDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonagemResponseDTO {

    private Long id;
    private String nome;
    private String classe;
    private int level;
    private int hp;
    private int mana;
    private int forca;
    private int destreza;
    private int constituicao;
    private int inteligencia;
    private int sabedoria;
    private int carisma;
    private Long jogadorId;
}
