package koreatech.in.controller;

import koreatech.in.repository.SampleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class SampleController {

    @Autowired
    SampleMapper sampleMapper;

    @ResponseBody
    @RequestMapping(value = "HOME2",method = RequestMethod.GET)
    public String home(){
        System.out.println(sampleMapper.getTime());
        System.out.println(sampleMapper.thisTime());
        return "HOME";
    }




    @ResponseBody
    @RequestMapping(value = "samples",method = RequestMethod.GET)
    public ResponseEntity<String> sample(){
        return new ResponseEntity<String>("sample", HttpStatus.OK);
    }




}
