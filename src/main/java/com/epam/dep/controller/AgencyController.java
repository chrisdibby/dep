package com.epam.dep.controller;

import com.epam.dep.service.AgencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@Controller
@RequestMapping("/")
public class AgencyController {

	@Autowired
    AgencyService agencyService;
	
	@GetMapping("/agency")
	public String showAllAgencies(Model model) {
	    model.addAttribute("agencies", agencyService.findAll());
	    return "showAgenciesList";
	}

    @GetMapping("/agency/{id}")
    public String getAgencyById(@PathVariable("id") String id, Model model) throws IOException {
        model.addAttribute("agency", agencyService.getAgencyById(id));
        return "showAgency";
    }

}