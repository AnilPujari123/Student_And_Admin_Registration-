package com.student.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class FrontendController extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] aboutConfiguration= {StundentConfig.class};
		return aboutConfiguration;
	}

	@Override
	protected String[] getServletMappings() {
		String Mapping[]= {"/"};
		return Mapping;
	}
	
}
