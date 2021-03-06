package org.apache.jsp;

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

      out.write("<!doctype html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicon.ico\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n");
      out.write("\n");
      out.write("        <title>Light Bootstrap Dashboard by Creative Tim</title>\n");
      out.write("\n");
      out.write("        <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Bootstrap core CSS     -->\n");
      out.write("        <link href=\"assets/css/bootstrap.min.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("        <!-- Animation library for notifications   -->\n");
      out.write("        <link href=\"assets/css/animate.min.css\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("        <!--  Light Bootstrap Table core CSS    -->\n");
      out.write("        <link href=\"assets/css/light-bootstrap-dashboard.css?v=1.4.0\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--  CSS for Demo Purpose, don't include it in your project     -->\n");
      out.write("        <link href=\"assets/css/demo.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--     Fonts and icons     -->\n");
      out.write("        <link href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href=\"assets/css/pe-icon-7-stroke.css\" rel=\"stylesheet\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"sidebar\" data-color=\"purple\" data-image=\"assets/img/sidebar-5.jpg\">\n");
      out.write("\n");
      out.write("                <!--\n");
      out.write("            \n");
      out.write("                    Tip 1: you can change the color of the sidebar using: data-color=\"blue | azure | green | orange | red | purple\"\n");
      out.write("                    Tip 2: you can also add an image using data-image tag\n");
      out.write("            \n");
      out.write("                -->\n");
      out.write("\n");
      out.write("                <div class=\"sidebar-wrapper\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <a href=\"http://www.creative-tim.com\" class=\"simple-text\">\n");
      out.write("                            Creative Tim\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <ul class=\"nav\">\n");
      out.write("                        <li class=\"active\">\n");
      out.write("                            <a href=\"dashboard.html\">\n");
      out.write("                                <i class=\"pe-7s-graph\"></i>\n");
      out.write("                                <p>Manage </p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"user.html\">\n");
      out.write("                                <i class=\"pe-7s-user\"></i>\n");
      out.write("                                <p>Manage</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"table.html\">\n");
      out.write("                                <i class=\"pe-7s-note2\"></i>\n");
      out.write("                                <p>Manage</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                         \n");
      out.write("                                <i class=\"pe-7s-news-paper\"></i>\n");
      out.write("                                <p>Manage course</p>\n");
      out.write("                                <ol>\n");
      out.write("                                    <a href=\"Addnewcourse.jsp\">Add new</a>\n");
      out.write("                                  \n");
      out.write("                                    \n");
      out.write("                                </ol>\n");
      out.write("                            \n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"icons.html\">\n");
      out.write("                                <i class=\"pe-7s-science\"></i>\n");
      out.write("                                <p>Icons</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"maps.html\">\n");
      out.write("                                <i class=\"pe-7s-map-marker\"></i>\n");
      out.write("                                <p>Maps</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"notifications.html\">\n");
      out.write("                                <i class=\"pe-7s-bell\"></i>\n");
      out.write("                                <p>Notifications</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"active-pro\">\n");
      out.write("                            <a href=\"upgrade.html\">\n");
      out.write("                                <i class=\"pe-7s-rocket\"></i>\n");
      out.write("                                <p>Upgrade to PRO</p>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"main-panel\">\n");
      out.write("                <nav class=\"navbar navbar-default navbar-fixed\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navigation-example-2\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <a class=\"navbar-brand\" href=\"#\">Dashboard</a>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"collapse navbar-collapse\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-left\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                        <i class=\"fa fa-dashboard\"></i>\n");
      out.write("                                        <p class=\"hidden-lg hidden-md\">Dashboard</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                        <i class=\"fa fa-globe\"></i>\n");
      out.write("                                        <b class=\"caret hidden-lg hidden-md\"></b>\n");
      out.write("                                        <p class=\"hidden-lg hidden-md\">\n");
      out.write("                                            5 Notifications\n");
      out.write("                                            <b class=\"caret\"></b>\n");
      out.write("                                        </p>\n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"#\">Notification 1</a></li>\n");
      out.write("                                        <li><a href=\"#\">Notification 2</a></li>\n");
      out.write("                                        <li><a href=\"#\">Notification 3</a></li>\n");
      out.write("                                        <li><a href=\"#\">Notification 4</a></li>\n");
      out.write("                                        <li><a href=\"#\">Another notification</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"\">\n");
      out.write("                                        <i class=\"fa fa-search\"></i>\n");
      out.write("                                        <p class=\"hidden-lg hidden-md\">Search</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"\">\n");
      out.write("                                        <p>Account</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                        <p>\n");
      out.write("                                            Dropdown\n");
      out.write("                                            <b class=\"caret\"></b>\n");
      out.write("                                        </p>\n");
      out.write("\n");
      out.write("                                    </a>\n");
      out.write("                                    <ul class=\"dropdown-menu\">\n");
      out.write("                                        <li><a href=\"#\">Action</a></li>\n");
      out.write("                                        <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                        <li><a href=\"#\">Something</a></li>\n");
      out.write("                                        <li><a href=\"#\">Another action</a></li>\n");
      out.write("                                        <li><a href=\"#\">Something</a></li>\n");
      out.write("                                        <li class=\"divider\"></li>\n");
      out.write("                                        <li><a href=\"#\">Separated link</a></li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <p>Log out</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"separator hidden-lg\"></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-4\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("\n");
      out.write("                                    <div class=\"header\">\n");
      out.write("                                        <h4 class=\"title\">Email Statistics</h4>\n");
      out.write("                                        <p class=\"category\">Last Campaign Performance</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <div id=\"chartPreferences\" class=\"ct-chart ct-perfect-fourth\"></div>\n");
      out.write("\n");
      out.write("                                        <div class=\"footer\">\n");
      out.write("                                            <div class=\"legend\">\n");
      out.write("                                                <i class=\"fa fa-circle text-info\"></i> Open\n");
      out.write("                                                <i class=\"fa fa-circle text-danger\"></i> Bounce\n");
      out.write("                                                <i class=\"fa fa-circle text-warning\"></i> Unsubscribe\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"stats\">\n");
      out.write("                                                <i class=\"fa fa-clock-o\"></i> Campaign sent 2 days ago\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-8\">\n");
      out.write("                                <div class=\"card\">\n");
      out.write("                                    <div class=\"header\">\n");
      out.write("                                        <h4 class=\"title\">Users Behavior</h4>\n");
      out.write("                                        <p class=\"category\">24 Hours performance</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <div id=\"chartHours\" class=\"ct-chart\"></div>\n");
      out.write("                                        <div class=\"footer\">\n");
      out.write("                                            <div class=\"legend\">\n");
      out.write("                                                <i class=\"fa fa-circle text-info\"></i> Open\n");
      out.write("                                                <i class=\"fa fa-circle text-danger\"></i> Click\n");
      out.write("                                                <i class=\"fa fa-circle text-warning\"></i> Click Second Time\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"stats\">\n");
      out.write("                                                <i class=\"fa fa-history\"></i> Updated 3 minutes ago\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"card \">\n");
      out.write("                                    <div class=\"header\">\n");
      out.write("                                        <h4 class=\"title\">2014 Sales</h4>\n");
      out.write("                                        <p class=\"category\">All products including Taxes</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <div id=\"chartActivity\" class=\"ct-chart\"></div>\n");
      out.write("\n");
      out.write("                                        <div class=\"footer\">\n");
      out.write("                                            <div class=\"legend\">\n");
      out.write("                                                <i class=\"fa fa-circle text-info\"></i> Tesla Model S\n");
      out.write("                                                <i class=\"fa fa-circle text-danger\"></i> BMW 5 Series\n");
      out.write("                                            </div>\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"stats\">\n");
      out.write("                                                <i class=\"fa fa-check\"></i> Data information certified\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <div class=\"card \">\n");
      out.write("                                    <div class=\"header\">\n");
      out.write("                                        <h4 class=\"title\">Tasks</h4>\n");
      out.write("                                        <p class=\"category\">Backend development</p>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"content\">\n");
      out.write("                                        <div class=\"table-full-width\">\n");
      out.write("                                            <table class=\"table\">\n");
      out.write("                                                <tbody>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            <div class=\"checkbox\">\n");
      out.write("                                                                <input id=\"checkbox1\" type=\"checkbox\">\n");
      out.write("                                                                <label for=\"checkbox1\"></label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td>Sign contract for \"What are conference organizers afraid of?\"</td>\n");
      out.write("                                                        <td class=\"td-actions text-right\">\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Edit Task\" class=\"btn btn-info btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-edit\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Remove\" class=\"btn btn-danger btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-times\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                        </td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            <div class=\"checkbox\">\n");
      out.write("                                                                <input id=\"checkbox2\" type=\"checkbox\" checked>\n");
      out.write("                                                                <label for=\"checkbox2\"></label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td>Lines From Great Russian Literature? Or E-mails From My Boss?</td>\n");
      out.write("                                                        <td class=\"td-actions text-right\">\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Edit Task\" class=\"btn btn-info btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-edit\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Remove\" class=\"btn btn-danger btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-times\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                        </td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            <div class=\"checkbox\">\n");
      out.write("                                                                <input id=\"checkbox3\" type=\"checkbox\">\n");
      out.write("                                                                <label for=\"checkbox3\"></label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td>Flooded: One year later, assessing what was lost and what was found when a ravaging rain swept through metro Detroit\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td class=\"td-actions text-right\">\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Edit Task\" class=\"btn btn-info btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-edit\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Remove\" class=\"btn btn-danger btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-times\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                        </td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            <div class=\"checkbox\">\n");
      out.write("                                                                <input id=\"checkbox4\" type=\"checkbox\" checked>\n");
      out.write("                                                                <label for=\"checkbox4\"></label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td>Create 4 Invisible User Experiences you Never Knew About</td>\n");
      out.write("                                                        <td class=\"td-actions text-right\">\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Edit Task\" class=\"btn btn-info btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-edit\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Remove\" class=\"btn btn-danger btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-times\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                        </td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            <div class=\"checkbox\">\n");
      out.write("                                                                <input id=\"checkbox5\" type=\"checkbox\">\n");
      out.write("                                                                <label for=\"checkbox5\"></label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td>Read \"Following makes Medium better\"</td>\n");
      out.write("                                                        <td class=\"td-actions text-right\">\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Edit Task\" class=\"btn btn-info btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-edit\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Remove\" class=\"btn btn-danger btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-times\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                        </td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            <div class=\"checkbox\">\n");
      out.write("                                                                <input id=\"checkbox6\" type=\"checkbox\" checked>\n");
      out.write("                                                                <label for=\"checkbox6\"></label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td>Unfollow 5 enemies from twitter</td>\n");
      out.write("                                                        <td class=\"td-actions text-right\">\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Edit Task\" class=\"btn btn-info btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-edit\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                            <button type=\"button\" rel=\"tooltip\" title=\"Remove\" class=\"btn btn-danger btn-simple btn-xs\">\n");
      out.write("                                                                <i class=\"fa fa-times\"></i>\n");
      out.write("                                                            </button>\n");
      out.write("                                                        </td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                </tbody>\n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"footer\">\n");
      out.write("                                            <hr>\n");
      out.write("                                            <div class=\"stats\">\n");
      out.write("                                                <i class=\"fa fa-history\"></i> Updated 3 minutes ago\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <footer class=\"footer\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <nav class=\"pull-left\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        Home\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        Company\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        Portfolio\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        Blog\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </nav>\n");
      out.write("                        <p class=\"copyright pull-right\">\n");
      out.write("                            &copy; <script>document.write(new Date().getFullYear())</script> <a href=\"http://www.creative-tim.com\">Creative Tim</a>, made with love for a better web\n");
      out.write("                        </p>\n");
      out.write("                    </div>\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <!--   Core JS Files   -->\n");
      out.write("    <script src=\"assets/js/jquery.3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"assets/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("    <!--  Charts Plugin -->\n");
      out.write("    <script src=\"assets/js/chartist.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Notifications Plugin    -->\n");
      out.write("    <script src=\"assets/js/bootstrap-notify.js\"></script>\n");
      out.write("\n");
      out.write("    <!--  Google Maps Plugin    -->\n");
      out.write("    <script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\n");
      out.write("\n");
      out.write("    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->\n");
      out.write("    <script src=\"assets/js/light-bootstrap-dashboard.js?v=1.4.0\"></script>\n");
      out.write("\n");
      out.write("    <!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->\n");
      out.write("    <script src=\"assets/js/demo.js\"></script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("                    $(document).ready(function () {\n");
      out.write("\n");
      out.write("                        demo.initChartist();\n");
      out.write("\n");
      out.write("                        $.notify({\n");
      out.write("                            icon: 'pe-7s-gift',\n");
      out.write("                            message: \"Welcome to <b>Light Bootstrap Dashboard</b> - a beautiful freebie for every web developer.\"\n");
      out.write("\n");
      out.write("                        }, {\n");
      out.write("                            type: 'info',\n");
      out.write("                            timer: 4000\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("    </script>\n");
      out.write("\n");
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
