package ProjectMS.service;

import ProjectMS.dto.reclamDtos.reclamGetDto;
import ProjectMS.dto.reclamDtos.reclamPostDto;
import ProjectMS.dto.reclamDtos.reclamPutDto;

import java.util.List;

public interface IReclamService {
    public List<reclamGetDto> getAllReclam();
    public reclamGetDto getReclamById(int id);
    public reclamGetDto saveReclam(reclamPostDto reclam);
    public reclamGetDto updateReclam(reclamPutDto reclam);
    public void deleteReclam(int id);
}
