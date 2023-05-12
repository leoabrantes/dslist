package com.abrantes.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrantes.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository <GameList, Long>{

}
