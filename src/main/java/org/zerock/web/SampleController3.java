package org.zerock.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.domain.ProductVo;

@Controller
public class SampleController3 {

	private static final Logger logger=
			LoggerFactory.getLogger(SampleController3.class);
	
	@RequestMapping("/doD")
	public String doA(Model model) {
		logger.info("doD Called.............");
		ProductVo product = new ProductVo("Sample",10000);
		
		model.addAttribute(product);
		
		return "productDetail";
	}
}
