<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/22
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="sidebar" id="sidebar">
    <script type="text/javascript">
        try {
            ace.settings.check('sidebar', 'fixed')
        } catch (e) {
        }
    </script>
    <div class="sidebar-shortcuts" id="sidebar-shortcuts">
        <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
            后台管理系统
        </div>
        <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
            <span class="btn btn-success"></span>
            <span class="btn btn-info"></span>
            <span class="btn btn-warning"></span>
            <span class="btn btn-danger"></span>
        </div>
    </div><!-- #sidebar-shortcuts -->
    <ul class="nav nav-list" id="nav_list">
        <li class="home"><a href="#" class="iframeurl" title=""><i
                class="icon-dashboard"></i><span class="menu-text"> 系统首页 </span></a></li>
        <li>
            <a href="#" class="dropdown-toggle"><i class="icon-user"></i><span class="menu-text"> 用户管理 </span><b
                    class="arrow icon-angle-down"></b></a>
            <ul class="submenu">
                <%--<li class="home"><a href="javascript:void(0)" name="user_list.html" title="用户列表" class="iframeurl"><i class="icon-double-angle-right"></i>用户列表</a></li>--%>
                <li class="home"><a href="javascript:void(0)" name="${pageContext.request.contextPath }/user/list" title="个人用户列表"
                                    class="iframeurl"><i class="icon-double-angle-right"></i>个人用户列表</a></li>

                <li class="home"><a href="javascript:void(0)" name="${pageContext.request.contextPath }/user/form" title="新增个人用户"
                                    class="iframeurl"><i class="icon-double-angle-right"></i>新增个人用户</a></li>

                <%--<li class="home"><a href="javascript:void(0)" name="user_list.html" title="用户列表" class="iframeurl"><i class="icon-double-angle-right"></i>用户列表</a></li>--%>
                <li class="home"><a href="javascript:void(0)" name="${pageContext.request.contextPath }/com_user/list" title="企业用户列表"
                                    class="iframeurl"><i class="icon-double-angle-right"></i>企业用户列表</a></li>

                <li class="home"><a href="javascript:void(0)" name="${pageContext.request.contextPath }/com_user/form" title="新增企业用户"
                                    class="iframeurl"><i class="icon-double-angle-right"></i>新增企业用户</a></li>
            </ul>
        </li>
        <li>
            <a href="#" class="dropdown-toggle"><i class="icon-user"></i><span class="menu-text"> 基金理财管理 </span><b class="arrow icon-angle-down"></b></a>
            <ul class="submenu">
                <li class="home"><a href="${pageContext.request.contextPath }/jijin/list" name="${pageContext.request.contextPath }/jijin/list" title="基金列表"  class="iframeurl"><i class="icon-double-angle-right"></i>基金列表</a></li>
                <li class="home"><a href="${pageContext.request.contextPath }/notice/list" name="${pageContext.request.contextPath }/notice/list" title="基金公告"  class="iframeurl"><i class="icon-double-angle-right"></i>基金公告</a></li>
                <li class="home"><a href="${pageContext.request.contextPath }/licai/list" name="${pageContext.request.contextPath }/licai/list" title="理财列表"  class="iframeurl"><i class="icon-double-angle-right"></i>理财列表</a></li>
                <li class="home"><a href="${pageContext.request.contextPath }/info/list" name="${pageContext.request.contextPath }/info/list" title="相关资讯"  class="iframeurl"><i class="icon-double-angle-right"></i>相关资讯</a></li>
                <li class="home"><a href="${pageContext.request.contextPath }/order/list" name="${pageContext.request.contextPath }/order/list" title="订单列表"  class="iframeurl"><i class="icon-double-angle-right"></i>订单列表</a></li>
            </ul>
        </li>
        <li>
            <a href="#" class="dropdown-toggle"><i class="icon-user"></i><span class="menu-text"> 借贷信息管理 </span><b class="arrow icon-angle-down"></b></a>
            <ul class="submenu">
                <li class="home"><a href="javascript:void(0)" name="${pageContext.request.contextPath }/credit/list" title="借贷信息列表"  class="iframeurl"><i class="icon-double-angle-right"></i>借贷信息列表</a></li>
            </ul>
        </li>


        <li><a href="#" class="dropdown-toggle"><i class="icon-group"></i><span class="menu-text"> 管理员管理 </span><b
                class="arrow icon-angle-down"></b></a>
            <ul class="submenu">


                <li class="home"><a href="${pageContext.request.contextPath }/admin_user/list" name="administrator.html" title="管理员列表"
                                    class="iframeurl"><i class="icon-double-angle-right"></i>管理员列表</a></li>
            </ul>
        </li>
    </ul>
    <div class="sidebar-collapse" id="sidebar-collapse">
        <i class="icon-double-angle-left" data-icon1="icon-double-angle-left"
           data-icon2="icon-double-angle-right"></i>
    </div>
    <script type="text/javascript">
        try {
            ace.settings.check('sidebar', 'collapsed')
        } catch (e) {
        }
    </script>
</div>
<div class="main-content">
    <script type="text/javascript">
        try {
            ace.settings.check('breadcrumbs', 'fixed')
        } catch (e) {
        }
    </script>
    <div class="breadcrumbs" id="breadcrumbs">
        <ul class="breadcrumb">
            <li>
                <i class="icon-home home-icon"></i>
                <a href="index.html">首页</a>
            </li>
            <li class="active"><span class="Current_page iframeurl"></span></li>
            <li class="active" id="parentIframe"><span class="parentIframe iframeurl"></span></li>
            <li class="active" id="parentIfour"><span class="parentIfour iframeurl"></span></li>
        </ul>
    </div>


    <!-- /.page-content -->
</div>
<!-- /.main-content -->
