<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/ssm_hr/page/css/table.css" type="text/css" />
		<link rel="stylesheet"
			href="/ssm_hr/page/css/cwcalendar.css" type="text/css">
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/comm/comm.js">
		</script>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/comm/time.js">
		</script>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/comm/list.js">
		</script>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/calendar-ch.js">
		</script>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/locate.js">
		</script>
		<script type="text/javascript">
 	  function querysecondByid(){
 			var fid = $("#firstKind").val();
 			var secondSelect = $("#secondKind");
 			var thirdSelect = $("#thirdKind");
 			//通过id属性.val()拿value里面的内容.html()获取文本内容
 			var firstid = $("#first_"+ fid).val();
 			//把拿到的内容放到选择的ID中
 			$("#firstKindId").val(firstid);
 			//清空下拉框
 			thirdSelect.empty();
 			secondSelect.empty();
 			//添加下拉框
 			thirdSelect.append("<option value='0'>--请选择--</option>");
 			secondSelect.append("<option value='0'>--请选择--</option>");
 			if(fid != 0){
 				$.post("/ssm_hr/position/second.do",
 						{
 						fid:fid,
 						},
 						function(data){
 							var obj=JSON.parse(data);
 							for(var i=0;i<obj.length;i++){
 	 							var eachsecond = obj[i];
 	 							secondSelect.append("<option id='second_"+eachsecond.secondKindId+"' value="+eachsecond.secondKindId+">"+eachsecond.secondKindName+"</option>");
 	 						}
 						}
 				);
 			}
 		}
 		
 		function queryThirdyByid(){
 			var fid = $("#firstKind").val();
 			var sid = $("#secondKind").val();
 			var thirdSelect = $("#thirdKind");
 			var secondid=$("#second_"+sid).val();
 			$("#secondKindId").val(secondid);
 			//清空下拉框
 			thirdSelect.empty();
 			//添加下拉框
 			thirdSelect.append("<option value='0'>--请选择--</option>");
 			if(sid != 0){
 				$.post("/ssm_hr/position/third.do",
 						{
 						fid:fid,
 						sid:sid,
 						},
 						function(data){
 							var obj=JSON.parse(data);
 							for(var i=0;i<obj.length;i++){
 	 							var eachThird = obj[i];
 	 							thirdSelect.append("<option id='third_"+eachThird.thirdKindId+"' value="+eachThird.thirdKindId+">"+eachThird.thirdKindName+"</option>");
 	 						}
 						}
 				);
 			}
 		}
 		function getthirdKindid(){
 	 		var tid=$("#thirdKind").val();
 			var thirdid=$("#third_"+tid).val();
 			$("#thirdKindid").val(thirdid);
 	 		}
 		function getMajorid(){
 	 		var sid=$("#majorName").val();
 			var majorid=$("#major_"+sid).val();
 			$("#majorId").val(majorid);
 	 		}
 		
 		function ByIdQueryMajor(){
		    var mid = $("#majorKind").val();
		 	var majorSelect = $("#majorName");
		 	var kindid=$("#kind_"+mid).val();
		    $("#majorKindId").val(kindid);
		 	majorSelect.empty();
		 	majorSelect.append("<option value='0'>--请选择--</option>");
		 	if(mid != 0){
		 		$.ajax({
					url:'/ssm_hr/position/ByIdQueryMajor.do?mid='+mid,
					type:'get',
					success:function(data){
						var obj=JSON.parse(data);
			 			for(var i=0;i<obj.length;i++){
							var eachMajor = obj[i];
							majorSelect.append("<option id='major_"+eachMajor.majorId+"' value="+eachMajor.majorId+">"+eachMajor.majorName+"</option>");
						}
			 			}
				 	});
		 	}
	 	}
 		</script> 
	</head>

	<body>
		<form method="post" action="/ssm_hr/humanresources/recoveryList.do">
		<input  name="firstKindId" type="hidden" id="firstKindId">
		<input  name="secondKindId" type="hidden" id="secondKindId">
		<input  name="thirdKindid" type="hidden" id="thirdKindid">
		<input  name="humanMajorKindId" type="hidden" id="majorKindId">
		<input  name="humanMajorId" type="hidden" id="majorId">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案查询 </font>
					</td>
				</tr>
				<tr>
					<td align="right"> 
						<input type="submit" value="查询" class="BUTTON_STYLE1"/>
						<input type="button" value="搜索" class="BUTTON_STYLE1"
							onclick=" window.location.href='/ssm_hr/humanresources/deleteSearchPage.do'">
						<input type="hidden" name="result" value="toQueryList"/>
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">请选择员工所在I级机构</td>
					<td width="84%" class="TD_STYLE2">
						<select size="5" id="firstKind"
							class="SELECT_STYLE2" onchange="querysecondByid()">
							<option value="" selected="selected">全部</option>
							<c:forEach items="${flist}" var="f">
								<option id="first_${f.firstKindId}" value="${f.firstKindId}">${f.firstKindName}</option>
								</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请选择员工所在II级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select size="5" id="secondKind"
							class="SELECT_STYLE2" onchange="queryThirdyByid()">
							<option value="" selected="selected">全部</option>
								<option value="0"></option>
						</select>
					</td>
				</tr>
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择员工所在III级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select class="SELECT_STYLE2" size="5" id="thirdKind" onchange="getthirdKindid()">
							<option value="" selected="selected">全部</option>
								<option value="0"></option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请选择职位分类
					</td>
					<td width="84%" class="TD_STYLE2">
						<select size="5" id="majorKind"
							class="SELECT_STYLE2" onchange="ByIdQueryMajor()">
							<option value="0" selected="selected">全部</option>
						<c:forEach items="${zwlist}" var="r">
						<option id="kind_${r.majorKindId}" value="${r.majorKindId}">${r.majorKindName}</option>
						</c:forEach>
						</select>
					</td>
				</tr>
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择职位名称
					</td>
					<td width="84%" class="TD_STYLE2">
						<select size="5" class="SELECT_STYLE2" id="majorName" onchange="getMajorid()">
							<option value="0" selected="selected">全部</option>
								
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请输入建档时间
					</td>
					<td width="84%" class="TD_STYLE2">
						<input type="text" name="startdate" onclick="aa('startdate')" readonly="readonly"
							style="width: 14%" class="INPUT_STYLE2" id="date_start">
						至
						<input type="text" name="enddate" onclick="aa('enddate')" readonly="readonly"
							style="width: 14%" class="INPUT_STYLE2" id="date_end" >
						<input type="hidden" name="utilBean.datePropertyName" value="registTime"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>