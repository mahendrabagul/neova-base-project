package org.apache.jsp.WEB_002dINF.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\" ?>\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />\n");
      out.write("<title>Home page</title>\n");
      out.write("<script src=\"http://code.jquery.com/jquery-1.11.0.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\n");
      out.write("\t\t$(\"#moderationPage\").click(function() {\n");
      out.write("\t\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/sec/moderation.html\";\n");
      out.write("\t\t\t$(location).attr('href', url);\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$(\"#firstAdminPage\").click(function() {\n");
      out.write("\t\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/first.html\";\n");
      out.write("\t\t\t$(location).attr('href', url);\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t\t$(\"#secondAdminPage\").click(function() {\n");
      out.write("\t\t\tvar url = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/admin/second.html\";\n");
      out.write("\t\t\t$(location).attr('href', url);\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".linkstyle a {\n");
      out.write("\tfont-family: Georgia, serif;\n");
      out.write("\tfont-size: large\n");
      out.write("}\n");
      out.write("\n");
      out.write(".linkstyle a:link {\n");
      out.write("\tcolor: forestgreen;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".linkstyle a:visited {\n");
      out.write("\tcolor: seagreen;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".linkstyle a:hover {\n");
      out.write("\ttext-decoration: none;\n");
      out.write("\tcolor: yellowgreen;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".linkstyle a:active {\n");
      out.write("\tcolor: red;\n");
      out.write("\ttext-decoration: none\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<h1>Home page</h1>\n");
      out.write("\n");
      out.write("\t<p>\n");
      out.write("\t\tThis is Home page. It's available for all users.<br />\n");
      out.write("\t</p>\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<a id=\"moderationPage\" style='cursor: pointer; cursor: hand;'>Moderation\n");
      out.write("\t\tpage</a>\n");
      out.write("\t<br />\n");
      out.write("\t<a id=\"firstAdminPage\" style='cursor: pointer; cursor: hand;'>First\n");
      out.write("\t\tAdmin page</a>\n");
      out.write("\t<br />\n");
      out.write("\t<a id=\"secondAdminPage\" style='cursor: pointer; cursor: hand;'>Second\n");
      out.write("\t\tAdmin page</a>\n");
      out.write("\t<br />\n");
      out.write("\n");
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
