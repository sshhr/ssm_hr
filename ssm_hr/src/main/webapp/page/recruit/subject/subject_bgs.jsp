<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'subject_register.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
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
		
		
 	 	function mysubmit(){
 	 		document.fm.submit();
 	 	}
		</script>
  </head>
  
  <body>
  <form id="myfm" name="fm" action="/ssm_hr/subject/subjectupdateSubmit.do" method="post">
   <table width="100%">
   			<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--招聘考试题库管理--试题变更查询--试题变更 </font>
					 
					</td>
				</tr>
			<tr>
					<td align="right">
					 
						<input type="button" value="提交" class="BUTTON_STYLE1" onclick="mysubmit()">
						<input type="reset" value="清除" class="BUTTON_STYLE1">
					</td>
				</tr>
   </table>
   <table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<input type="hidden"  name="subId" value="${s.subId }"/>
				<tr>
					<td class="TD_STYLE1">
						试题一级分类
					</td>
					<td class="TD_STYLE2">  
					<input type="text" id="firstKindName" name="firstKindName" value="${s.firstKindName }" readonly="readonly">
					</td>
					<td class="TD_STYLE1">
						试题二级级分类
					</td>
					<td class="TD_STYLE2">  
					<input type="text"  id ="secondKindName" name="secondKindName" value="${s.secondKindName }" readonly="readonly">
					<td class="TD_STYLE1">
						变更者
					</td>
					<td class="TD_STYLE2">
						 <input type="text"  name="changer"  class="INPUT_STYLE2" value=""/>
					</td>
					<td class="TD_STYLE1">
						变更时间
					</td>
					<td class="TD_STYLE2">
						 <input type="text" name="changeTime"
							  id="nowTime" readonly="readonly"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr >
					<td class="TD_STYLE1" height="50px">
						题干
					</td>
					<td class="TD_STYLE2" colspan="7" >
						 <textarea name="content" rows="3" cols="3"   class="TEXTAREA_STYLE1" style="resize:none">${s.content }</textarea>
					</td>
				</tr>
				<tr >
					<td class="TD_STYLE1" height="50px">
						答案a
					</td>
					<td class="TD_STYLE2" colspan="7" >
						 <textarea name="keyA" rows="3" cols="3"   class="TEXTAREA_STYLE1" style="resize:none" value="">${s.keyA }</textarea>
					</td>
				</tr>
				<tr >
					<td class="TD_STYLE1" height="50px">
						答案b
					</td>
					<td class="TD_STYLE2" colspan="7" >
						 <textarea name="keyB" rows="3" cols="3"   class="TEXTAREA_STYLE1" style="resize:none" >${s.keyB }</textarea>
					</td>
				</tr>
				<tr >
					<td class="TD_STYLE1" height="50px">
						答案c
					</td>
					<td class="TD_STYLE2" colspan="7" >
						 <textarea rows="3" name="keyC" cols="3"   class="TEXTAREA_STYLE1" style="resize:none" >${s.keyC }</textarea>
					</td>
				</tr>
				<tr >
					<td class="TD_STYLE1" height="50px">
						答案d
					</td>
					<td class="TD_STYLE2" colspan="7" >
						 <textarea name="keyD"  rows="3" cols="3"   class="TEXTAREA_STYLE1" style="resize:none" >${s.keyD }</textarea>
					</td>
				</tr>
				<tr >
					<td class="TD_STYLE1" height="50px">
						答案e
					</td>
					<td class="TD_STYLE2" colspan="7" >
						 <textarea name="keyE" rows="3" cols="3"   class="TEXTAREA_STYLE1" style="resize:none">${s.keyE }</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						正确答案
					</td>
					<td class="TD_STYLE2">
						 <input  type="text"  name="correctKey"  class="INPUT_STYLE2" value="${s.correctKey }"/>
					</td>
					<td class="TD_STYLE1">
						试题出处
					</td>
					<td class="TD_STYLE2">
						 <input type="text" name="derivation"   class="INPUT_STYLE2" value="${s.derivation }"/>
					</td>
					<td class="TD_STYLE1">
						
					</td>
					<td class="TD_STYLE2">
						 
					</td>
					<td class="TD_STYLE1">
					
					</td>
					<td class="TD_STYLE2">
						 
					</td>
				</tr>
				
	</table>
	</form>
  </body>
</html>
