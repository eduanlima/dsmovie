package com.eduanlima.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eduanlima.dsmovie.entities.Score;
import com.eduanlima.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
}
