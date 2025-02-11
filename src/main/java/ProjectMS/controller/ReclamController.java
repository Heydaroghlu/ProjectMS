package ProjectMS.controller;

import ProjectMS.model.BaseEntity;
import ProjectMS.model.Reclam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reclam")
public class ReclamController {
    @GetMapping()
    public ResponseEntity<String> getAllReclam() {
        return ResponseEntity.ok("All Reclam");
    }
}
