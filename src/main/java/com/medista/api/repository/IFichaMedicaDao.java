package com.medista.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.medista.api.entity.FichaMedica;
import com.medista.api.entity.Paciente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IFichaMedicaDao extends JpaRepository<FichaMedica, Long> {

	FichaMedica findByPaciente(Paciente paciente);

	// Solución 2: Query nativa específica para PostgreSQL
	@Query(value = "SELECT f.* FROM ficha_medica f " +
			"JOIN paciente p ON p.id = f.fk_id_pac " +
			"WHERE (:cedula IS NULL OR p.cedula = :cedula) " +
			"AND (:apellido IS NULL OR LOWER(p.apellido::text) LIKE LOWER(CONCAT('%', :apellido, '%'))) " +
			"AND (:profesion IS NULL OR LOWER(p.profesion::text) LIKE LOWER(CONCAT('%', :profesion, '%')))",
			nativeQuery = true)
	List<FichaMedica> buscarPorFiltros(@Param("cedula") String cedula,
									   @Param("apellido") String apellido,
									   @Param("profesion") String profesion);
}