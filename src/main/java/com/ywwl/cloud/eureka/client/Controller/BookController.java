package com.ywwl.cloud.eureka.client.Controller;

import com.alibaba.fastjson.JSON;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yanuun
 * @Date 11:37 2018/6/14
 **/
@RestController
@RequestMapping(value = "/book/")
public class BookController {

    @RequestMapping(value = "/bookList",method = RequestMethod.GET)
    public String getBookList(){
        List<Map<String,Object>> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            Map<String,Object> bookMap = new HashMap<>();
            bookMap.put("id",String.valueOf(i));
            bookMap.put("name","book"+i);
            list.add(bookMap);
        }
        return  JSON.toJSONString(list);
    }
}
