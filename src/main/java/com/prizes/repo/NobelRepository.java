package com.prizes.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prizes.model.Nobel;

public interface NobelRepository extends JpaRepository<Nobel,Integer>{

}