<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="../css/table.css" type="text/css" />
		<link rel="stylesheet"
			href="css/cwcalendar.css" type="text/css">
		<script type="text/javascript"
			src="javascript/comm/comm.js">
		</script>
		<script type="text/javascript"
			src="javascript/comm/time.js">
		</script>
		<script type="text/javascript"
			src="javascript/comm/list.js">
		</script>
		<script type="text/javascript"
			src="javascript/calendar-ch.js">
		</script>
		<script type="text/javascript"
			src="javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="javascript/locate.js">
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
 				$.ajax({
 					url:'querySecondByFid?fid='+fid,
 					type:'get',
 					success:function(data){
 						for(var i=0;i<data.length;i++){
 							var eachsecond = data[i];
 							secondSelect.append("<option id='second_"+eachsecond.secondkindid+"' value="+eachsecond.secondkindid+">"+eachsecond.secondkindname+"</option>");
 						}
 					}
 				});
 			}
 		}
 		
 		function queryThirdyByid(){
 			var sid = $("#secondKind").val();
 			var thirdSelect = $("#thirdKind");
 			var secondid=$("#second_"+sid).val();
 			$("#secondKindId").val(secondid);
 			//清空下拉框
 			thirdSelect.empty();
 			//添加下拉框
 			thirdSelect.append("<option value='0'>--请选择--</option>");
 			if(sid != 0){
 				$.ajax({
 					url:'queryThirdyBySid?sid='+sid,
 					type:'get',
 					success:function(data){
 						for(var i=0;i<data.length;i++){
 							var eachThird = data[i];
 							thirdSelect.append("<option id='third_"+eachThird.thirdkindid+"' value="+eachThird.thirdkindid+">"+eachThird.thirdkindname+"</option>");
 						}
 					}
 				});
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
					url:'ByIdQueryMajor?mid='+mid,
					type:'get',
					success:function(data){
			 			for(var i=0;i<data.length;i++){
							var eachMajor = data[i];
							majorSelect.append("<option id='major_"+eachMajor.majorid+"' value="+eachMajor.majorid+">"+eachMajor.majorname+"</option>");
						}
			 			}
				 	});
		 	}
	 	}
 		</script> 
		
	</head>

	<body>
		<form method="post" action="querys_change_locate">
		<input  name="firstkindid" type="hidden" id="firstKindId">
		<input  name="secondkindid" type="hidden" id="secondKindId">
		<input  name="thirdkindid" type="hidden" id="thirdKindid">
		<input  name="majorkindid" type="hidden" id="majorKindId">
		<input  name="majorid" type="hidden" id="majorId">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案变更 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="查询" class="BUTTON_STYLE1"/>
						<input type="button" value="搜索" class="BUTTON_STYLE1"
							onclick="location.href='tochange_search'">
						<input type="hidden" name="result" value="toChangeList"/>
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择员工所在I级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="humanFile.firstKindId" size="5" id="firstKind"
							class="SELECT_STYLE2" onchange="querysecondByid()">
							<option value="" selected="selected">全部</option>
							<c:forEach items="${flist}" var="f">
								<option id="first_${f.firstkindid}" value="${f.firstkindid}">${f.firstkindname}</option>
								</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请选择员工所在II级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="humanFile.secondKindId" size="5" id="secondKind"
							class="SELECT_STYLE2" onchange="queryThirdyByid()">
							<option value="" selected="selected">全部</option>
						</select>
					</td>
				</tr>
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择员工所在III级机构
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="thirdKind" class="SELECT_STYLE2" size="5" id="thirdKind" onchange="getthirdKindid()">
							<option value="" selected="selected">全部</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请选择职位分类
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="humanFile.humanMajorKindId" size="5" id="majorKind"
							class="SELECT_STYLE2" onchange="ByIdQueryMajor()">
							<option value="" selected="selected">全部</option>
							<c:forEach items="${rlist}" var="r">
								<option id="kind_${r.majorkindid}" value="${r.majorkindid}">${r.majorkindname}</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr class="TR_STYLE1">
					<td width="16%" class="TD_STYLE1">
						请选择职位名称
					</td>
					<td width="84%" class="TD_STYLE2">
						<select name="humanFile.humanMajorId" size="5" class="SELECT_STYLE2" id="majorName" onchange="getMajorid()">
							<option value="" selected="selected">全部</option>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请输入建档时间
					</td>
					<td width="84%" class="TD_STYLE2">
						<input type="text" name="min" onclick="aa('min')" readonly="readonly"
							style="width: 14%" class="INPUT_STYLE2" id="date_start">
						至
						<input type="text" name="max" onclick="aa('max')" readonly="readonly"
							style="width: 14%" class="INPUT_STYLE2" id="date_end">
						<input type="hidden" name="utilBean.datePropertyName" value="registTime"/>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>