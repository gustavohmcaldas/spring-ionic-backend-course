package com.gcaldas.conceptualmodel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcaldas.conceptualmodel.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}