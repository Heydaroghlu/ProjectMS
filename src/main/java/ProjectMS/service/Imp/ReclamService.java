package ProjectMS.service.Imp;

import ProjectMS.dto.reclamDtos.reclamGetDto;
import ProjectMS.dto.reclamDtos.reclamPostDto;
import ProjectMS.dto.reclamDtos.reclamPutDto;
import ProjectMS.model.Reclam;
import ProjectMS.repository.ReclamRepository;
import ProjectMS.service.IReclamService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ReclamService implements IReclamService {
    private final ReclamRepository reclamRepository;
    private final ModelMapper mapper;
    @Override
    public List<reclamGetDto> getAllReclam() {
        List<Reclam> reclamList = reclamRepository.findAll();
        if(reclamList.isEmpty())
        {
            return new ArrayList<>();
        }
        List<reclamGetDto> reclamGetDtoList = reclamList.stream().map(reclam -> mapper.map(reclam,reclamGetDto.class))
                .collect(Collectors.toList());
        return reclamGetDtoList;
    }

    @Override
    public reclamGetDto getReclamById(int id) {
        return mapper.map(reclamRepository.findById(id),reclamGetDto.class);
    }

    @Override
    public reclamGetDto saveReclam(reclamPostDto reclam) {
        return mapper.map(reclamRepository.save(mapper.map(reclam,Reclam.class)),reclamGetDto.class);
    }

    @Override
    public reclamGetDto updateReclam(reclamPutDto reclam) {
        Reclam exist=reclamRepository.findById(reclam.getId()).orElse(null);
        if(exist!=null){
            reclam.setName(reclam.getName());
            reclam.setDescription(reclam.getDescription());
        }
        return mapper.map(reclam,reclamGetDto.class);
    }

    @Override
    public void deleteReclam(int id) {
        reclamRepository.deleteById(id);
    }
}
