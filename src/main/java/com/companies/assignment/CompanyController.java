package com.companies.assignment;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
	@RequestMapping("Hello")
	public String hello() {
		return "Hello World!";
	}
	@Autowired
	private CompanyService companyService;

	@RequestMapping("/companies")
	public List<Company> getCompanies() {
		return companyService.getCompanies();
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/companies")
	public void addCompany(@RequestBody Company company) {
		companyService.addCompany(company);
	}
	
	@RequestMapping("/companies/{id}")
	public Optional<Company> getCompany(@PathVariable String id){
		System.out.println("Inside getCompany");
		return companyService.getCompany(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/companies/{id}")
	public void updateCompany(@RequestBody Company company, @PathVariable String id) {
		System.out.println("inside updateCompany");
		companyService.updateCompany(id, company);
	}


	@RequestMapping(method=RequestMethod.DELETE, value="/companies/{id}")
	public void deleteCompany(@PathVariable String id){
		System.out.println("Inside deleteCompany");
		companyService.deleteCompany(id);
	}
}
