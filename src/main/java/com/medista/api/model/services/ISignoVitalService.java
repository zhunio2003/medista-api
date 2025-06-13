package com.medista.api.model.services;

import java.util.List;

import com.medista.api.model.entity.SignoVital;

public interface ISignoVitalService {
	public List<SignoVital> findAll();
	public SignoVital save(SignoVital signoVital);
	public SignoVital findById(Long id);
	public void delete(Long id);

}
