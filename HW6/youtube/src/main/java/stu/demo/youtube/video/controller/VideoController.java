package stu.demo.youtube.video.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import stu.demo.youtube.model.PageInfo;
import stu.demo.youtube.video.entity.VideoEntity;

import java.util.List;

/**
 *@ClassName VideoController
 *@Description TODO
 */
@RestController
@RequestMapping("/video")
public class VideoController {

    /**
     * search videos
     * @param keyword literal
     * @param beginDate dd/MM/yyyy
     * @param endDate dd/MM/yyyy
     * @param categories list, or. Tech, Fruit and so on
     * @param pageNo from 0
     * @return
     */
    @GetMapping("/search")
    public PageInfo<VideoEntity> search(String keyword, String beginDate, String endDate, @RequestParam(required = false) List<String> categories,
                                        @RequestParam(defaultValue = "0") int pageNo, @RequestParam(defaultValue = "10") int pageSize){
        // invoke service
        System.out.println("keyword = " + keyword + ", beginDate = " + beginDate + ", endDate = " + endDate + ", categories = " + categories + ", pageNo = " + pageNo + ", pageSize = " + pageSize);
        return new PageInfo<VideoEntity>();
    }

}
