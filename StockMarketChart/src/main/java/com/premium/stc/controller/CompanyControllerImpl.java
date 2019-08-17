package com.premium.stc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.premium.stc.model.Company;
import com.premium.stc.service.*;
@Controller
public class CompanyControllerImpl implements CompanyController {
	@Autowired
	private CompanyService companyService;
	
	@RequestMapping(path="/insertCompanyPage" )
	public String insertCompanyPage(Model model)
	{
		Company company = new Company();
		model.addAttribute("company", company);
		return "insertCompanyPage";	
	}
		
	@RequestMapping(path="/insert", method = RequestMethod.POST)
	public String insertCompany(Company company)
	{
		try 
		{
			companyService.insertCompany(company);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}   
		return "redirect:companyList";
		
	}
	
	public Company updateCompany(Company company) throws Exception {
		return companyService.updateCompany(company);
	}

	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList() throws Exception {
		List<Company> list=companyService.getCompanyList();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("listCompanyDetails");
		mv.addObject("list", list);
		return mv;
	}
}
