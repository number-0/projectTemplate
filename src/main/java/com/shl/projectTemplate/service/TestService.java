package com.shl.projectTemplate.service;

import com.github.pagehelper.PageInfo;
import com.google.common.collect.Lists;
import com.shl.projectTemplate.domain.entity.TestProjectTemplate;
import com.shl.projectTemplate.dto.param.PageForm;
import com.shl.projectTemplate.dto.result.TestProjectTemplateDTO;
import com.shl.projectTemplate.dto.result.page.MyPage;
import com.shl.projectTemplate.manager.TestManager;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

/**
 * @author songhengliang
 * @date 2019/2/26
 */
@Service
public class TestService {

    @Resource
    private TestManager testManager;


    /**
     * testPage
     * @param form
     * @return
     */
    public MyPage<TestProjectTemplateDTO> testPage(PageForm form) {
        List<TestProjectTemplate>  testProjectTemplates = this.testManager.testPage(form.getPageNum(), form.getPageSize());
        if (CollectionUtils.isEmpty(testProjectTemplates)) {
            return null;
        }
        List<TestProjectTemplateDTO> testProjectTemplateDTOS = this.buildTestProjectTemplateDTO(testProjectTemplates);


        return new MyPage<>(testProjectTemplates, testProjectTemplateDTOS);
    }

    private List<TestProjectTemplateDTO> buildTestProjectTemplateDTO(List<TestProjectTemplate> testProjectTemplates) {
        List<TestProjectTemplateDTO> testProjectTemplateDTOS = Lists.newArrayList();
        testProjectTemplates.forEach(testProjectTemplate -> {
            TestProjectTemplateDTO testProjectTemplateDTO = new TestProjectTemplateDTO();
            testProjectTemplateDTO.setId(testProjectTemplate.getId());
            testProjectTemplateDTO.setName(testProjectTemplate.getName());
            testProjectTemplateDTOS.add(testProjectTemplateDTO);
        });

        return testProjectTemplateDTOS;
    }

}
