package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--Author: W3layouts\r\n");
      out.write("Author URL: http://w3layouts.com\r\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\r\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>Classic Login Form Responsive Widget Template :: w3layouts</title>\r\n");
      out.write("<!-- Meta tag Keywords -->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"Classic Login Form Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements\" />\r\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\r\n");
      out.write("function hideURLbar(){ window.scrollTo(0,1); } </script>\r\n");
      out.write("<!-- Meta tag Keywords -->\r\n");
      out.write("\r\n");
      out.write("<!-- css files -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\" media=\"all\" /> <!-- Style-CSS --> \r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/font-awesome.css\"> <!-- Font-Awesome-Icons-CSS -->\r\n");
      out.write("<!-- //css files -->\r\n");
      out.write("\r\n");
      out.write("<!-- js -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery-2.1.4.min.js\"></script>\r\n");
      out.write("<!-- //js -->\r\n");
      out.write("\r\n");
      out.write("<!-- online-fonts -->\r\n");
      out.write("<link href=\"//fonts.googleapis.com/css?family=Oleo+Script:400,700&amp;subset=latin-ext\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //online-fonts -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<script src=\"js/jquery.vide.min.js\"></script>\r\n");
      out.write("\t<!-- main -->\r\n");
      out.write("\t<div data-vide-bg=\"video/Ipad\">\r\n");
      out.write("\t\t<div class=\"center-container\">\r\n");
      out.write("\t\t\t<!--header-->\r\n");
      out.write("\t\t\t<div class=\"header-w3l\">\r\n");
      out.write("\t\t\t\t<h1> Login Form</h1>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--//header-->\r\n");
      out.write("\t\t\t<div class=\"main-content-agile\">\r\n");
      out.write("\t\t\t\t<div class=\"sub-main-w3\">\t\r\n");
      out.write("\t\t\t\t\t<div class=\"wthree-pro\">\r\n");
      out.write("\t\t\t\t\t\t<h2>Login Here</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<form action=\"NewServlet\" method=\"POST\">\r\n");
      out.write("\t\t\t\t\t\t<input placeholder=\"Username or E-mail\" name=\"txtUser\" class=\"user\" type=\"email\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon1\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i></span><br><br>\r\n");
      out.write("\t\t\t\t\t\t<input  placeholder=\"Password\" name=\"txtPass\" class=\"pass\" type=\"password\" required=\"\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"icon2\"><i class=\"fa fa-unlock\" aria-hidden=\"true\"></i></span><br>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sub-w3l\">\r\n");
      out.write("\t\t\t\t\t\t\t<h6><a href=\"#\">Forgot Password?</a></h6>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"right-w3l\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Login\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--//main-->\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--footer-->\r\n");
      out.write("\t\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t\t<p>&copy; 2017 Classic Login Form. All rights reserved | Design by <a href=\"http://w3layouts.com\">W3layouts</a></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!--//footer-->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
