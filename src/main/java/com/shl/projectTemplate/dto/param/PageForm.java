package com.shl.projectTemplate.dto.param;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * @author songhengliang
 * @date 2019/2/26
 */
@Getter
@Setter
public class PageForm implements Serializable {

    private static final long serialVersionUID = 1L;

    private int pageNum = 1;

    private int pageSize = 2;
}
