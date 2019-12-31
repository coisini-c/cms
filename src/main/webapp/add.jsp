
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/index.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function() {
		$.post("selbir.do",null,function(dats){
			$.each(dats,funcion(i,dat){
				
			})
		},"json")
	})
</script>
</head>
<body>
	<form action="" method="post">
		商品名称：<input type="text" name="gname">
		英文：<input type="text" name="geame">
		 品牌：<select name="bid">
		 		
		 	</select>
		 种类：<select name="kid">
		 		
		 	</select>
		 尺寸：<input type="text" name="gsize">
		 单价：<input type="text" name="gprice">
		 数量：<input type="text" name="gnum">
		 标签：<input type="text" name="ginput">
		 图片上传：<input type="file" name="myfile">
	</form>
</body>
</html>