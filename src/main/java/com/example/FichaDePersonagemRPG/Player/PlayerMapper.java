package com.example.FichaDePersonagemRPG.Player;

import org.springframework.stereotype.Component;

@Component
public class PlayerMapper {

    public PlayerModel map(PlayerDTO playerDTO) {
        PlayerModel playerModel = new PlayerModel();
        playerModel.setId(playerDTO.getId());
        playerModel.setNome(playerDTO.getNome());
        playerModel.setIdade(playerDTO.getIdade());
        playerModel.setEmail(playerDTO.getEmail());
        return playerModel;
    }

    public PlayerDTO map(PlayerModel playerModel) {
        PlayerDTO playerDTO = new PlayerDTO();
        playerDTO.setId(playerModel.getId());
        playerDTO.setNome(playerModel.getNome());
        playerDTO.setIdade(playerModel.getIdade());
        playerDTO.setEmail(playerModel.getEmail());
        return playerDTO;
    }
}