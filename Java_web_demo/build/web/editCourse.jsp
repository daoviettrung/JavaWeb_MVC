<%-- 
    Document   : editCourse
    Created on : May 8, 2020, 11:43:05 AM
    Author     : ADMIN
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Edit Course</h1>
         <jsp:useBean id="mrBean" scope="session" class="Model.DataProcess"/>
        <c:set var="c" value="${requestScope['courseDetail']}"/>
        <form method="post" action="ControllerCourse?ac=upDate">
             <table>
                                                    <tr>
                                                        <td><label for="uname"><b>ID</b></label> </td>
                                                        <td><input type="text" name="txtid" required="" value="${c.id}"></td>
                                                    </tr>
                                                    <tr>
                                                        <td><label for="uname"><b> Name</b></label></td> 
                                                        <td><input type="text" name="txtname" required="" value="${c.name}"></td>
                                                    </tr>
                                                    <tr>
                                                        <td><label for="uname"><b>Category</b></label></td> 
                                                        <td><select name="txtcategory" >
                                                            <c:forEach var="c" items="${mrBean.category}" >
                                                        <option value="${c.id}">${c.name}</option>
                                                        
                                                        </c:forEach>
                                                        </select></td>
                                                    </tr>
                                                    <tr>
                                                        <td><label for="uname"><b>Topic</label> </td>
                                                        <td><input type="text" name="txttopic" required="" value="${c.topic}"></td>
                                                    </tr>
                                                    <tr>
                                                        <td><label for="uname"><b>Start</label> </td>
                                                        <td><input type="text" name="txtstart" required="" value="${c.start}" ></td>
                                                    </tr>
                                                    <tr>
                                                        <td><label for="uname"><b>End</label> </td>
                                                        <td><input type="text" name="txtend" required=""  value="${c.end}" ></td>
                                                    </tr>

                                                    <tr>

                                                        <td colspan="2" align="center"><button  class="add1" type="submit" onclick="addsi()">Update   <i class="fa fa-plus-circle"></i>  </button></td>

                                                    </tr>

                                                </table>
        </form>
    </body>
</html>
