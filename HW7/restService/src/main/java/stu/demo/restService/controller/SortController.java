/**
 * @ClassName SortController
 */
package stu.demo.restService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 *@ClassName SortController
 *@Description TODO
 */
@RestController
@RequestMapping("/sort")
public class SortController {

    /**
     * take list of string and sort it by alphabetical order
     * @param list
     * @return
     */
    @GetMapping
    public List<String> sort(@RequestBody List<String> list){
        List<String> sorted = list.stream().sorted().collect(Collectors.toList());
        return sorted;
    }

}
