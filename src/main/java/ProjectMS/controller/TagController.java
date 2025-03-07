package ProjectMS.controller;

import ProjectMS.dto.tagDtos.getTagDto;
import ProjectMS.dto.tagDtos.postTagDto;
import ProjectMS.dto.tagDtos.putTagDto;
import ProjectMS.service.ITagService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/tag")
public class TagController {
    private final ITagService tagService;
    @GetMapping
    public List<getTagDto> getAllTags() {
        return tagService.getAllTags();
    }
    @GetMapping("/{id}")
    public getTagDto getTagById(@PathVariable int id) {
        return tagService.findTagById(id);
    }
    @PostMapping
    public getTagDto addTag(@RequestBody postTagDto postTagDto) {
        return tagService.saveTag(postTagDto);
    }
    @PutMapping
    public getTagDto updateTag(@RequestBody putTagDto putTagDto) {
        return tagService.updateTag(putTagDto);
    }
    @DeleteMapping("/{id}")
    public void deleteTag(@PathVariable int id) {
        tagService.deleteTag(id);
    }
}
