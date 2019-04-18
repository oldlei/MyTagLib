package com.dy.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class NoBody extends TagSupport {
    private int shuxing;
    @Override
    public int doStartTag() throws JspException {
        System.out.println("开始");
        return super.doStartTag();
    }
    public void setShuxing(int shuxing){
        this.shuxing = shuxing;
    }

    @Override
    public int doEndTag() throws JspException {
        System.out.println(shuxing);
        try {
            this.pageContext.getOut().write(shuxing);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("结束");
        return super.doEndTag();
    }
}
