package com.example.FichaDePersonagemRPG.Player;

import com.example.FichaDePersonagemRPG.Personagem.PersonagemModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="tb_player")
public class PlayerModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    @Column(unique = true)
    private String email;
    @OneToMany(mappedBy = "jogadores")
    @JsonIgnore
    private List<PersonagemModel> personagens;
}
