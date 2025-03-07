package ProjectMS.service.Imp;

import ProjectMS.dto.partnerDtos.getPartnerDto;
import ProjectMS.dto.partnerDtos.postPartnerDto;
import ProjectMS.dto.partnerDtos.putPartnerDto;
import ProjectMS.model.Partner;
import ProjectMS.repository.PartnerRepository;
import ProjectMS.service.IPartnerService;
import io.lettuce.core.dynamic.annotation.Param;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class PartnerService implements IPartnerService {
    private final PartnerRepository partnerRepository;
    private final ModelMapper mapper;
    @Override
    public getPartnerDto getById(int partnerId) {
        Partner partner=partnerRepository.findById(partnerId).orElse(null);
        if(partner!=null) {
           return mapper.map(partner,getPartnerDto.class);
        }
        return null;
    }

    @Override
    public List<getPartnerDto> getAllPartner(@Param("deleted")boolean deleted) {
        List<Partner> partners=partnerRepository.findAllByDeleted(deleted);
        return partners.stream().map(partner -> mapper.map(partner,getPartnerDto.class)).collect(Collectors.toList());
    }

    @Override
    public getPartnerDto savePartner(postPartnerDto postPartnerDto) {
        return mapper.map(partnerRepository.save(mapper.map(postPartnerDto,Partner.class)),getPartnerDto.class);
    }

    @Override
    public getPartnerDto updatePartner(putPartnerDto putPartnerDto) {
        Partner partner=partnerRepository.findById(putPartnerDto.getId()).orElse(null);
        if(partner!=null) {
            partner.setName(putPartnerDto.getName());
            partner.setUrl(putPartnerDto.getUrl());
            partner.setImg(putPartnerDto.getImg());
            partnerRepository.save(partner);
        }
        return mapper.map(partner,getPartnerDto.class);
    }

    @Override
    public void deletePartner(int partnerId) {
        Partner partner=partnerRepository.findById(partnerId).orElse(null);
        if(partner!=null) {
            partner.setDeleted(true);
            partnerRepository.save(partner);
        }
    }
}
