package com.alvesjefs.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alvesjefs.hrpayroll.domain.Workers;

@FeignClient(name = "hr-workers", path = "api/workers")
@Component
public interface WorkersFeignClient {

	@GetMapping(value = "{id}")
	ResponseEntity<Workers> findById(@PathVariable Long id);

}
