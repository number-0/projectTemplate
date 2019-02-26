package com.shl.projectTemplate.dto.param;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * @author songhengliang
 * @date 2019/2/26
 */
@Setter
@Getter
public class ModelAndViewForm implements Serializable {

    private static final long serialVersionUID = 1L;

    private String test = "testModelAndView";

}
