package com.alvesjefs.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alvesjefs.hrpayroll.domain.Payment;
import com.alvesjefs.hrpayroll.services.PaymentsService;

@RestController
@RequestMapping(value = "api/payments")
public class PaymentResource {

	@Autowired
	private PaymentsService paymentService;

	@GetMapping(value = "/{id}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long id, @PathVariable Integer days) {
		Payment payment = paymentService.getPayment(id, days);
		return ResponseEntity.ok().body(payment);
	}
}
