package booknow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.*;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BusinessModel
{
	@Id
	String business_id;
	String name;
	String fullname;
	String mobile;
	String currency_code;
	@CreationTimestamp
	private Date createdate;
	
	@UpdateTimestamp
	private Date modifydate;

}
