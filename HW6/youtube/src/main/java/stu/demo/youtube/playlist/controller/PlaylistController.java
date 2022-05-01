package stu.demo.youtube.playlist.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@ClassName PlaylistController
 *@Description TODO
 */
@RestController
@RequestMapping("/playlist")
public class PlaylistController {

    /**
     * add new one to playlist
     * @param videoId
     * @return
     */
    @PostMapping("/create")
    public boolean create(int videoId){
        // get current user info
        // save
        System.out.printf("add video[{}] to playlist ", videoId);
        return false;
    }

    /**
     * remove
     * @param videoId
     * @return
     */
    @PostMapping("/delete")
    public boolean delete(int videoId){
        // get current user info
        // save
        System.out.printf("remove video[{}] from playlist ", videoId);
        return false;
    }

}
