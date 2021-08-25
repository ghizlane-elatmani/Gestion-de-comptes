package io.javacode.VotreBanque.dao;

import io.javacode.VotreBanque.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
