package io.javacode.VotreBanque.dao;

import io.javacode.VotreBanque.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, String> {
}
