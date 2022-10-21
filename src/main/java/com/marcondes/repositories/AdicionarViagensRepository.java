package com.marcondes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcondes.model.entities.AdicionarViagens;

@Repository
public interface AdicionarViagensRepository extends JpaRepository<AdicionarViagens, Long> {

}
