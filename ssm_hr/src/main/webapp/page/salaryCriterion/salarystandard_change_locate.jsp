<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>无标题文档</title>
		<link rel="stylesheet" href="css/table.css" type="text/css">
		<link rel="stylesheet" type="text/css" media="all"
			href="javascript/calendar/calendar-win2k-cold-1.css">
		<script type="text/javascript" src="javascript/calendar/cal.js"></script>
		<script type="text/javascript" src="javascript/comm/comm.js"></script>
		<script type="text/javascript" src="javascript/comm/list.js"></script>
		<script type="text/javascript" src="javascript/jquery-1.7.2.js"></script>	
		<script type="text/javascript" src="javascript/calendar-ch.js"></script>
		<script type="text/javascript" src="javascript/comm/time.js"></script>
		<link rel="stylesheet" href="css/cwcalendar.css" type="text/css"></link> 

	 
	</head>

	<body>
		<form method="post"
		 action="querybzbg" >
			<input type="hidden" name="page.startPage" value="0">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是:人力资源管理--薪酬标准管理--薪酬标准变更</font>
					</td>
				</tr>
				<tr>
					<td>
						<div align="right">
							<input type="submit" value="查询" class="BUTTON_STYLE1"/>
						</div>
					</td>
				</tr>
			</table>
			<table width="100%"   border="1" cellpadding=0 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1" >
				<tr>
					<td width="20%" class="TD_STYLE1">
						请输入薪酬标准编号
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="sstid" value="${sstid}"
							class="INPUT_STYLE1">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请输入关键字
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="sdesigner" value="${sdesigner}" class="INPUT_STYLE1">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						请输入建档时间
					</td>
					<td width="84%" class="TD_STYLE2">
						<input name="srtime1" onclick="aa('srtime1')" type="text" class="INPUT_STYLE2" id="date_start" style="width:24% " value="${srtime }" size="30">
						至 <input type="text" name="srtime2" onclick="aa('srtime2')" value="${srtime }" style="width:24% " class="INPUT_STYLE2" id="date_end">
						（YYYY-MM-DD）
					</td>
				</tr>
			</table>
			 
		</form>
	</body>
</html>
