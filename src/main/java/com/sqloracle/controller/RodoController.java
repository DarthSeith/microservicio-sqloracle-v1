package com.sqloracle.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sqloracle.entity.Rodo;
import com.sqloracle.service.IRodoService;

@Controller
@RequestMapping("/rodo")
public class RodoController {

	public static final Log LOGGER = LogFactory.getLog(RodoController.class);

	@Autowired
	@Qualifier("rodoServiceImpl")
	private IRodoService rodoService;

	/**
	 * Inserta un Objeto Rodo
	 * { "nombre":"nombre 4", "edad": 30, "fecha": "26-08-2020 21:05:06" }
	 * 
	 * @param rodo
	 * @return
	 */
	@PostMapping(value = "/add-rodo")
	public ResponseEntity<?> addRodo(@RequestBody Rodo rodo) {
		LOGGER.info("Class: " + RodoController.class + " -- METHOD: addCourse -- Param: " + rodo.toString());
		rodoService.saveRodo(rodo);
		return ResponseEntity.ok().build();
	}

	/**
	 * Lista los objeto Rodo
	 * @return
	 */
	@GetMapping(value = "/list-rodo")
	public ResponseEntity<?> listRodo() {
		LOGGER.info("Class: " + RodoController.class + " -- METHOD: listRodo");
		List<Rodo> lst = rodoService.listRodo();
		LOGGER.info(lst);
		return ResponseEntity.ok(lst);
	}

}
