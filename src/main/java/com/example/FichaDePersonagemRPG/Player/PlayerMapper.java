package com.example.FichaDePersonagemRPG.Player;

import com.example.FichaDePersonagemRPG.Personagem.PersonagemMapper;
import com.example.FichaDePersonagemRPG.Personagem.PersonagemResponseDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlayerMapper {

    private final PersonagemMapper personagemMapper;

    public PlayerMapper(PersonagemMapper personagemMapper) {
        this.personagemMapper = personagemMapper;
    }

    public PlayerModel map(PlayerRequestDTO playerRequestDTO) {
        PlayerModel playerModel = new PlayerModel();
        playerModel.setNome(playerRequestDTO.getNome());
        playerModel.setIdade(playerRequestDTO.getIdade());
        playerModel.setEmail(playerRequestDTO.getEmail());
        return playerModel;
    }

    public PlayerResponseDTO map(PlayerModel playerModel) {
        PlayerResponseDTO playerResponseDTO = new PlayerResponseDTO();
        playerResponseDTO.setId(playerModel.getId());
        playerResponseDTO.setNome(playerModel.getNome());
        playerResponseDTO.setIdade(playerModel.getIdade());
        playerResponseDTO.setEmail(playerModel.getEmail());

        List<PersonagemResponseDTO> personagens = playerModel.getPersonagens()
                .stream()
                .map(personagemMapper::map)
                .collect(Collectors.toList());

        playerResponseDTO.setPersonagens(personagens);
        return playerResponseDTO;
    }
}