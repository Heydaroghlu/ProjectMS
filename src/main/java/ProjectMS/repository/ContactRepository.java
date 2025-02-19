package ProjectMS.repository;

import ProjectMS.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
    public Contact findByEmail(String email);
    public Contact findByPhone(String phone);
}
