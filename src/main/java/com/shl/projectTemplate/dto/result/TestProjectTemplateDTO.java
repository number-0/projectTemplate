package com.shl.projectTemplate.dto.result;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * @author songhengliang
 * @date 2019/2/26
 */
@Setter
@Getter
public class TestProjectTemplateDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;
}
