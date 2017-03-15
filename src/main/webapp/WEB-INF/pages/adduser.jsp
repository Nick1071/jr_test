<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }

        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            overflow: hidden;
            word-break: normal;
            border: 1px solid #ccc;
            color: #333;
            background-color: #fff;
        }

        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            overflow: hidden;
            word-break: normal;
            border: 1px solid #ccc;
            color: #333;
            background-color: #f0f0f0;
        }

    </style>
</head>
<body>
<h2>Add/Edit User</h2>
  
    <form:form method="POST" modelAttribute="user">
        <form:input type="hidden" path="id" id="id"/>
        <table>
            <tr>
                <td><label for="name">Name: </label> </td>
                <td><form:input path="name" id="name"/></td>
                <td><form:errors path="name" cssClass="error"/></td>
            </tr>
         
            <tr>
                <td><label for="age">Age: </label> </td>
                <td><form:input path="age" id="age"/></td>
                <td><form:errors path="age" cssClass="error"/></td>
            </tr>
     
            <tr>
                <td><label for="admin">IsAdmin: </label> </td>
                <td><form:input path="admin" id="admin"/></td>
                <td><form:errors path="admin" cssClass="error"/></td>
            </tr>
     
            <tr>
                <td><label for="createdDate">CreatedDate </label> </td>
                <td><form:input path="createdDate" id="createdDate"/></td>
                <td><form:errors path="createdDate" cssClass="error"/></td>
            </tr>
            <tr>
                <td colspan="2">
                    <c:if test="${edit=='true'}">
                        <input type="submit" value="Edit"/>
                    </c:if>
                    <c:if test="${edit=='false'}">
                        <input type="submit"
                           value="Add"/>
                    </c:if>
                </td>
            </tr>
        </table>
    </form:form>
    <br/>
    <br/>
    Go back to <a href="<c:url value='/users' />">User List</a>
</body>
</html>
