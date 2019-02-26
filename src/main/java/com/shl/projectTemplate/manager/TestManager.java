package com.shl.projectTemplate.manager;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.shl.projectTemplate.domain.entity.TestProjectTemplate;
import com.shl.projectTemplate.domain.entity.TestProjectTemplateExample;
import com.shl.projectTemplate.domain.mapper.TestProjectTemplateMapper;
import com.shl.projectTemplate.dto.param.PageForm;
import com.shl.projectTemplate.dto.result.TestProjectTemplateDTO;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author songhengliang
 * @date 2019/2/26
 */
@Service
public class TestManager {
    @Resource
    private TestProjectTemplateMapper testProjectTemplateMapper;

    /**
     * testPage
     * @return
     */
    public List<TestProjectTemplate> testPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        TestProjectTemplateExample example = new TestProjectTemplateExample();
        TestProjectTemplateExample.Criteria criteria = example.createCriteria();

        example.setOrderByClause("id asc");

        return this.testProjectTemplateMapper.selectByExample(example);

    }
}
