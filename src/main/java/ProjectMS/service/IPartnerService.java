package ProjectMS.service;

import ProjectMS.dto.partnerDtos.getPartnerDto;
import ProjectMS.dto.partnerDtos.postPartnerDto;
import ProjectMS.dto.partnerDtos.putPartnerDto;

import java.util.List;

public interface IPartnerService {
    public getPartnerDto getById(int partnerId);
    public List<getPartnerDto> getAllPartner(boolean deleted);
    public getPartnerDto savePartner(postPartnerDto postPartnerDto);
    public getPartnerDto updatePartner(putPartnerDto putPartnerDto);
    public void deletePartner(int partnerId);
}
