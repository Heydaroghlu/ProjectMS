package ProjectMS.service;

import ProjectMS.dto.tagDtos.getTagDto;
import ProjectMS.dto.tagDtos.postTagDto;
import ProjectMS.dto.tagDtos.putTagDto;

import java.util.List;

public interface ITagService {
    public getTagDto findTagById(int tagId);
    public List<getTagDto> getAllTags();
    public getTagDto saveTag(postTagDto tagDto);
    public getTagDto updateTag(putTagDto tagDto);
    public void deleteTag(int tagId);
}
