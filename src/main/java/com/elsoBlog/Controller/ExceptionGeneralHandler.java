package com.elsoBlog.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionGeneralHandler{							// Ez az osztály elkapja az összes Controllerben
																// dobott Exceptiont
	@ExceptionHandler
	public String exception(Exception ex, Model model){
		model.addAttribute("exception",ex);
		return "ThePageWichHandlesException";
		
	}
	
	
}

