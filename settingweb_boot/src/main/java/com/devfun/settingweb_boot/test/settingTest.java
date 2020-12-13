package com.devfun.settingweb_boot.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.devfun.test.service.TestServiceImpl;
import com.devfun.vo.SampleVO;
 
@RestController
public class settingTest {
    @Autowired
    TestServiceImpl testService;
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
    
    @RequestMapping(value="/sendVO")
    public ModelAndView test1() throws Exception {
		ModelAndView mav=new ModelAndView("test");
		List<SampleVO> testList=testService.selectRequestinfo();
		mav.addObject("list",testList);
		return mav;
    	
    	
    }
}
