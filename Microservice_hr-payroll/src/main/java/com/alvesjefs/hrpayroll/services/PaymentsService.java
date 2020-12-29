package com.alvesjefs.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.hrpayroll.domain.Payment;
import com.alvesjefs.hrpayroll.domain.Workers;
import com.alvesjefs.hrpayroll.feignclients.WorkersFeignClient;

@Service
public class PaymentsService {

	@Autowired
	private WorkersFeignClient workersFeignClient;

	public Payment getPayment(Long id, Integer days) {
		Workers workers = workersFeignClient.findById(id).getBody();
		return new Payment(workers.getName(), days, workers.getDayIncome());
	}
}
