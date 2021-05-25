<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/5/15 0015
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>一、文件上传</h1>
<form action="upload/upload01" method="post" enctype="multipart/form-data">
    文本：<input type="text" name="desc" /><br/>
    文件：<input type="file" name="upload" /><br/>
    <input type="submit"/>
</form>
<h1>二、文件上传</h1>
<form action="upload/upload02" method="post" enctype="multipart/form-data">
    文本：<input type="text" name="desc" /><br/>
    文件：<input type="file" name="upload" /><br/>
    <input type="submit"/>
</form>
<h1>三、跨服务器文件上传</h1>
<form action="upload/upload03" method="post" enctype="multipart/form-data">
    文本：<input type="text" name="desc"/><br/>
    文件：<input type="file" name="upload"/><br/>
    <input type="submit"/>
</form>
</body>
</html>
