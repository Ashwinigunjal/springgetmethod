/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.88
 * Generated at: 2018-09-20 17:26:57 UTC
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

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Home Dashboard</title>\n");
      out.write(" <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("    <!-- Material Design for Bootstrap CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://unpkg.com/bootstrap-material-design@4.1.1/dist/css/bootstrap-material-design.min.css\" integrity=\"sha384-wXznGJNEXNG1NFsbm0ugrLFMQPWswR3lds2VeinahP8N0zJw9VWSopbjv2x7WCvX\" crossorigin=\"anonymous\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Material+Icons\">\n");
      out.write(" \n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    <!-- Material Design for Bootstrap fonts and icons -->\n");
      out.write("   \n");
      out.write("\n");
      out.write("  <style type=\"text/css\">\n");
      out.write(" \n");
      out.write("  \t.main-box{\n");
      out.write("  \t\theight: 400px;\n");
      out.write("  \t\tbox-shadow: 5px 5px 5px #aaaaaa;\n");
      out.write("  \t\topacity: 0.8;\n");
      out.write("  \t\tmargin-top:100px;\n");
      out.write("  \t}\n");
      out.write("  \t\n");
      out.write("  \t.btn{\n");
      out.write("  \t\ttext-transform: none;\n");
      out.write("  \t}\n");
      out.write("  \t.center-block {\n");
      out.write("\t  display: center\t;\n");
      out.write("\t  /*margin-right: auto;\n");
      out.write("\t  margin-left: auto;\n");
      out.write("\t  */\n");
      out.write("\t  margin : auto;\n");
      out.write("\t  margin-top: 150px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body  style=\"background-image: url('image/backgound_login.jpeg');\" >\n");
      out.write("<div class=\"container\">\n");
      out.write("\t\n");
      out.write("\t<div class=\"row h-100 justify-content-center align-items-center  \">\n");
      out.write("\n");
      out.write("\t\t<div class=\"col-md-5  \">\n");
      out.write("\t\t<div class=\"col-md-12 card main-box\" >\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<h3 class=\"text-center \"><B>Welcome</B></h3>\n");
      out.write("\t\t\t<h5 class=\"text-center \">Home Dashboard</h5>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<form action=\"loginservlet\" method=\"POST\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t");
 
				
				String error = (String)request.getAttribute("errorMessage");
				 if(error !=null){
				out.println("<p style='color: red'>"+ error+"</p>");
				
				 }
				 else{
					
					out.println("<p></p>");
				 }
				
				
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"command\" value=\"login\">\n");
      out.write("\t\t\t\t <div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"mobile\" class=\"bmd-label-floating\">Mobile</label>\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"mobile\" name=\"mobile\"pattern=\"[0-9]+\" title=\"Please Enter only Words not number\" minlength=\"10\"  maxlength=\"10\" >\n");
      out.write("\t\t\t\t\t<!-- <span class=\"bmd-help\">valid number</span> -->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"exampleInputPassword1\" class=\"bmd-label-floating\">Password</label>\n");
      out.write("\t\t\t\t\t<input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" name=\"password\">\n");
      out.write("\t\t\t\t</div><br>\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn  btn-raised  btn-success btn-block\" ><b>Login<b></button>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<form action=\"/register.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t<div class=\" text-center\" >New User? <a href=\"#\" class=\"text-info\" >Signup</a></div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://unpkg.com/popper.js@1.12.6/dist/umd/popper.js\" integrity=\"sha384-fA23ZRQ3G/J53mElWqVJEGJzU0sTs+SvzG8fXVWP+kJQ1lwFAOkcUOysnlKJC33U\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://unpkg.com/bootstrap-material-design@4.1.1/dist/js/bootstrap-material-design.js\" integrity=\"sha384-CauSuKpEqAFajSpkdjv3z9t8E7RlpJ1UP0lKM/+NdtSarroVKu069AlsRPKkFBz9\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script>$(document).ready(function() { $('body').bootstrapMaterialDesign(); });</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}