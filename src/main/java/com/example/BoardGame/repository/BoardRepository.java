package com.example.BoardGame.repository;

import com.example.BoardGame.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board,Long> {//<Entitiy, id유형>
}