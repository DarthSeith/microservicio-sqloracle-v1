package com.sqloracle.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sqloracle.entity.Rodo;
import com.sqloracle.repository.RodoRepository;
import com.sqloracle.service.IRodoService;

@Service
public class RodoServiceImpl implements IRodoService {

	@Autowired
	private RodoRepository rodoServiceImpl;

	@Override
	public boolean saveRodo(Rodo rodo) {
		Rodo result = rodoServiceImpl.save(rodo);
		return (result != null) ? Boolean.TRUE : Boolean.FALSE;
	}

}
