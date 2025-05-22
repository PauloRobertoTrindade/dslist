package com.trindade.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trindade.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
