package com.wcj.framework.pojo;

import com.wcj.framework.annotation.Autowired;
import com.wcj.framework.annotation.Controller;
import com.wcj.framework.helper.BeanHelper;
import com.wcj.framework.helper.IocHelper;
import com.wcj.framework.pojo.Person;

import java.util.Map;
@Controller
public class Dog {
    @Autowired
    public Person person;


}
