package stu.demo.youtube.comment.controller;

import org.springframework.web.bind.annotation.*;

/**
 *@ClassName CommentController
 *@Description TODO
 */
@RestController
@RequestMapping("/comment")
public class CommentController {

    /**
     * add new comment
     * @param videoId the video you want to comment
     * @param content content of the comment
     * @return
     */
    @PostMapping("/create")
    public boolean create(int videoId, String content){
        System.out.println("videoId = " + videoId + ", content = " + content);
        return false;
    }

    /**
     * update old
     * @param id id of the comment need to be updated
     * @param content new content
     * @return
     */
    @PutMapping("/update")
    public boolean update(int id, String content){
        System.out.println("id = " + id + ", content = " + content);
        return false;
    }

    /**
     * delete
     * @param id id of the comment need to be deleted
     * @return
     */
    @DeleteMapping("/delete")
    public boolean delete(int id){
        System.out.println("id = " + id);
        return false;
    }

}
