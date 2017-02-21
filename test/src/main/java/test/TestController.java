package test;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
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

    @RequestMapping(value = "/postTest",method = RequestMethod.POST)
    @ResponseBody
    public String postTest(@RequestParam Integer num){
        if(num % 2 == 0){
            return "偶数";
        }else{
            return "奇数";
        }
    }

    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    @ResponseBody
    public String handleFileUpload(@RequestParam MultipartFile file){
        if(!file.isEmpty()){
            try{
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(file.getOriginalFilename())));
                out.write(file.getBytes());
                out.flush();
                out.close();
            }catch (IOException e){
                e.printStackTrace();
                return "上传失败:"+e.getMessage();
            }
            return "上传成功";
        }else{
            return "上传失败，因为文件是空的";
        }
    }
}
