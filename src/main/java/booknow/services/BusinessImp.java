package booknow.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import booknow.doa.BusinessDao;
import booknow.model.BusinessModel;

@Service
public class BusinessImp implements BusinessInterface
{
	
	@Autowired
	BusinessDao dao;
	
	@Override
	public boolean createBusiness(BusinessModel data)
	{
		Optional<BusinessModel>obusiness =dao.findById(data.getBusiness_id());
		if(obusiness.isPresent()==false)
		{
			dao.save(data);
			return true;
		}
		else
		{
			return false;
		}
		
	}


	@Override
	public BusinessModel getBusiness(String business_id)
	{
	      Optional<BusinessModel> obusiness= dao.findById(business_id);
	      if(obusiness.isPresent()==true)
	      {
	    	  return obusiness.get();
	      }
	      else
	      {
	    	  return null;
	      }
	}





}
