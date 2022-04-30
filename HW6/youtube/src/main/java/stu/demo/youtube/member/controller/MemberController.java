package stu.demo.youtube.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stu.demo.youtube.member.entity.MemberEntity;
import stu.demo.youtube.model.PageInfo;

/**
 *@ClassName MemberController
 *@Description members
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    /**
     * page
     * @param pageNo from 0
     * @param pageSize
     * @return
     */
    @GetMapping("/page")
    public PageInfo<MemberEntity> page(int pageNo, int pageSize){
        // TODO
        return new PageInfo<MemberEntity>();
    }


}
