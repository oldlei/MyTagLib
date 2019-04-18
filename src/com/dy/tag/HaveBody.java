package com.dy.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.BodyTagSupport;
import javax.servlet.jsp.tagext.TagSupport;
import java.io.IOException;

public class HaveBody extends BodyTagSupport {
    private int id;
    private int value;
    @Override
    public int doStartTag() throws JspException {
        return super.doStartTag();
    }

    @Override
    public int doEndTag() throws JspException {
        System.out.println("youbody");
        System.out.println(id+"|"+value);
        try {
            this.pageContext.getOut().write(id+"|"+value);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return super.doEndTag();
    }


    public void setId(String id) {

        this.id = Integer.valueOf(id);

    }



    public void setValue(int value) {
        this.value=value;
    }
}
