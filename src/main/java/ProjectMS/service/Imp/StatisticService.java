package ProjectMS.service.Imp;

import ProjectMS.dto.statisticDtos.getStatisticDto;
import ProjectMS.dto.statisticDtos.postStatisticDto;
import ProjectMS.dto.statisticDtos.putStatisticDto;
import ProjectMS.model.Statistic;
import ProjectMS.repository.StatisticRepository;
import ProjectMS.service.IStatisticService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StatisticService implements IStatisticService {
    private final StatisticRepository statisticRepository;
    private final ModelMapper mapper;
    @Override
    public List<getStatisticDto> getAllStatisticDto() {
        List<Statistic> statistics = statisticRepository.findAllByDeletedFalse();
        return statistics.stream().map(statistic->mapper.map(statistic,getStatisticDto.class)).collect(
                Collectors.toList()
        );
    }

    @Override
    public getStatisticDto getStatisticDtoById(int id) {
        Statistic statistic=statisticRepository.findById(id).orElse(null);
        if(statistic==null || statistic.isDeleted()) {
            return null;
        }
        return mapper.map(statistic,getStatisticDto.class);
    }

    @Override
    public getStatisticDto saveStatistic(postStatisticDto postStatisticDto) {
        return mapper.map(statisticRepository.save(mapper.map(postStatisticDto,Statistic.class)),getStatisticDto.class);
    }

    @Override
    public getStatisticDto updateStatistic(putStatisticDto postStatisticDto) {
        Statistic statistic=statisticRepository.findById(postStatisticDto.getId()).orElse(null);
        if(statistic==null || statistic.isDeleted()) {
            return null;
        }
        statistic.setTitle(postStatisticDto.getTitle());
        statistic.setDescription(postStatisticDto.getDescription());
        statisticRepository.save(statistic);
        return mapper.map(statisticRepository.save(statistic),getStatisticDto.class);
    }

    @Override
    public void deleteStatistic(int id) {
        Statistic statistic=statisticRepository.findById(id).orElse(null);
        if(statistic!=null && statistic.isDeleted()) {
            statistic.setDeleted(true);
            statisticRepository.save(statistic);
        }
    }
}
