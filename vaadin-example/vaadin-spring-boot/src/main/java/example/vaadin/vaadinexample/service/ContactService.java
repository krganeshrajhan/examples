package example.vaadin.vaadinexample.service;

import example.vaadin.vaadinexample.model.Contact;
import example.vaadin.vaadinexample.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactDao;

	public List getContacts() {
		return contactDao.findAll();
	}

	public Contact save(Contact contact) {
		contactDao.save(contact);
		return contact;
	}

	public void delete(Contact contact) {
		contactDao.delete(contact);
	}

}
