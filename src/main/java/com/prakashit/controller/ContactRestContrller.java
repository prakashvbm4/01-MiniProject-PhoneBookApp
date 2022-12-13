/**
 * 
 */
package com.prakashit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prakashit.binding.Contact;
import com.prakashit.service.ContactService;

/**
 * @author Prakash
 *
 */
@RestController
public class ContactRestContrller {

	@Autowired
	private ContactService contactService;

	@PostMapping("/saveContact/")
	public String createContact(@RequestBody Contact contact) {
		String status=contactService.createcontact(contact);
		return status;
	}

	
	
	
}
