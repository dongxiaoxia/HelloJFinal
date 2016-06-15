<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
    <title>JFinal Demo</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>用户CRUD JFinal Demo</h1>
    <div class="panel panel-default">
        <div class="panel-heading clearfix">
            <span>用户CRUD JFinal Demo</span>
            <a href="/user/create" class="btn btn-primary pull-right">新增</a>
        </div>
        <div class="panel-body">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>ID</th>
                    <th>名称</th>
                    <th>密码</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${users}" var="user" >
                    <tr id="${user.userid}">
                        <td>${user.userid}</td>
                        <td>${user.username}</td>
                        <td>${user.password}</td>
                        <td>
                            <a class="btn btn-primary" href="/user/edit/${user.userid}">修改</a>
                            <a class="btn btn-danger delete-btn" onclick="user.delete(${user.userid})">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
        <div class="panel-footer clearfix">
            <span class="pull-right">共有<span id="user-length">${fn:length(users)}</span>条记录</span>
        </div>
    </div>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="http://apps.bdimg.com/libs/jquery/2.0.0/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="/user/user.js"></script>
<script>
    $(document).ready(function(){
       user.init();
    });
</script>
</body>
</html>
