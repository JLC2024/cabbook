package com.bookacab.cabbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bookacab.cabbook.model.Cabs;
import com.bookacab.cabbook.repository.CabRepository;

@Service
public class CabService {
	private final CabRepository cabRepository;

	@Autowired
    public CabService(CabRepository cabRepository) {
        this.cabRepository = cabRepository;
    }
	

   
}
