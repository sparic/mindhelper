package com.fuyuda.blog;

import com.fuyuda.AjaxResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/3/4.
 */
@RestController
@RequestMapping("blog")
@Slf4j
public class BlogController {

    @GetMapping("test")
    public AjaxResult test() {
        log.info("test() executed successfully!");
        return AjaxResult.success("winner is ray");
    }

}
