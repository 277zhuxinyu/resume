<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <jsp:include page="../includes/header.jsp"/>
    <script src="${pageContext.request.contextPath }/static/assets/js/jquery.min.js"></script>
    <title>借贷信息查看</title>
</head>
<body>
<div class="member_show">
    <div class="member_jbxx clearfix">
        <img class="img" src="${pageContext.request.contextPath }/static/images/user.png">
        <dl class="right_xxln">
            <dt><span class="">${borrowLoan.name}</span></dt>
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
                        <h3 class="box-title">新增借贷信息</h3>
                    </div>
                    <!-- /.box-header -->
                    <!-- form start -->
                    <%--<form class="form-horizontal" action="/user/save" method="post">--%>

                    <form:form cssClass="form-horizontal" action="/credit/save" method="post" modelAttribute="borrowLoan">
                    <%--<form:hidden path="id"/>--%>
                        <%--   <form:hidden path="password"/>--%>
                    <div class="box-body">
                        <div class="form-group">
                            <label for="name" class="col-sm-2 control-label">用户名</label>

                            <div class="col-sm-10">
                                    <%--<input type="text" name="username" class="form-control" id="username"--%>
                                    <%--placeholder="姓名">--%>
                                <form:input path="name" class="form-control" placeholder="用户名"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="pid" class="col-sm-2 control-label">个人（0）或企业（1）</label>

                            <div class="col-sm-10">
                                    <%--<input type="text" name="username" class="form-control" id="username"--%>
                                    <%--placeholder="姓名">--%>
                                <form:input path="pid"  class="form-control" placeholder="个人（0）或企业（1）"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="jieMoney" class="col-sm-2 control-label">借贷金额</label>

                            <div class="col-sm-10">
                                    <%--<input type="password" name="password" class="form-control" id="password"--%>
                                    <%--placeholder="密码">--%>
                                <form:input path="jieMoney"  class="form-control" placeholder="借贷金额"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="month" class="col-sm-2 control-label">借贷期限</label>

                            <div class="col-sm-10">
                                    <%--<input type="password" name="password" class="form-control" id="password"--%>
                                    <%--placeholder="密码">--%>
                                <form:input path="month" class="form-control" placeholder="借贷期限"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="huanMoney" class="col-sm-2 control-label">还款总额</label>

                            <div class="col-sm-10">
                                    <%--<input type="password" name="password" class="form-control" id="password"--%>
                                    <%--placeholder="密码">--%>
                                <form:input path="huanMoney"  class="form-control" placeholder="还款总额"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="totalInterest" class="col-sm-2 control-label">总利息</label>

                            <div class="col-sm-10">
                                    <%--<input type="password" name="password" class="form-control" id="password"--%>
                                    <%--placeholder="密码">--%>
                                <form:input path="totalInterest"  class="form-control" placeholder="总利息"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="perMoney" class="col-sm-2 control-label">每期还款额</label>

                            <div class="col-sm-10">
                                    <%--<input type="password" name="password" class="form-control" id="password"--%>
                                    <%--placeholder="密码">--%>
                                <form:input path="perMoney" class="form-control" placeholder="每期还款额"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="repaytime" class="col-sm-2 control-label">还款截止日期</label>

                            <div class="col-sm-10">
                                    <%--<input type="password" name="password" class="form-control" id="password"--%>
                                    <%--placeholder="密码">--%>
                                <form:input path="repaytime"  class="form-control" placeholder="还款截止日期"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="tid" class="col-sm-2 control-label">正常（0）或冻结（1）</label>

                            <div class="col-sm-10">
                                    <%--<input type="password" name="password" class="form-control" id="password"--%>
                                    <%--placeholder="密码">--%>
                                <form:input path="tid"  class="form-control" placeholder="正常（0）或冻结（1）"/>
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
