<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>My JSP 'position-release_details.jsp' starting page</title>
    
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
		
		<script type="text/javascript">
		function search(id){ 
		 // document.fm.submit();		
 		window.location.href="/HR_Fist/recruit/recruitAction!register?id="+id;
		}
		</script>
   
 		
 	</head>
	<body>
		<form id="recruitAction!toRegister" name="fm" action="toRegister?mrid=${mr.mreId }" method="post" enctype="multipart/form-data">
			<input type="hidden" id="fisrtKindName" name="firstkindid" value="${mr.firstKindId }"/>
			<input type="hidden" id="secondKindName" name="secondkindid" value="${mr.secondKindId }">
			<input type="hidden" id="thirdKindName" name="thirdkindid" value="${mr.thirdKindId }">
			<input type="hidden" id="majorKindName" name="majorkindid" value="${mr.majorKindId }">
			<input type="hidden" id="majorName" name="majorid" value="${mr.majorId }">
			<input type="hidden" name ="mreid" value="${mr.mreId }"/>
			<table width="100%"> 
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--招聘管理--职位发布管理--职位发布查询--详细  </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="确认申请" onclick="search('531')" class="BUTTON_STYLE1" />
						<input type="button" value="返回" class="BUTTON_STYLE1" onclick="history.back();">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="11%">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						${mr.firstKindName }
					</td>
					<td width="11%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE2">
						${mr.secondKindName }
					</td>
					<td width="11%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2"  >
						${mr.thirdKindName }
					</td>
					<td width="11%" class="TD_STYLE1">
						招聘类型
					</td>
					<td class="TD_STYLE2" colspan="2">
						${mr.engageType }
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
						${mr.majorKindName }
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
						${mr.majorName }
					</td>
					<td class="TD_STYLE1">
						招聘人数
					</td>
					<td   class="TD_STYLE2">
						 <input type="text" readonly="readonly" name="humanamount" id="humanAmount"  class="INPUT_STYLE2" value="${mr.humanAmount }">
					</td>
					<td class="TD_STYLE1">
						截止日期
					</td>
					<td   class="TD_STYLE2">
							  <input type="text" name="deadline" 
							  class="INPUT_STYLE2" id="date_start" readonly="readonly" value="${mr.deadline }">
					</td>
				</tr>
				<tr>
				<td class="TD_STYLE1">
						登记人
					</td>
					<td  class="TD_STYLE2">
						 ${mr.register }
					</td>
					<td class="TD_STYLE1">
						登记时间
					</td>
					<td   class="TD_STYLE2">
					
							<input type="text" name="registtime"
							  id="nowTime" readonly="readonly" value="${mr.registTime }"
							class="INPUT_STYLE2">
					</td>
					
					
					<td>&nbsp; </td>
					<td>&nbsp; </td>
					<td>&nbsp; </td>
					<td>&nbsp; </td>
					
				</tr>
			<tr>
					<td class="TD_STYLE1">
						职位描述
					</td>
					<td class="TD_STYLE2" colspan="8">
						<textarea name="majordescribe" readonly="readonly" rows="4" cols="80" class="TEXTAREA_STYLE1">${mr.majorDescribe }</textarea>
					</td>
					 
				</tr>
					<tr>
					<td class="TD_STYLE1">
						招聘要求
					</td>
					<td class="TD_STYLE2" colspan="8">
						<textarea name="engagerequired" readonly="readonly" rows="4"  cols="80" class="TEXTAREA_STYLE1">${mr.engageRequired }</textarea>
					</td>
					 
				</tr>
			</table>
		</form>




	</body>
 
</html>
