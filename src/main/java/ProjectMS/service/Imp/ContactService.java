package ProjectMS.service.Imp;

import ProjectMS.dto.contactDtos.getContactDto;
import ProjectMS.dto.contactDtos.postContactDto;
import ProjectMS.model.Contact;
import ProjectMS.repository.ContactRepository;
import ProjectMS.service.IContactService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContactService implements IContactService {
    private final ContactRepository contactRepository;
    private final ModelMapper mapper;
    @Override
    public getContactDto getContactById(int id) {
        Optional<Contact> contact=contactRepository.findById(id);
        if(contact==null)
        {
            return null;
        }
        return mapper.map(contact, getContactDto.class);
    }

    @Override
    public getContactDto getContactByEmail(String email) {
        Contact contact=contactRepository.findByEmail(email);
        if(contact==null)
        {
            return null;
        }
        return mapper.map(contact, getContactDto.class);
    }

    @Override
    public getContactDto getContactByPhone(String phone) {
        Contact contact=contactRepository.findByPhone(phone);
        if(contact==null)
        {
            return null;
        }
        return mapper.map(contact, getContactDto.class);
    }

    @Override
    public List<getContactDto> getAllContacts() {
        return List.of();
    }

    @Override
    public getContactDto addContact(postContactDto contact) {
        return null;
    }
}
