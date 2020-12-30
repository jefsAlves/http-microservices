package com.alvesjefs.hr_hrworkers.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alvesjefs.hr_hrworkers.domain.Workers;
import com.alvesjefs.hr_hrworkers.services.WorkersService;

@RefreshScope
@RestController
@RequestMapping(value = "api/workers")
public class WorkersResource {

	@Autowired
	private WorkersService workersService;

	private static final Logger LOGGER = LoggerFactory.getLogger(WorkersResource.class);

//	test pull config server
	@Value("${test.config}")
	private String configs;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Workers> findById(@PathVariable Long id) {
		Workers worker = workersService.findById(id);
		return ResponseEntity.ok().body(worker);
	}

	@GetMapping
	public ResponseEntity<List<Workers>> findAll(Workers workers) {
		List<Workers> all = workersService.findAll(workers);
		return ResponseEntity.ok().body(all);
	}

	@GetMapping(value = "/search")
	public ResponseEntity<Workers> findByEmail(@RequestParam String email) {
		Workers findEmail = workersService.findByEmail(email);
		return ResponseEntity.ok().body(findEmail);
	}

	@GetMapping(value = "/search/findByName")
	public ResponseEntity<Workers> findByName(@RequestParam String name) {
		Workers findName = workersService.findByName(name);
		return ResponseEntity.ok().body(findName);
	}

	@GetMapping(value = "/configs")
	public ResponseEntity<Void> getConfigs() {
		LOGGER.info("CONFIGS = " + configs);
		return ResponseEntity.noContent().build();
	}
}
