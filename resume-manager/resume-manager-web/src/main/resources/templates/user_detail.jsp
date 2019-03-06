<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="row form-horizontal">
    <div class="box-body">
        <div class="member_show">
            <div class="member_jbxx clearfix">
                <img class="img" src="/static/images/user.png">
                <%--<dl  class="right_xxln">--%>
                <dl>
                    <dt><span class="">${user.pname}</span></dt>
                    <dd class="" style="margin-left:0">这家伙很懒，什么也没有留下</dd>
                </dl>
            </div>
            <div class="member_content">
                <ul>
                    <%--a.id,
                    a.pname,
                    a.PASSWORD,
                    a.phone,
                    a.email,
                    a.created,
                    a.icard,
                    a.address,
                    a.pid,
                    a.nickname--%>
                    <li><label class="label_name">用户名：</label><span class="name">${user.pname}</span></li>
                    <li><label class="label_name">密码：</label><span class="name">${user.password}</span></li>
                    <li><label class="label_name">昵称：</label><span class="name">${user.nickname}</span></li>
                    <li><label class="label_name">邮箱：</label><span class="name">${user.email}</span></li>
                    <li><label class="label_name">电话：</label><span class="name">${user.phone}</span></li>
                    <li><label class="label_name">创建时间：</label><span class="name">${user.created}</span></li>
                    <li><label class="label_name">身份证：</label><span class="name">${user.icard}</span></li>
                    <li><label class="label_name">地址：</label><span class="name">${user.address}</span></li>
                    <li><label class="label_name">状态：</label><span class="name">${user.pid==1?"启用":"停用"}</span></li>

                </ul>
            </div>
        </div>
    </div>
</div>
<!-- /.content -->
<%--<jsp:include page="../includes/footer.jsp"/>--%>
