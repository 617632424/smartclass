<%--
  Created by IntelliJ IDEA.
  User: axi233
  Date: 2019/12/19
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="Shortcut Icon" href="assets/images/classroom.png" type="image/x-icon" />

  <title>登录</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

  <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>

  <link rel="stylesheet" type="text/css" href="assets/css/style.css"/>
  <link rel="stylesheet" type="text/css" href="assets/css/animate.css"/>
  <link rel="stylesheet" type="text/css" href="assets/css/login.css"/>

</head>
<body>
<nav class="navbar navbar-default" role="navigation">
  <div class="container">
    <div class="navbar-header">
      <a class="navbar-brand" href="#" id="a1">智慧教室</a>
    </div>
  </div>
</nav>

<div class="container">
  <div class="middle-box text-center loginscreen animated fadeInDown">
    <form class="form-horizontal" role="form" action="#">
      <div class="form-group">
        <h3 class="logo">
          用户登录
        </h3>
      </div>
      <div class="form-group">
        <input type="text" class="form-control" name="account" placeholder="用户名"/>
      </div>
      <div class="form-group">
        <input type="password" class="form-control" name="password" placeholder="密码"/>
      </div>
      <div class="form-group">
        <div class="checkbox">
          <label><input type="checkbox">下次自动登录</label>
        </div>
      </div>
      <div class="form-group">
        <button type="submit" class="btn btn-default btn-block">登录</button>
      </div>
      <p class="text-muted text-center">
        <a href="#"><small>忘记密码了？</small></a> | <a href="#">注册一个新账号</a>
      </p>
    </form>
  </div>
</div>
<%--全局js--%>
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>
</html>
