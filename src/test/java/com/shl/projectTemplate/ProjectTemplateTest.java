package com.shl.projectTemplate;

import com.alibaba.fastjson.JSON;
import com.shl.projectTemplate.SpringJunit.SpringJunitTest;
import com.shl.projectTemplate.controller.TestController;
import com.shl.projectTemplate.dto.param.PageForm;
import com.shl.projectTemplate.dto.result.TestProjectTemplateDTO;
import com.shl.projectTemplate.dto.result.page.MyPage;
import javax.annotation.Resource;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author songhengliang
 * @date 2019/2/26
 */
public class ProjectTemplateTest extends SpringJunitTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProjectTemplateTest.class);


    @Resource
    private TestController testController;

    @Test
    public void pageTest() {

        PageForm pageForm = new PageForm();
        pageForm.setPageNum(2);
        pageForm.setPageSize(4);
        MyPage<TestProjectTemplateDTO> page = this.testController.testPage(null, null, pageForm);

        LOGGER.info(JSON.toJSONString(page));


    }

}
