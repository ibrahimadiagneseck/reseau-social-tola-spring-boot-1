package sn.esp.tola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sn.esp.tola.entities.FichierDB;

public interface FichierDBRepository extends JpaRepository<FichierDB, String> {

	FichierDB findByNom(String nom);
}
