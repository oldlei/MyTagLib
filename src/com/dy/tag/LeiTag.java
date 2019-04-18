package com.dy.tag;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class LeiTag extends SimpleTagSupport {
    private  String value;
    @Override
    public void doTag() throws JspException, IOException {
        JspContext jspContext = getJspContext();
        PageContext a = (PageContext) jspContext;
        System.out.println("doTag");
        a.getOut().write("ceshiceshi"+"--"+value);


    }
    public void setValue(String value){
        this.value = value;
    }



}
