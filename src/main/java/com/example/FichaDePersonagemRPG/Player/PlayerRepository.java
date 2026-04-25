package com.example.FichaDePersonagemRPG.Player;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<PlayerModel, Long> {
}
