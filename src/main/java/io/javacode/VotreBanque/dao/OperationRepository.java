package io.javacode.VotreBanque.dao;

import io.javacode.VotreBanque.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationRepository extends JpaRepository<Operation, Long> {
}
