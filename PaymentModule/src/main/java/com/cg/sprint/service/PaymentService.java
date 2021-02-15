package com.cg.sprint.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprint.domain.Payment;
import com.cg.sprint.exception.PaymentNameException;
import com.cg.sprint.repo.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepository;
		
	
	
	public Payment saveOrUpdate(Payment payment){
		
		try {
			payment.setName(payment.getName().toUpperCase());
			return paymentRepository.save(payment);
		}
		catch(Exception e)
		{            
			throw new PaymentNameException("Name : "+payment.getName().toUpperCase()+" already exists");
		}
		
	}
	
	public List<Payment> getAllPayments()   
	{  
	List<Payment> payments = new ArrayList<Payment>();  
	paymentRepository.findAll().forEach(pay -> payments.add(pay));  
	return payments;  
	}  
	
	public Payment findPaymentById(int id) {
		return paymentRepository.findById(id).get();
	}
	
	public void deletePayment(int id){
		 paymentRepository.deleteById(id);
	}
	
	public Payment Update(Payment payment,int id){
		return paymentRepository.save(payment);
	}
	
	
}
