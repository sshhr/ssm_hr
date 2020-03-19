<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="/ssm_hr/page/css/table.css" type="text/css"/>
		<script type="text/javascript" src="/ssm_hr/page/javascript/jquery-1.7.2.js"></script>
		<script type="text/javascript">
						function toCheck(id){
							document.forms[0].action = document.forms[0].action + "?operate=toCheck&id=" + id;
							document.forms[0].submit();
		}
		</script>
		<script type="text/javascript">

		function queryHuman(mid) {
		     var id=mid;
			 console.log(id);
			 if(id != 0){
				 window.location.href='/ssm_hr/humanresources/humanFileCheck.do?humanid='+id;
				}
		}
		</script>
	</head>
	<body>
			<form name="humanfileForm" method="post" action="/hr/humanfile.do">
			<table width="100%">
				<tr>
					<td>
						<font color="#0000CC">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案登记复核 </font>
					</td>
				</tr>
				<tr>
					<td>
						当前等待复核的人力资源档案总数：
						${count}
						例
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr class="TR_STYLE1">
					<td width="13%" class="TD_STYLE1">
						档案编号
					</td>
					<td width="13%" class="TD_STYLE1">
						姓名
					</td>
					<td width="11%" class="TD_STYLE1">
						性别
					</td>
					<td width="14%" class="TD_STYLE1">
						I级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						III级机构
					</td>
					<td width="14%" class="TD_STYLE1">
						职称
					</td>
					<td width="7%" class="TD_STYLE1">
						复核
					</td>
				</tr>
				   <c:forEach items="${checklist}" var="check">
				   	<tr>
						<td class="TD_STYLE2">
							${check.humanId }
						</td>
						<td class="TD_STYLE2">
							${check.humanName }
						</td>
						<td class="TD_STYLE2">
							${check.humanSex }
						</td>
						<td class="TD_STYLE2">
							${check.firstKindName }
						</td>
						<td class="TD_STYLE2">
							${check.secondKindName }
						</td>
						<td class="TD_STYLE2">
							${check.thirdKindName }
						</td>
						<td class="TD_STYLE2">
							${check.humanProDesignation }
						</td>
						<td class="TD_STYLE2">
							<a href="#" onclick="queryHuman(${check.humanId })" >复核</a>
						</td>
					</tr>
					</c:forEach>
			</table>
			<p>&nbsp;&nbsp;总数：${count}例 &nbsp;&nbsp;&nbsp;当前第 1 页  &nbsp;&nbsp;&nbsp;共 1 页  &nbsp;&nbsp;&nbsp;跳到第 <input name=page type=text class=input1 size=1> 页&nbsp;&nbsp;<input type=image src="/ssm_hr/page/images/go.bmp" width=18 height=18 border=0>
		</form>
	</body>
</html>