<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>My JSP 'set_problem.jsp' starting page</title>

		 <link rel="stylesheet"
			href="/ssm_hr/page/css/table.css" type="text/css">
		<link rel="stylesheet"
			href="/ssm_hr/page/css/cwcalendar.css" type="text/css">
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/comm/comm.js">
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
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/select.js">
		</script>
	   <script type="text/javascript"
			src="/ssm_hr/page/javascript/comm/time.js">
			</script>
			<script type="text/javascript">
 			window.onload=check;
		function tick() {
			var now = new Date();
			var hours, minutes, seconds, noon;
			var intHours, intMinutes, intSeconds;
			intHours = now.getHours();
			intMinutes = now.getMinutes();
			intSeconds = now.getSeconds();
			if (intHours < 24) {
				hours = intHours+":";
				noon = "A.M.";
			} else {
				intHours = intHours - 24;
				hours = intHours + ":";
				noon = "P.M.";
			}
			if (intMinutes < 10) {
				minutes = "0"+intMinutes+":";
			} else {
				minutes = intMinutes+":";
			}
			if (intSeconds < 10) {
				seconds = "0"+intSeconds+" ";
			} else {
				seconds = intSeconds+" ";
			}
			timeString = hours+minutes+seconds;
			var now = new Date();
		  	document.getElementById("nowTime").value=now.getFullYear()+"-"+(now.getMonth()+1)+"-"+now.getDate()+" "+timeString;
			window.setTimeout("tick();", 1000);
		}
		
		//load事件
		function check(){
			//获得系统当前时间的方法
		  	tick();					
		}
 		</script>
		<script type="text/javascript">
		function search() {
			 
			if(document.getElementById("majorKindId").value=="0"){
			document.getElementById("majorKindId").value=null;
			}
	document.resumeChooseForm.submit();
}
	function queryMajor(){
		var mid = $("#humanMajorKind").val();
		var humanmajorkindname = $("#humanMajorKind"+mid).html();
		$("#humanMajorKindId").val(humanmajorkindname);
		var majorSelect = $("#humanMajorId");
		majorSelect.empty();
		majorSelect.append("<option value=''>--请选择--</option>");
		if(mid != 0){
			$.ajax({
				url:'/ssm_hr/position/ByIdQueryMajor.do?mid='+mid,
				type:'get',
				success:function(data){
					var obj=JSON.parse(data);
		 			for(var i=0;i<obj.length;i++){
						var eachMajor = obj[i];
						majorSelect.append("<option value="+eachMajor.majorId+" id=humanMajor"+eachMajor.majorId+">"+eachMajor.majorName+"</option>");
					}
		 		}
			});
		}
	 	}
</script>
	</head>

	<body>
		<form id="recruitAction!findEngageResume?a=list" name="resumeChooseForm" action="/ssm_hr/subject/subjectSelectstart.do" method="post">
			<input type="hidden"  id="humanMajorKindId" name="firstKindName" />
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--招聘考试管理--考试出题</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="生成套题" class="BUTTON_STYLE1"
							onclick= submit1(); >
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1 bordercolorlight=#848284 bordercolordark=#eeeeee class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="10%">
						职位分类
					</td>
					<td class="TD_STYLE2" colspan="7">
						<select onchange="queryMajor()" multiple="multiple" id="humanMajorKind"
						 style="width: 13.5%;height: 100" class="SELECT_STYLE2"> 
							<option value="0">--请选择--</option>
						<c:forEach items="${mklist}" var="m">
							<option  value="${m.majorKindId }" id="humanMajorKind${m.majorKindId }">${m.majorKindName }</option>
						</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="10%">
						职位名称
					</td>
					<td class="TD_STYLE2" >
						<select name="humanmajorname" multiple="multiple" id="humanMajorId"
						 style="width: 100%;height: 100" size="5" class="SELECT_STYLE2" onchange="cchange()">
							<option>--请选择--</option>
						</select>
					</td>
					<td class="TD_STYLE1" width="12.8%">
						登记人
					</td>
					<td class="TD_STYLE2" width="12.8%">
						<input type="text" id="register"  class="INPUT_STYLE2"/>
					</td>
					<td class="TD_STYLE1" width="12.8%">
						登记时间
					</td>
					<td class="TD_STYLE2" width="12.8%">
						<input type="text" name="registTime"
							  id="nowTime" disabled="disabled"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1" width="12.8%">
						登记限时(分钟)
					</td>
					<td class="TD_STYLE2" width="12.8%">
						<input type="text" id="limiteTime" class="INPUT_STYLE2"/>
					</td>
				</tr>
				<c:forEach items="${qfklist }" var="qfk">
					<tr>
						<td class="firstKindName" class="TD_STYLE1" width="10%">
							${qfk.firstKindName }
						</td>
						<td class="TD_STYLE3"  colspan="7">
							<table width="100%" border="1" cellpadding=0 cellspacing=1 bordercolorlight=#848284 bordercolordark=#eeeeee>
								<tr>
									<td width="43%">试题Ⅱ级分类名称</td>
									<td width="28.5%">可用试题数量</td>
									<td width="28.5%">出题数量</td>
								</tr>
								<c:forEach items="${esaalist }" var="esaa">
									<c:if test="${esaa.firstKindName.equals(qfk.firstKindName) }">
										<tr>
											<td>
											<input type="hidden" class="fkid" value="${qfk.firstKindId }"/>
											<input type="hidden" class="fkname" value="${qfk.firstKindName }"/>
											<input type="hidden" class="skid" value="${esaa.secondKindId }"/>
											<input type="hidden" class="skname" value="${esaa.secondKindName }"/>
											${esaa.secondKindName }
											</td>
											<td>${esaa.amount }</td>
											<td>
												<c:if test="${esaa.amount==0 }">
													<input type="text" class="amount" readonly="readonly" class="INPUT_STYLE2"/>
												</c:if>
												<c:if test="${esaa.amount!=0 }">
													<input type="text" class="amount" class="INPUT_STYLE2"/>
												</c:if>
											</td>
										</tr>
									</c:if>
								</c:forEach>
							</table>
						</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</body>
	<script type="text/javascript">
		function submit1() {
			var humanMajorKindId = $("#humanMajorKind").val();
			var humanMajorKindName = $("#humanMajorKindId").val();
			var humanMajorId = $("#humanMajorId").val();
			var humanMajorName = $("#humanMajor"+humanMajorId).html();
			var register = $("#register").val();
			var registTime = $("#nowTime").val();
			var limiteTime = $("#limiteTime").val();
			if(humanMajorId==''||humanMajorId==null){
				alert("请选择职位名称！");
				return;
			}
			var dList = new Array(); 
			$(".fkid").each(function ( index,element){
				dList.push({"firstKindId":$(this).val(),"firstKindName":$(this).next().val(),"secondKindId":$(this).next().next().val(),"secondKindName":$(this).next().next().next().val(),"questionAmount":$(this).parent().next().next().children().val()});  
			});
		    var engageExamAndDetails = {}; 
		    engageExamAndDetails.majorKindId = ''+humanMajorKindId; 
		    engageExamAndDetails.majorKindName = humanMajorKindName; 
		    engageExamAndDetails.majorId = ''+humanMajorId; 
		    engageExamAndDetails.majorName = humanMajorName; 
		    engageExamAndDetails.register = register; 
		    engageExamAndDetails.registTime = registTime; 
		    engageExamAndDetails.limiteTime = limiteTime; 
		    engageExamAndDetails.dList = dList; 
			$.ajax({
				url:'/ssm_hr/exam/saveExam.do',
				type:'post',
				data:JSON.stringify(engageExamAndDetails),
				dataType:"json",
				contentType : 'application/json;charset=utf-8',
				success:function(data){
					if(data.flag){
						window.location.href="/ssm_hr/exam/queryExamList.do";
					}
		 		}
			});
		}
	</script>
</html>