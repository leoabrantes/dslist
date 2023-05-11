package com.abrantes.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abrantes.dslist.dto.GameMinDTO;
import com.abrantes.dslist.entities.Game;
import com.abrantes.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository  gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).collect(Collectors.toList());
	}

}
