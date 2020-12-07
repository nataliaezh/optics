package com.hedgehogs.controllers;

import com.hedgehogs.entities.Lenses;
import com.hedgehogs.services.LensesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author natalya_ezhkova@mail.ru
 */

@RestController
@RequestMapping("api/v1/lenses")
public class LensesController {
	@Autowired
	private LensesService lensesService;

	@GetMapping("/")
	@ResponseBody
	public List<Lenses> findAll() {
		return (List<Lenses>) lensesService.getAllLenses();
	}

	@GetMapping("/{id}")
	public Lenses findByOne(@PathVariable Long id){
		return lensesService.getLensesRepository().findByOne(id);

	}

	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public Lenses addLenses(@RequestBody Lenses lenses){
		lenses.setId(2L);
		return lensesService.save(lenses);
	}

	@PutMapping("/")
	public Lenses updateLenses(@RequestBody Lenses lenses){
		return lensesService.save(lenses);
	}

	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Lenses lenses){
		lensesService.deleteLenses(lenses);
	}

}
