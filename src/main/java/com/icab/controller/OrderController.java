package com.icab.controller;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.icab.constant.OrderType;
import com.icab.constant.PrefferedDay;
import com.icab.model.OrderDetails;

@Controller
public class OrderController {

	private final Logger logger = LoggerFactory
			.getLogger(OrderController.class);

	@ModelAttribute("orderTypes")
	public List<OrderType> getAllOrderType() {
		List<OrderType> orderTypes = Arrays.asList(OrderType.values());
		return orderTypes;

	}

	@ModelAttribute("prefferedDay")
	public List<PrefferedDay> getAllPrefferedDay() {
		List<PrefferedDay> days = Arrays.asList(PrefferedDay.values());
		return days;
	}

	@RequestMapping(value = "/placeOrder")
	public String showOrderForm(Model model) {
		model.addAttribute("orderDetails", new OrderDetails());
		return "register";

	}

	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST)
	public void saveOrder(
			@ModelAttribute("orderDetails") OrderDetails orderDetails) {

		logger.info(orderDetails.toString());

	}

}
