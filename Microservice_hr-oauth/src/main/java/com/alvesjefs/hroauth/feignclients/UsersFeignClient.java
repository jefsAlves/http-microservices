package com.alvesjefs.hroauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.alvesjefs.hroauth.domain.Users;

@FeignClient(name = "hr-users", path = "api/users")
@Component
public interface UsersFeignClient {

	@GetMapping(value = "/search")
	ResponseEntity<Users> findByEmail(@RequestParam String email);
}
