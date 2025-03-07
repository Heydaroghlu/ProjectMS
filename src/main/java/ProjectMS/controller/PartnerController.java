package ProjectMS.controller;

import ProjectMS.dto.partnerDtos.getPartnerDto;
import ProjectMS.dto.partnerDtos.postPartnerDto;
import ProjectMS.dto.partnerDtos.putPartnerDto;
import ProjectMS.service.IPartnerService;
import ProjectMS.service.Imp.PartnerService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/partner")
public class PartnerController {
    private final IPartnerService partnerService;
    @GetMapping("/all")
    public List<getPartnerDto> getAllPartner() {
        return partnerService.getAllPartner(false);
    }
    @GetMapping("/{id}")
    public getPartnerDto getPartnerById(@PathVariable int id) {
        return partnerService.getById(id);
    }
    @PostMapping
    public getPartnerDto savePartner(@RequestBody postPartnerDto partnerDto) {
        return partnerService.savePartner(partnerDto);
    }
    @PutMapping
    public getPartnerDto updatePartner(@RequestBody putPartnerDto partnerDto) {
        return partnerService.updatePartner(partnerDto);
    }
    @DeleteMapping
    public void deletePartner(@PathVariable int id) {
        partnerService.deletePartner(id);
    }
}
