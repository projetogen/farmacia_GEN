package com.generation.farmacia.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.farmacia.model.ProdutoModel;
import com.generation.farmacia.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {
	@Autowired
	private ProdutoRepository repository;
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoModel> GetById(@PathVariable long id) {
		return repository.findById(id).map(resp -> ResponseEntity.status(200).body(resp))
				.orElseThrow(()-> new ResponseStatusException(HttpStatus.BAD_REQUEST, "ID NÃO EXISTENTE"));
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<ProdutoModel>> GetByNome(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping("/save")
	public ResponseEntity<ProdutoModel> post (@Valid @RequestBody ProdutoModel produto) {
		return  ResponseEntity.status(201).body(repository.save(produto));
	}
	
	@PutMapping("/update")
	public ResponseEntity<ProdutoModel> put (@Valid @RequestBody ProdutoModel produto) {
		return ResponseEntity.status(200).body(repository.save(produto));
	}
	
	@DeleteMapping("/remove/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
}