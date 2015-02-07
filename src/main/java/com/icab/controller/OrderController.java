package com.icab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.icab.model.OrderDetails;

@Controller
public class OrderController {

	private final Logger logger = LoggerFactory
			.getLogger(OrderController.class);

	@RequestMapping(value = "/placeOrder")
	public String showOrderForm(Model model) {
		model.addAttribute("orderDetails", new OrderDetails());
		return "register";

	}
	
	@RequestMapping(value="/saveOrder", method=RequestMethod.POST)
	public void saveOrder(@ModelAttribute("orderDetails") OrderDetails orderDetails){
		
		logger.info(orderDetails.getUser().getFullName());
		
		
	}

}
