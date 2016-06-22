package blog.slightwind.me.controller;

import com.alibaba.fastjson.JSONObject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangzhidong on 16/1/31.
 */
@Controller
@RequestMapping("/")
public class HomeController {
    @RequestMapping(value ="hello")
    @ResponseBody
    public Object test(){
        JSONObject ob = new JSONObject();
        ob.put("data", "ok");
        return ob;
    }

    @RequestMapping(value ="/")
    public String homePage(){
      return "hello";
    }
}
