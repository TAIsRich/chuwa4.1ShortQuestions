package stu.demo.youtube.model;

import lombok.Data;

import java.util.List;

/**
 *@ClassName PageInfo
 *@Description TODO
 */
@Data
public class PageInfo<T> {

    private long total;// total records
    private List<T> list;

}
