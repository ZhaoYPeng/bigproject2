<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>无标题文档</title>
    <!--引入EasyUI的样式文件 -->
    <link rel="stylesheet" type="text/css" href="../../js/jquery-easyui-1.5/themes/bootstrap/easyui.css"/>
    <!-- 图标样式 -->
    <link rel="stylesheet" type="text/css" href="../../js/jquery-easyui-1.5/themes/icon.css"/>
    <!-- 引入easyui的脚本文件 -->
    <script type="application/javascript" src="../../js/jquery-easyui-1.5/jquery.min.js"></script>
    <script type="application/javascript" src="../../js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
    <!-- 语言脚本 -->
    <script type="application/javascript" src="../../js/jquery-easyui-1.5/locale/easyui-lang-zh_CN.js"></script>

</head>

<body>
生日：
<input id="birthday" name="birthday" type="text" class="easyui-datebox" required="required"> </input>
数据表格：
<table id="dg"></table>

<script type="application/javascript">
    $('#dg').datagrid({
        url: 'datagrid_data.json',
        columns: [[
            {field: 'code', title: '代码', width: 100},
            {field: 'name', title: '名称', width: 100},
            {field: 'price', title: '价格', width: 100, align: 'right'}
        ]]
    });
</script>
树:
<ul id="tt"></ul>
<script type="application/javascript">
    $('#tt').tree({
        url: 'tree_data.json'
    });
</script>

</body>
</html>