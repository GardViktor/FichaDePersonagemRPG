package com.example.FichaDePersonagemRPG.Personagem;

import com.example.FichaDePersonagemRPG.Player.PlayerModel;
import org.springframework.stereotype.Component;

@Component
public class PersonagemMapper {

    public PersonagemModel map(PersonagemRequestDTO personagemRequestDTO) {
        PersonagemModel personagemModel = new PersonagemModel();
        personagemModel.setNome(personagemRequestDTO.getNome());
        personagemModel.setClasse(personagemRequestDTO.getClasse());
        personagemModel.setLevel(personagemRequestDTO.getLevel());
        personagemModel.setHp(personagemRequestDTO.getHp());
        personagemModel.setMana(personagemRequestDTO.getMana());
        personagemModel.setForca(personagemRequestDTO.getForca());
        personagemModel.setDestreza(personagemRequestDTO.getDestreza());
        personagemModel.setInteligencia(personagemRequestDTO.getInteligencia());
        personagemModel.setConstituicao(personagemRequestDTO.getConstituicao());
        personagemModel.setSabedoria(personagemRequestDTO.getSabedoria());
        personagemModel.setCarisma(personagemRequestDTO.getCarisma());
        return personagemModel;
    }

    public PersonagemResponseDTO map(PersonagemModel personagemModel) {
        PersonagemResponseDTO personagemResponseDTO = new PersonagemResponseDTO();
        personagemResponseDTO.setId(personagemModel.getId());
        personagemResponseDTO.setNome(personagemModel.getNome());
        personagemResponseDTO.setClasse(personagemModel.getClasse());
        personagemResponseDTO.setLevel(personagemModel.getLevel());
        personagemResponseDTO.setHp(personagemModel.getHp());
        personagemResponseDTO.setMana(personagemModel.getMana());
        personagemResponseDTO.setForca(personagemModel.getForca());
        personagemResponseDTO.setDestreza(personagemModel.getDestreza());
        personagemResponseDTO.setConstituicao(personagemModel.getConstituicao());
        personagemResponseDTO.setInteligencia(personagemModel.getInteligencia());
        personagemResponseDTO.setSabedoria(personagemModel.getSabedoria());
        personagemResponseDTO.setCarisma(personagemModel.getCarisma());
        personagemResponseDTO.setJogadorId(personagemModel.getJogadores().getId());
        return personagemResponseDTO;
    }
}
