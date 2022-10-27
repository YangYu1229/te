package com.test.web;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

/**
 * @Author:taolongqiang
 * @Date: 2022/9/20  16:00
 * @Email 1417126618@qq.com
 */

@RestController
@RequestMapping("/testmap/")
public class MapController {



    @RequestMapping("map")
    public Map<String,Object> getPageData(
            @RequestBody Map<String,Object> o){
        System.out.println(o);
        o.forEach((key,value) ->{
            System.out.print(key);
            System.out.print("----->");
            System.out.println(value);
        });
        return o;
    }

}
