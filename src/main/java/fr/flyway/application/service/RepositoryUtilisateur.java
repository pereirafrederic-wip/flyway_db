package fr.flyway.application.service;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.flyway.application.entity.Utilisateur;

@Repository
public interface RepositoryUtilisateur extends CrudRepository<Utilisateur, Long>,
		JpaSpecificationExecutor<Utilisateur> {


}
