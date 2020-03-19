<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'interview-resume.jsp' starting page</title>
     	<link rel="stylesheet"
			href="${pageContext.request.contextPath}/css/table.css" type="text/css">
		<link rel="stylesheet"
			href="${pageContext.request.contextPath}/css/cwcalendar.css"
			type="text/css">
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/javascript/comm/comm.js">
	
</script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/javascript/comm/list.js">
	
</script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/javascript/calendar-ch.js">
	
</script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/javascript/jquery-1.7.2.js">
	
</script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/javascript/locate.js">
	
</script>
		<script type="text/javascript"
			src="${pageContext.request.contextPath}/javascript/select.js">
	
</script>
	<script type="text/javascript"
			src="${pageContext.request.contextPath}/javascript/comm/time.js">
			</script>
<script type="text/javascript">
function search() {
	 
		document.interviewForm.submit();
	}

function queryMajor(){
	var mid = $("#firstKindId").val();
	var humanmajorkindname = $("#firstKind"+mid).html();
	$("#firstKindName").val(humanmajorkindname);
	var majorSelect = $("#secondKindId");
	majorSelect.empty();
	majorSelect.append("<option value=''>--请选择--</option>");
	if(mid != 0){
		$.ajax({
			url:'selectConfigQuestionSecondKindinAjax.do?mid='+mid,
			type:'get',
			success:function(data){
	 			for(var i=0;i<data.length;i++){
					var eachMajor = data[i];
					majorSelect.append("<option value='"+eachMajor.secondKindId+"'>"+eachMajor.secondKindName+"</option>");
				}
	 			}
		});
	}
	}
</script>


	</head>

	<body>
		<form name="interviewForm" method="post" action="subjectRegisterSearchStart.do" >
			 <input type="hidden" name="engageResume.interviewStatus" value="false"/>
			 <input type="hidden"  id="firstKindName" name="firstKindName" />
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--招聘考试题库管理--试题查询 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						 
						<input type="submit" value="开始"
							class="BUTTON_STYLE1" onclick="search();">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
			 
				<tr>
					<td class="TD_STYLE1" width="30%">
						请选择试题分类
					</td>
					<td  class="TD_STYLE2" width="30%">
					 
					<select name="firstKindId" onchange="queryMajor()" multiple="multiple" id="firstKindId" 
					style="width: 290;height: 100" class="SELECT_STYLE2"> 
						<option value="0">--请选择--</option>
						<c:forEach items="${qlist}" var="ql">
							<option  value="${ql.firstKindId }" id="firstKind${ql.firstKindId }">${ql.firstKindName }</option>
						</c:forEach>
					 </select>
						<select name="secondKindId" multiple="multiple" id="secondKindId" 
						 style="width: 290;height: 100" size="5" class="SELECT_STYLE2">
							<option>--请选择--</option>
						</select>
					</td>
				</tr>
				 
				 <tr>
					<td class="TD_STYLE1" width="30%">
						请输入关键字
					</td>
					<td width="84%" >
						<input type="text" name="primarKey" value=""
							class="INPUT_STYLE2" />
					</td>
				</tr>
				
				<tr>
					<td class="TD_STYLE1" width="30%">
						请输入登记时间
					</td>
					<td width="84%" class="TD_STYLE2" >
					<input type="hidden" name="utilBean.datePropertyName" value="registTime"/>
					 
					<input type="text" name="startDate"   onclick="aa('startdate')" 
							style="width: 14%" class="INPUT_STYLE2">
						至
						<input type="text" name="endDate" 
							style="width: 14%" class="INPUT_STYLE2" onclick="aa('enddate')">
						（YYYY-MM-DD）
					</td>
				</tr>
			</table>
		</form>
	</body>
	 
</html>