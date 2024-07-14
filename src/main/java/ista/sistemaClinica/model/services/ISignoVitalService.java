package ista.sistemaClinica.model.services;

import java.util.List;

import ista.sistemaClinica.model.entity.SignoVital;

public interface ISignoVitalService {
	public List<SignoVital> findAll();
	public SignoVital save(SignoVital signoVital);
	public SignoVital findById(Long id);
	public void delete(Long id);

}
