package com.generation.Farmacia.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.Farmacia.model.CategoriaModel;
import com.generation.Farmacia.repository.CategoriaRepository;

@RestController   //
@RequestMapping("/categoria")
@CrossOrigin (origins = "*", allowedHeaders = "*")

public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>>getAll(){
		return ResponseEntity.ok(repository.findAll());
		
	}
	

}
