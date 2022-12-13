package com.prakashit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prakashit.binding.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> {

}
