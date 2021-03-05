<%--
  Created by IntelliJ IDEA.
  User: a111
  Date: 2021/3/5
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setAttribute("ctx", request.getContextPath()); %>
<html>
<head>
    <title>Skill</title>
</head>
<body>
<div>
    multipart
    <form action="${ctx}/test4" method="post" enctype="multipart/form-data">
        <input name="name" placeholder="name">
        <input name="photo" type="file">
        <button type="submit">请求</button>
    </form>
</div>

<div>
    <a href="${ctx}/skills/get?id=5" target="_blank">单个</a>
</div>

<div>
    <a href="${ctx}/skills/list" target="_blank">列表</a>
</div>

<div>
    <form action="${ctx}/skills/save" method="post">
        <div><input name="id" placeholder="id"></div>
        <div>姓名<input name="name" placeholder="name"></div>
        <div>技能<input name="level" placeholder="level"></div>
        <div>
            <button type="submit">保存</button>
        </div>
    </form>
</div>

<div>
    <form action="${ctx}/skills/remove" method="post">
        <input type="id" placeholder="id">
        <button type="submit">删除</button>
    </form>
</div>

</body>
</html>
