/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-08-13 12:53:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<html>\r\n");
      out.write("<script>\r\n");
      out.write("function demo3() {\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        type:\"POST\",\r\n");
      out.write("        url:\"hello/demo3\",\r\n");
      out.write("        contentType:\"application/json\",\r\n");
      out.write("        dataType:\"json\",\r\n");
      out.write("        data:'{\"name\":\"张三\",\"age\":\"18\"}',\r\n");
      out.write("        success:function (data) {\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"hello/demo2\" method=\"post\">\r\n");
      out.write("    <input type=\"text\" name=\"name\" value=\"张三\">\r\n");
      out.write("    <input type=\"text\" name=\"age\" value=\"18\">\r\n");
      out.write("    <input type=\"submit\" value=\"sub\">\r\n");
      out.write("</form>\r\n");
      out.write("<button onclick=\"demo3()\">jie shou</button><br>\r\n");
      out.write("<form action=\"hello/demo4\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("    <input type=\"file\" name=\"uploadFile\"/>\r\n");
      out.write("    <input type=\"submit\" value=\"wenjianshangchuan\">\r\n");
      out.write("</form>\r\n");
      out.write("<a href=\"hello/demo18\">zidingyilanjieqi</a>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
