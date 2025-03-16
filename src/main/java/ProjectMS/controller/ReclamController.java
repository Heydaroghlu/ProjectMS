package ProjectMS.controller;

import ProjectMS.dto.reclamDtos.reclamGetDto;
import ProjectMS.dto.reclamDtos.reclamPostDto;
import ProjectMS.dto.reclamDtos.reclamPutDto;
import ProjectMS.model.BaseEntity;
import ProjectMS.model.Reclam;
import ProjectMS.service.IReclamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/reclam")
public class ReclamController {
    private final IReclamService reclamService;
    @GetMapping("/getall")
    public ResponseEntity<List<reclamGetDto>> getAllReclam() {
        return ResponseEntity.ok(reclamService.getAllReclam());
    }
    @GetMapping("/{id}")
    public ResponseEntity<reclamGetDto> getReclamById(@PathVariable int id) {
        reclamGetDto reclam=reclamService.getReclamById(id);
        if (reclam!=null) {
            return ResponseEntity.ok(reclam);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping("/create")
    public ResponseEntity<reclamGetDto> createReclam(@RequestBody reclamPostDto reclam) {
        return ResponseEntity.ok(reclamService.saveReclam(reclam));
    }
    @PutMapping
    public ResponseEntity<reclamGetDto> updateReclam(@RequestBody reclamPutDto reclam) {
        return ResponseEntity.ok(reclamService.updateReclam(reclam));
    }
    @DeleteMapping
    public ResponseEntity delete(@PathVariable int id) {
        reclamService.deleteReclam(id);
        return ResponseEntity.ok().build();
    }

}
