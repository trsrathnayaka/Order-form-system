package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Vector;
import java.util.Enumeration;
import java.text.NumberFormat;
import java.text.NumberFormat;

public final class oder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"oderform", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Order Form</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <style media=\"screen\">\n");
      out.write("        \n");
      out.write("        *{\n");
      out.write("            padding: 0;\n");
      out.write("            margin: 0;\n");
      out.write("            box-sizing: border-box;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        body{\n");
      out.write("            margin: 0;\n");
      out.write("            background-image: url(\"sigiriya.jpg\");\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            background-attachment: fixed;\n");
      out.write("            background-size: cover;\n");
      out.write("            font-family: sans-serif;\n");
      out.write("            font-weight: 100;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        form{\n");
      out.write("            height: 520px;\n");
      out.write("            width :400px;\n");
      out.write("            background-color: purple;\n");
      out.write("            opacity: 0.7;\n");
      out.write("            position: absolute;\n");
      out.write("            transform: translate(-50%, -50%);\n");
      out.write("            top: 50%;\n");
      out.write("            left: 50%;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            backdrop-filter: blur(10px);\n");
      out.write("            border: 2px solid rgba(255,255,255,0.1);\n");
      out.write("            box-shadow: 0 0 40px rgba(8,7,16,0.6);\n");
      out.write("            padding: 50px 35px;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        form *{\n");
      out.write("            font-family: 'Poppins' ,sans-serif;\n");
      out.write("            color: #FE7F60;\n");
      out.write("            letter-spacing: 0.5px;\n");
      out.write("            outline: none;\n");
      out.write("            border: none;\n");
      out.write("            font-weight: bold;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        form h3{\n");
      out.write("            font-size: 38px;\n");
      out.write("            font-weight: 600;\n");
      out.write("            line-height: 42px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: #DAF000;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        form h6{\n");
      out.write("            font-size: 25px;\n");
      out.write("            font-weight: 300;\n");
      out.write("            line-height: 42px;\n");
      out.write("            text-align: center;\n");
      out.write("            color: #ffffff;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        </style>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <form>\n");
      out.write("            \n");
      out.write("            <h3> Your Order: </h3>\n");
      out.write("            \n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            \n");
      out.write("            <h6> Number Of Tees: \n");
      out.write("                ");
      out.print( request.getParameter("tqty"));
      out.write(" \n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("                ");

                    Vector order =(Vector)request.getAttribute("order");
                    Enumeration e = order.elements();
                    out.println("Cost Of Tees:$" + e.nextElement());
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            <br>\n");
      out.write("                            <br>\n");
      out.write("                            \n");
      out.write("                 Number Of Hats: \n");
      out.write("                 ");
      out.print( request.getParameter("hqty") );
      out.write("\n");
      out.write("                 <br>\n");
      out.write("                 ");

                     out.println("Cost Of Hats :$" + e.nextElement());
                     
      out.write("\n");
      out.write("                     \n");
      out.write("            </h6>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
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
