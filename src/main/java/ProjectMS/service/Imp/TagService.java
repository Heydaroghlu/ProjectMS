package ProjectMS.service.Imp;

import ProjectMS.dto.tagDtos.getTagDto;
import ProjectMS.dto.tagDtos.postTagDto;
import ProjectMS.dto.tagDtos.putTagDto;
import ProjectMS.service.ITagService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagService implements ITagService {
    @Override
    public getTagDto findTagById(int tagId) {
        return null;
    }

    @Override
    public List<getTagDto> getAllTags() {
        return List.of();
    }

    @Override
    public getTagDto saveTag(postTagDto tagDto) {
        return null;
    }

    @Override
    public getTagDto updateTag(putTagDto tagDto) {
        return null;
    }

    @Override
    public void deleteTag(int tagId) {

    }
}
