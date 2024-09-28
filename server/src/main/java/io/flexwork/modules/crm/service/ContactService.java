package io.flexwork.modules.crm.service;

import io.flexwork.modules.crm.domain.Contact;
import io.flexwork.modules.crm.repository.ContactRepository;
import io.flexwork.modules.crm.service.dto.ContactDTO;
import io.flexwork.modules.crm.service.mapper.ContactMapper;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private ContactMapper contactMapper;
    private ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository, ContactMapper contactMapper) {
        this.contactRepository = contactRepository;
        this.contactMapper = contactMapper;
    }

    public Page<Contact> findByAccountId(Long accountId, Pageable pageable) {
        return contactRepository.findByAccountId(accountId, pageable);
    }

    public Page<Contact> getAllContacts(Pageable pageable) {
        return contactRepository.findAll(pageable);
    }

    public Optional<Contact> getContactById(Long id) {
        return contactRepository.findById(id);
    }

    public ContactDTO createContact(Contact contact) {
        return contactMapper.contactToContactDTO(contactRepository.save(contact));
    }

    public Contact updateContact(Long id, Contact contactDetails) {
        Contact contact =
                contactRepository
                        .findById(id)
                        .orElseThrow(() -> new RuntimeException("Contact not found with id " + id));

        contact.setFirstName(contactDetails.getFirstName());
        contact.setLastName(contactDetails.getLastName());
        contact.setEmail(contactDetails.getEmail());
        contact.setPhone(contactDetails.getPhone());
        contact.setPosition(contactDetails.getPosition());
        contact.setNotes(contactDetails.getNotes());

        return contactRepository.save(contact);
    }

    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
