package ProjectMS.service.Imp;

import ProjectMS.dto.reclamDtos.reclamGetDto;
import ProjectMS.dto.reclamDtos.reclamPostDto;
import ProjectMS.dto.reclamDtos.reclamPutDto;
import ProjectMS.service.IReclamService;

import java.util.List;

public class ReclamService implements IReclamService {
    @Override
    public List<reclamGetDto> getAllReclam() {
        return List.of();
    }

    @Override
    public reclamGetDto getReclamById(int id) {
        return null;
    }

    @Override
    public reclamGetDto saveReclam(reclamPostDto reclam) {
        return null;
    }

    @Override
    public reclamGetDto updateReclam(reclamPutDto reclam) {
        return null;
    }

    @Override
    public void deleteReclam(int id) {

    }
}
