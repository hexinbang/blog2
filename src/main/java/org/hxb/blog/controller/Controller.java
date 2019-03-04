package org.hxb.blog.controller;

import org.hxb.blog.vo.EssayVo;
import org.hxb.blog.entity.JsonAndToken;
import org.hxb.blog.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    EssayService essayService;
    @Autowired
    private HttpServletRequest request;

    @CrossOrigin
    @ResponseBody
    @RequestMapping(value = "/essay/getEssay",method = RequestMethod.GET)
    public JsonAndToken getAllEssay(){
        Cookie[] cookies=request.getCookies();
        if(cookies!=null){
            for(Cookie cookie:cookies){
                System.out.println(cookie);
            }
        }
        Object data=essayService.getAllEssay();
        return new JsonAndToken().builder()
                .data(data)
                .total(((List) data).size())
                .status("success")
                .build();
    }

    @CrossOrigin(allowCredentials="true")
    @ResponseBody
    @RequestMapping(value = "/essay/insertEssay",method = {RequestMethod.POST, RequestMethod.OPTIONS})
    public JsonAndToken insertEssay(@RequestBody EssayVo essayVo,@CookieValue String token){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String time=simpleDateFormat.format(new Date());
        essayVo.setTime(time);
        return new JsonAndToken().builder()
                .data(essayService.insertEssay(essayVo))
                .build();
    }

    @ResponseBody
    @RequestMapping(value = "/essay/deleteEssay",method = RequestMethod.DELETE)
    public JsonAndToken deleteEssay(@RequestParam int id){
        return new JsonAndToken().builder()
                .data(essayService.deleteEssay(id))
                .build();
    }

}
