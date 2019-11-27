<%--
  Created by IntelliJ IDEA.
  User: WJR
  Date: 2019/8/13
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery-3.3.1.js"></script>
<html>
<script>
function demo3() {
    $.ajax({
        type:"POST",
        url:"hello/demo3",
        contentType:"application/json",
        dataType:"json",
        data:'{"name":"张三","age":"18"}',
        success:function (data) {

        }
    })
}
</script>
<body>
<form action="hello/demo2" method="post">
    <input type="text" name="name" value="张三">
    <input type="text" name="age" value="18">
    <input type="submit" value="sub">
</form>
<button onclick="demo3()">jie shou</button><br>
<form action="hello/demo4" method="post" enctype="multipart/form-data">
    <input type="file" name="uploadFile"/>
    <input type="submit" value="wenjianshangchuan">
</form>
<a href="hello/demo18">zidingyilanjieqi</a>
</body>
</html>
