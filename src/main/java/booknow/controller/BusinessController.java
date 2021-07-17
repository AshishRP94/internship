package booknow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import booknow.model.BusinessModel;
import booknow.services.BusinessImp;

@RestController
@RequestMapping("api/v1/business")
public class BusinessController
{
	@Autowired
	BusinessImp businessimp;
	@PostMapping("/create")
	public boolean createBusinness(@RequestBody BusinessModel business)
	{
		return businessimp.createBusiness(business);
	}
	
	@GetMapping("/{business_id}")
	public BusinessModel createBusinness(@PathVariable("business_id") String id)
	{
		return businessimp.getBusiness(id);
	}

}
