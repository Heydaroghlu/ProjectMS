package ProjectMS.service;

import ProjectMS.dto.statisticDtos.getStatisticDto;
import ProjectMS.dto.statisticDtos.postStatisticDto;
import ProjectMS.dto.statisticDtos.putStatisticDto;

import java.util.List;

public interface IStatisticService {
    public List<getStatisticDto> getAllStatisticDto();
    public getStatisticDto getStatisticDtoById(int id);
    public getStatisticDto saveStatistic(postStatisticDto postStatisticDto);
    public getStatisticDto updateStatistic(putStatisticDto postStatisticDto);
    public void deleteStatistic(int id);
}
