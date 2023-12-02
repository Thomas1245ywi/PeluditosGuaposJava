package com.example.PeluditosGuapos.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")
public class controlador {

   
    @GetMapping("")
	public String index() {

		return "index_real";

	}

	@GetMapping("inicio_sesion")
	public String inicio_sesion() {

		return "inicio_sesion";

	}

	@GetMapping("registrarme")
	public String registrarme() {

		return "registarme";

	}
 

}
