package com.grzybowski.mateusz.vehicle.fullVehicleAplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {

	@GetMapping("/vehicleTypes")
	public String goHome(){
		return "vehicleType";
	}
}