package ProjectMS.service;

import ProjectMS.dto.contactDtos.getContactDto;
import ProjectMS.dto.contactDtos.postContactDto;

import java.util.List;

public interface IContactService {
    public getContactDto getContactById(int id);
    public getContactDto getContactByEmail(String email);
    public getContactDto getContactByPhone(String phone);
    public List<getContactDto> getAllContacts();
    public getContactDto addContact(postContactDto contact);

}
