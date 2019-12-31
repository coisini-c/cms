<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/index.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function fenye(num) {
		$("[name=pagenum]").val(num);
		$("form").submit();
	}
	 function shanchu() {
		 var ids="";
		$("[name=gids]:checked").each(function(i,val) {
			ids+=$(this).val()+",";
		})
		
		ids=ids.substring(0,ids.length-1);
		alert(ids)
		location="del.do?ids="+ids;
	}
	 function xiangqing(gid) {
		
		$("[name=gid]").val=(gid);
		$("form").submit();
	}
</script>
</head>
<body>
	<input type="button" value="添加" onclick="location='add.jsp'"> 
	<table>
		<tr>
				<td>
					<input type="button" value="删除" onclick="shanchu()">
				</td>
				<td>名称</td>
				<td>英文名称</td>
				<td>种类</td>
				<td>品牌</td>
				<td>尺寸</td>
				<td>价格</td>
				<td>数量</td>
				<td>标签</td>
				<td>图片</td>
				<td>操作</td>
		</tr>
				
		<c:forEach items="${list}" var="list" varStatus="count" >
			<tr>
				<td>
					<input type="checkbox" value="${list.gid}" name="gids" >
				</td>
				<td>${list.gname}</td>
				<td>${list.gename}</td>
				<td>${list.kind.kname}</td>
				<td>${list.brand.bname}</td>
				<td>${list.gsize}</td>
				<td>${list.gprice}</td>
				<td>${list.gnum}</td>
				<td>${list.ginput}</td>
				<td>
					<img style=" width: 40px;height: 30px;" alt="图片损坏" src="load/${list.gimg}">
				</td>
				<td>
					<input type="button" onclick="xiangqing(${list.gid})" value="详情">
				</td>
			</tr>
		</c:forEach>
	</table>
	<form action="selall.do">
		<input type="hidden" name="gid" value="${dats.gid }">
		<input type="text" name="gname" value="${dats.gname }">
		<input type="button" onclick="fenye(${page.prePage==0?1:page.prePage})" value="上一页">
		<c:forEach begin="1" end="${page.pages}" var="num">
			<input type="button" onclick="fenye(${num})" value="${num }">
		</c:forEach>
		<input type="button" onclick="fenye(${page.nextPage==0?page.pages:page.nextPage})" value="下一页">
		共 ${page.pages}页   
		到<input type="text" style="width: 20px;" name="pagenum" value="${dats.pagenum }">页
		<button>确定</button>
	</form>
</body>
</html>