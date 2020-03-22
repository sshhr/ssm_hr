<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<link rel="stylesheet" href="/ssm_hr/page/css/table.css" type="text/css" />
		<script type="text/javascript" src="/ssm_hr/page/javascript/comm/comm.js"></script>
		<script type="text/javascript" src="/ssm_hr/page/javascript/jquery-1.7.2.js"></script>
		<title>无标题文档</title>
	</head>

	<body>
		<form name="salary" method="post" action="myexam">
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是：人力资源--招聘管理--考试招聘管理--考试答题
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
					<!-- onclick="register()" -->
						<input type="submit" value="提交"  class="BUTTON_STYLE1">
						<input type="reset" value="清除" class="BUTTON_STYLE1" >
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="74" class="TD_STYLE1">
						姓名
					</td>
					<td width="100" class="TD_STYLE2">
						<input type="text" name="humanName" class="INPUT_STYLE2">
					</td>
					<td width="74" class="TD_STYLE1">
						身份证
					</td>
					<td width="100" class="TD_STYLE2">
						<input type="text" name="humanIdcard"  class="INPUT_STYLE2">
					</td>
					
				</tr>
				<tr>
					<td width="74" class="TD_STYLE1">
						请选择职位分类
					</td>
					<td width="74" class="TD_STYLE2">
						<select name="humanMajorKindId" style="width:153px"  id="majorKind"
							class="SELECT_STYLE2" onchange="ByIdQueryMajor()">
							<option value="0" selected="selected">请选择</option>
						<c:forEach items="${rlist}" var="r">
						<option id="kind_${r.majorKindId}" value="${r.majorKindId}" aa="${r.majorKindName}">${r.majorKindName}</option>
						</c:forEach>
						</select>
						<input type="hidden" id="majorKindId" name="humanMajorKindName">
					</td>
				
					<td width="74" class="TD_STYLE1">
						请选择职位名称
					</td>
					<td width="120" class="TD_STYLE2">
						<select name="humanMajorId" style="width:153px"  class="SELECT_STYLE2" id="majorName" onchange="getMajorid()">
							<option value="0" selected="selected">请选择</option>
						</select>
						<input type="hidden" id="majorId" name="humanMajorName" >
					</td>
				
				</tr>
				
				
			</table>
			<p>
				&nbsp;
			</p>
		</form>
	</body>
</html>
<script type="text/javascript">

		//获取职位
		function ByIdQueryMajor(){
		    var mid = $("#majorKind").val();
		 	var majorSelect = $("#majorName");
		 	var kindid=$("#kind_"+mid).val();
		 	$("#majorKindId").val($("#kind_"+mid).attr("aa"));
		 	majorSelect.empty();
		 	majorSelect.append("<option value=''>--请选择--</option>");
		 	if(mid != 0){
			 	$.ajax({
					url:'ByIdQueryMajor?mid='+mid,
					type:'get',
					success:function(data){
			 			for(var i=0;i<data.length;i++){
							var eachMajor = data[i];
							majorSelect.append("<option id='major_"+eachMajor.majorId+"' yy="+eachMajor.majorName+" value="+eachMajor.majorId+">"+eachMajor.majorName+"</option>");
						}
			 			}
				 	});
		 	}
	 	}
	 	//获取职位
	 	function getMajorid(){
 	 		var sid=$("#majorName").val();
 			var majorid=$("#major_"+sid).val();
 			$("#majorId").val($("#major_"+sid).attr("yy"));
 	 		}
 		
</script>
