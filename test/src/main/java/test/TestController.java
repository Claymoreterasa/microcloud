package test;

import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Administrator on 2017/2/20.
 */
@RestController
public class TestController {
    @RequestMapping(value = "/getDate",method = RequestMethod.GET)
    @ResponseBody
    public String getDate(){
        return new Date().toString();
    }

    @RequestMapping(value = "/reply",method = RequestMethod.GET)
    @ResponseBody
    public String reply(@RequestParam String message){
        return "you said " + message;
    }

    @RequestMapping(value = "postTest",method = RequestMethod.POST)
    @ResponseBody
    public String postTest(@RequestParam Integer num){
        if(num % 2 == 0){
            return "偶数";
        }else{
            return "奇数";
        }
    }
}
