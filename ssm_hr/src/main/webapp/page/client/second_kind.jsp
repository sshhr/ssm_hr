<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet" href="/ssm_hr/page/css/table.css"
			type="text/css"></link>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/comm/comm.js">
		</script>
		
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/jquery-1.7.2.js">
		</script>
	<script type="text/javascript">
		function ajax(fid){
		$.ajax({
			url:'deletesecond?sid='+fid,
			type:'get',
			success:function(){
				$('#'+fid).remove();
			}
		});
	}
	</script>
	</head>

<script type="text/javascript">
	
		function submission(){
			document.forms[0].submit();
		}
		
		function page(currentPage){
			document.getElementById("pid").value=currentPage;
			document.forms[0].submit();
		}
</script>
	


	<body>
	<form action="../customiz/customizAction!findSecondKind" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--客户化设置--人力资源档案管理设置--II级机构设置
						</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="button" value="添加" class="BUTTON_STYLE1"
							onclick="window.location.href='toaddSecondKind'" />
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td width="15%" class="TD_STYLE1">
						I级机构名称
					</td>
					<td width="15%" class="TD_STYLE1">
						II级机构编号
					</td>
					<td width="15%" class="TD_STYLE1">
						II级机构名称
					</td>
					<td width="22%" class="TD_STYLE1">
						薪酬发放责任人编号
					</td>
					<td width="22%" class="TD_STYLE1">
						销售责任人编号
					</td>
					<td width="5%" class="TD_STYLE1">
						变更
					</td>
					<td width="5%" class="TD_STYLE1">
						删除
					</td>
				</tr>
					<c:forEach items="${slist}" var="s">
					
					<tr id="${s.firstkindname } ">
						<td class="TD_STYLE2">
						      ${s.firstkindname }
						</td>
						<td class="TD_STYLE2">
						      ${s.secondkindid }
						</td>
						<td class="TD_STYLE2">
						      ${s.secondkindname }
						</td>
						<td class="TD_STYLE2">
						      ${s.secondsalaryid }
						</td>
						<td class="TD_STYLE2">
						${s.secondsaleid}
						</td>
						<td class="TD_STYLE2">
							<a href="queryByIdsecond?sid=${s.fskid }">变更</a>
						</td>
						<td class="TD_STYLE2">
							<a href="javascript:ajax(${s.firstkindname })">删除</a>
						</td>
					</tr>
					</c:forEach>
			
					
			</table>
			<br><br>
		<th colspan="7" class="pager">
		 	</th>
		<p>
		</form>
	</body>
</html>