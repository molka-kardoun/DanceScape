package org.sid.ebankingbackend.repository;

import org.sid.ebankingbackend.entities.Claim;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ClaimRepository extends JpaRepository<Claim,Long> {
}
