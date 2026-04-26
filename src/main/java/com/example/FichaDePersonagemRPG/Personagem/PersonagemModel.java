package com.example.FichaDePersonagemRPG.Personagem;

import com.example.FichaDePersonagemRPG.Player.PlayerModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_personagem")
public class PersonagemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String classe;
    private int level;
    private int hp;
    private int mana;
    @Column(name = "str")
    private int forca;
    @Column(name = "dex")
    private int destreza;
    @Column(name = "con")
    private int constituicao;
    @Column(name = "int")
    private int inteligencia;
    @Column(name = "wis")
    private int sabedoria;
    @Column(name = "cha")
    private int carisma;
    @ManyToOne
    @JoinColumn(name = "player_id")
    private PlayerModel jogadores;
}
