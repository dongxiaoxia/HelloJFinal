package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>JFinal Demo</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <!-- 引入 Bootstrap -->\n");
      out.write("    <link href=\"http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h1>用户CRUD JFinal Demo</h1>\n");
      out.write("    <form class=\"form-horizontal col-sm-8\" action=\"/user\" method=\"post\" >\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"username\" class=\"col-sm-2 control-label\">用户名</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"username\" name=\"user.username\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"请输入用户名\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"password\" class=\"col-sm-2 control-label\">密码</label>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"password\" name=\"user.password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" placeholder=\"请输入密码\">\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-default\">提交</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->\n");
      out.write("<script src=\"http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js\"></script>\n");
      out.write("\n");
      out.write("<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->\n");
      out.write("<script src=\"http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
