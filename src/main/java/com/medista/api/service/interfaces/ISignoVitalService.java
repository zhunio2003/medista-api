package com.medista.api.service.interfaces;

import java.util.List;

import com.medista.api.entity.SignoVital;

public interface ISignoVitalService {
	public List<SignoVital> findAll();
	public SignoVital save(SignoVital signoVital);
	public SignoVital findById(Long id);
	public void delete(Long id);

}
