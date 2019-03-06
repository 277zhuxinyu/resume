<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <jsp:include page="../includes/header.jsp"/>
    <script src="${pageContext.request.contextPath }/static/assets/js/jquery.min.js"></script>
    <title>用户查看</title>
</head>
<body>
<div class="member_show">
    <div class="member_jbxx clearfix">
        <img class="img" src="${pageContext.request.contextPath }/static/images/user.png">
        <dl class="right_xxln">
            <dt><span class="">${user.username}</span></dt>
            <dd class="" style="margin-left:0">这家伙很懒，什么也没有留下</dd>
        </dl>
    </div>
    <div class="member_content">
        <!-- Main row -->
        <div class="row">
            <div class="col-md-12">
                <!-- Horizontal Form -->
                <div class="box box-info">
                    <div class="box-header with-border">
                        <h3 class="box-title">${user.id==null?"新增":"编辑"}用户</h3>
                    </div>
                    <!-- /.box-header -->
                    <!-- form start -->
                    <%--<form class="form-horizontal" action="/user/save" method="post">--%>

                    <form:form cssClass="form-horizontal" action="/admin_user/save" method="post" modelAttribute="user">
                    <form:hidden path="id"/>
                 <%--   <form:hidden path="password"/>--%>
                    <div class="box-body">
                        <div class="form-group">
                            <label for="username" class="col-sm-2 control-label">用户名</label>

                            <div class="col-sm-10">
                                    <%--<input type="text" name="username" class="form-control" id="username"--%>
                                    <%--placeholder="姓名">--%>
                                <form:input path="username" class="form-control" placeholder="用户名"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="col-sm-2 control-label">密码</label>

                            <div class="col-sm-10">
                                    <%--<input type="text" name="username" class="form-control" id="username"--%>
                                    <%--placeholder="姓名">--%>
                                <form:input path="password" class="form-control" placeholder="密码"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="grade" class="col-sm-2 control-label">权限级别(1-7)</label>

                            <div class="col-sm-10">
                                    <%--<input type="password" name="password" class="form-control" id="password"--%>
                                    <%--placeholder="密码">--%>
                                <form:input path="grade" class="form-control" placeholder="权限级别"/>
                            </div>
                        </div>

                        <!-- /.box-body -->
                        <div class="box-footer">
                            <button type="button" onclick="history.go(-1)" class="btn btn-default">返回</button>
                            <button type="submit" class="btn btn-info pull-right">提交</button>
                        </div>
                        <!-- /.box-footer -->
                        </form:form>
                    </div>
                </div>
            </div>
            <!-- /.row (main row) -->
        </div>
    </div>
</div>
</body>
</html>
