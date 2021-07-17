package booknow.services;

import booknow.model.BusinessModel;

public interface BusinessInterface
{
	public boolean createBusiness(BusinessModel data);
	public BusinessModel getBusiness(String business_id);

}
