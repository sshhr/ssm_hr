<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'problem_set_list.jsp' starting page</title>
		<link rel="stylesheet"
			href="/ssm_hr/page/css/table.css" type="text/css">
		<link rel="stylesheet"
			href="/ssm_hr/page/css/cwcalendar.css"
			type="text/css">
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
     </head>

	<body>
		<form method="post" action="" name="fm">
				<input type="hidden" name="utilBean.currPage" id="page"/>
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--招聘考试管理--考试出题 
						</font>
					</td>
				</tr>
			  <tr>
					<td align="right"> 
						<input type="button" value="出题" class="BUTTON_STYLE1" onclick="setproblem();">
					</td>
				</tr>
			</table> 
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="15%" class="TD_STYLE1">
						职业分类编号
					</td>
					<td width="25%" class="TD_STYLE1">
						职业分类名称
					</td>
					<td width="15%" class="TD_STYLE1">
						职位编号
					</td>
					<td width="25%" class="TD_STYLE1">
						职位名称
					</td>
					<td width="10%" class="TD_STYLE1">
						套题数量
					</td>
					<td width="10%" class="TD_STYLE1">
						出题
					</td>
				</tr>
				    <c:forEach items="${elist}" var="e">
					<tr>
						<td class="TD_STYLE2">
						${e.majorKindId }
						</td>
						<td class="TD_STYLE2">
						${e.majorKindName }
						</td>
						<td class="TD_STYLE2">
						${e.majorId }
						</td>
						<td class="TD_STYLE2">
						${e.majorName }
						</td>
						<td class="TD_STYLE2">
						${e.amount }
						</td>
						<td class="TD_STYLE2">
							<a href="">出题</a>
						</td>
					</tr>
					</c:forEach>
			</table>
		</form>
		<script type="text/javascript">
		function up(currPage,row){  
		if(currPage<=0){
		document.getElementById("page").value = row;
		}else{
		document.getElementById("page").value =currPage; 
		}
		 document.fm.submit();
		}
		function down(currPage,row){ 
		if(currPage>=row){
		document.getElementById("page").value = row;
		}else{
		document.getElementById("page").value =currPage; 
		}
		 document.fm.submit();
		}
		function tj(row){
	     document.getElementById("page").value = document.getElementById("currPage").value;
	     if(document.getElementById("currPage").value>row){
	     alert("最大页数为"+row+",当前为第"+row+"页 ");
	     return false;
	     }
	     document.fm.submit();
	 	}
		
		<!--上面出题-->
		function setproblem(){
			window.location.href="/ssm_hr/exam/setExamList.do";
		 }
		</script>
	</body>
</html>