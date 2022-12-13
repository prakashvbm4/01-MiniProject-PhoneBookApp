package com.prakashit.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.prakashit.binding.Contact;
import com.prakashit.repo.ContactRepo;
import com.prakashit.service.ContactService;

public class ContactServiceImpl implements ContactService {
	
	@Autowired
	private ContactRepo contactRepo;

	@Override
	public String createcontact(Contact contact) {
		contact=contactRepo.save(contact);
		String status="contact saved";
		if(null == contact.getContactId()) {
			status="contact not saved";
		}
		return status;
	}

}
