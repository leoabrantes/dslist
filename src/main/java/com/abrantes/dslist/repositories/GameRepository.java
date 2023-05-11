package com.abrantes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrantes.dslist.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long>{

}
