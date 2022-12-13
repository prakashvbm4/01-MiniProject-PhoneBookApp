
package com.prakashit.binding;

import jakarta.persistence.GeneratedValue;
import lombok.Data;

/**
 * @author Prakash
 *
 */
@Data
public class Contact {
	
	@GeneratedValue
	private Integer contactId;
	private String contactName;
	private String contactEmail;
	private Long phoneNum;

}
