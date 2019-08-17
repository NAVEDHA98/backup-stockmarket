package com.premium.stc.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.premium.stc.model.Company;

public interface CompanyController {
	    public String insertCompany( Company company) throws Exception;
	    public Company updateCompany(Company company)throws Exception;
		public ModelAndView getCompanyList() throws Exception;
}
