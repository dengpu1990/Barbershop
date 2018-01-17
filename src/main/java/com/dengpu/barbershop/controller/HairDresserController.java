package com.dengpu.barbershop.controller;

import com.dengpu.barbershop.dao.HairDresserMapperExt;
import com.dengpu.barbershop.model.HairDresser;
import com.dengpu.barbershop.model.HairDresserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Title: XXXX (类或者接口名称)
 * Description: XXXX (简单对此类或接口的名字进行描述)
 * Copyright: Copyright (c) 2008
 * Company:深圳亿起融网络科技有限公司
 *
 * @author dengpu on 2018/1/17.
 * @version 1.0
 */
@RestController
@RequestMapping(value="hairDresser")
public class HairDresserController {
    @Autowired
    private HairDresserMapperExt hairDresserMapperExt;

    @GetMapping("branchId/{branchId}")
    public Object findById(@PathVariable Byte branchId) {
        HairDresserExample example = new HairDresserExample();
        example.createCriteria().andBranchIdEqualTo(branchId);
        List<HairDresser> list = hairDresserMapperExt.selectByExample(example);
        return list;
    }
}
