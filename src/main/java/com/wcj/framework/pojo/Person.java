package com.wcj.framework.pojo;

import com.wcj.framework.annotation.Controller;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Controller
public class Person {
    private int id;
    private String name;
}
