package com.shl.projectTemplate.controller;

import com.shl.projectTemplate.dto.param.ModelAndViewForm;
import com.shl.projectTemplate.dto.param.PageForm;
import com.shl.projectTemplate.dto.result.TestProjectTemplateDTO;
import com.shl.projectTemplate.dto.result.page.MyPage;
import com.shl.projectTemplate.service.TestService;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author songhengliang
 * @date 2019/2/25
 */
@RequestMapping("test")
@Controller
public class TestController {

    @Resource
    private TestService testService;

    /**
     * http://localhost:8087/test/test，eg:test.ftl
     * 通用方法：可跳转到任意页面
     * @param pageName
     * @return
     */
    @RequestMapping(value = "/{pageName}")
    public String toPage(@PathVariable("pageName") String pageName){
        return pageName;
    }



    /**
     * testModelAndView
     * @param form
     * @return
     */
    @RequestMapping(value = "testModelAndView", method= RequestMethod.GET)
    public ModelAndView testModelAndView(ModelAndViewForm form){
        ModelAndView mav = new ModelAndView("testModelAndView");
        mav.addObject("form", form);
        return mav;
    }

//    /**
//     * testResult
//     * @param request
//     * @param response
//     * @return
//     */
//    @RequestMapping(value = "checkKeywordUnique", method=RequestMethod.GET)
//    @ResponseBody
//    public Result checkKeywordUnique(HttpServletRequest request, HttpServletResponse response){
//
//        return null;
//
//    }


    /**
     * testPage
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "page", method=RequestMethod.GET)
    @ResponseBody
    public MyPage<TestProjectTemplateDTO> testPage(HttpServletRequest request,
            HttpServletResponse response,
            PageForm form){

        return this.testService.testPage(form);

    }

}
