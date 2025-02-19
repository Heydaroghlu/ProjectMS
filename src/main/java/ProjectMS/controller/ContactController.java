package ProjectMS.controller;

import ProjectMS.dto.contactDtos.getContactDto;
import ProjectMS.dto.contactDtos.postContactDto;
import ProjectMS.service.Imp.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/contact")
public class ContactController {
    private final ContactService contactService;
    @GetMapping
    public ResponseEntity<List<getContactDto>> getAllContacts() {
        return  ResponseEntity.ok(contactService.getAllContacts());
    }
    @GetMapping("/{id}")
    public ResponseEntity<getContactDto> getContactById(@PathVariable int id) {
        return ResponseEntity.ok(contactService.getContactById(id));
    }
    @PostMapping
    public ResponseEntity<getContactDto> addContact(@RequestBody postContactDto postContactDto) {
        return ResponseEntity.ok(contactService.addContact(postContactDto));
    }
    @DeleteMapping
    public ResponseEntity deleteContactById(@RequestParam int id) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
