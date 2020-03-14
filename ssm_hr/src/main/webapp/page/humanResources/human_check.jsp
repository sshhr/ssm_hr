<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="../css/table.css" type="text/css">
		<link rel="stylesheet"
			href="css/cwcalendar.css" type="text/css">
		<script type="text/javascript"
			src="javascript/comm/comm.js">
		</script>
		<script language="javascript"
			src="javascript/winopen/winopenm.js">
		</script>
		<script type="text/javascript"
			src="javascript/calendar-ch.js">
		</script>
		<script type="text/javascript"
			src="javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="javascript/jquery.messager.js">
		</script>
		<script src="javascript/time.js"></script>
		<script type="text/javascript"
			src="javascript/human_check.js">
		</script>
		
		<script type="text/javascript">
		function getsalaryname(){
 	 		var sid=$("#salarystandard").val();
 			var majorname=$("#salary_"+sid).html();
 			$("#salarystandardName").val(majorname);
 	 		}
	 		
 		</script> 
	</head>
	<body>

		<form action="update_human" method="post" enctype="multipart/form-data">
				<input  name="salarystandardname" type="hidden" id="salarystandardName">
		        <input  name="humanid" type="hidden" value="${hf.humanid}">
			<table width="100%">
			
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--人力资源档案管理--人力资源档案复核 </font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" value="复核通过" class="BUTTON_STYLE1"/>
						<input type="reset" value="清除" class="BUTTON_STYLE1">
						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back()">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=3 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1" width="10%">
						档案编号
					</td>
					<td colspan="6" class="TD_STYLE2">
						${hf.humanid}
					</td>
					<td rowspan="6" width="13%" style="text-align: center;">
						<img src="images/${hf.humanpicture}"  style="width:120px;height:150px;"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="10%">
						I级机构
					</td>
					<td width="13%" class="TD_STYLE2">
					<input  name="firstkindname" type="hidden" value="${hf.firstkindname }">
					<input  name="firstkindid" type="hidden" value="${hf.firstkindid }">
						${hf.firstkindname }
					</td>
					<td width="10%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="13%" class="TD_STYLE2">
					<input  name="secondkindname" type="hidden" value="${hf.secondkindname }">
					<input  name="secondkindid" type="hidden" value="${hf.secondkindid }">
						${hf.secondkindname }
					</td>
					<td width="10%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2" width="2%">
					<input  name="thirdkindname" type="hidden" value="${hf.thirdkindname }">
					<input  name="thirdkindid" type="hidden" value="${hf.thirdkindid }">
						${hf.thirdkindname }
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
					<input  name="humanmajorkindname" type="hidden" value="${hf.humanmajorkindname }">
					<input  name="humanmajorkindid" type="hidden" value="${hf.humanmajorkindid }">
						${hf.humanmajorkindname }
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
					<input  name="humanmajorname" type="hidden" value="${hf.humanmajorname }">
					<input  name="humanmajorid" type="hidden" value="${hf.humanmajorid }">
						${hf.humanmajorname }
					</td>
					<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<select class="SELECT_STYLE1" name="humanprodesignation">
							
					<c:forEach items="${clist}" var="c">
						<c:if test="${c.attributename == hf.humanprodesignation}">
							<option value="${c.attributename }" selected="selected">
								${c.attributename}
							</option>
						</c:if>
						<c:if test="${c.attributename != hf.humanprodesignation}">
							<option value="${c.attributename }" >
								${c.attributename}
							</option>
						</c:if>
						
			        </c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						姓名
					</td>
					<td class="TD_STYLE2">
						<input type="text" id="humanName" name="humanname" value="${hf.humanname }"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select class="SELECT_STYLE1" name="humansex">
						<c:if test="${hf.humansex == '男'}">
							<option value="男"selected="selected">男</option>  
						</c:if>
						<c:if test="${hf.humansex == '女'}">
							<option value="男"selected="selected">女</option>  
						</c:if>
						</select>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanemail" value="${hf.humanemail }"
							class="INPUT_STYLE2" id="humanEmail">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humantelephone" value="${hf.humantelephone}"
							class="INPUT_STYLE2" id="0">
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanqq" value="${hf.humanqq }"
							class="INPUT_STYLE2" id="humanQq">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanmobilephone" id="humanMobilephone"
							value="${hf.humanmobilephone }" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="humanaddress" value="${hf.humanaddress }"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanpostcode" value="${hf.humanpostcode }"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<select name="humannationality" class="SELECT_STYLE1" >
						<c:forEach items="${glist}" var="g">
							<c:if test="${g.attributename == hf.humannationality }">
								<option value="${g.attributename}" selected="selected">
									${g.attributename}
								</option>
							</c:if>
							<c:if test="${g.attributename != hf.humannationality }">
								<option value="${g.attributename}">
									${g.attributename}
								</option>
							</c:if>
							
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanbirthplace" value="${hf.humanbirthplace }"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<input type="text" name="humanbirthday" readonly="readonly"
							value="${hf.humanbirthday }" class="INPUT_STYLE2" id="birthday">
					</td>
					<td width="10%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2">
						<select name="humanrace" class="SELECT_STYLE1" >
						<c:forEach items="${mlist}" var="m1">
							<c:if test="${m1.attributename == hf.humanrace }">
								<option value="${m1.attributename}" selected="selected">
								${m1.attributename}
							</option>
							</c:if>
							<c:if test="${m1.attributename != hf.humanrace }">
								<option value="${m1.attributename}" >
								${m1.attributename}
							</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						宗教信仰
					</td>
					<td class="TD_STYLE2">
						<select name="humanreligion" class="SELECT_STYLE1" >
						<c:forEach items="${zlist}" var="z1">
							<c:if test="${z1.attributename == hf.humanreligion }">
								<option value="${z1.attributename}" selected="selected">${z1.attributename}</option>
							</c:if>
							<c:if test="${z1.attributename != hf.humanreligion }">
								<option value="${z1.attributename}">${z1.attributename}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2">
						<select name="humanparty" class="SELECT_STYLE1" >
						<c:forEach items="${zzlist}" var="z">
							<c:if test="${z.attributename == hf.humanparty }">
								<option value="${z.attributename}" selected="selected">${z.attributename}</option>
							</c:if>
							<c:if test="${z.attributename != hf.humanparty }">
								<option value="${z.attributename}" >${z.attributename}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanidcard" id="humanIdCard"
							value="${hf.humanidcard }" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humansocietysecurityid" value="${hf.humansocietysecurityid }"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanage" value="${hf.humanage }"
							class="INPUT_STYLE2" id="humanAge">
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<select name="humaneducateddegree" class="SELECT_STYLE1" >
						<c:forEach items="${xlist}" var="x">
							<c:if test="${x.attributename == hf.humaneducateddegree }">
								<option value="${x.attributename}" selected="selected">${x.attributename}</option>
							</c:if>
							<c:if test="${x.attributename != hf.humaneducateddegree }">
								<option value="${x.attributename}" >${x.attributename}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<select name="humaneducatedyears" class="SELECT_STYLE1" >
						<c:forEach items="${jlist}" var="j">
							<c:if test="${j.attributename == hf.humaneducatedyears }">
								<option value="${j.attributename}"  selected="selected">${j.attributename}</option>
							</c:if>
							<c:if test="${j.attributename != hf.humaneducatedyears }">
								<option value="${j.attributename}" >${j.attributename}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<select name="humaneducatedmajor" class="SELECT_STYLE1" >
						<c:forEach items="${xlzylist}" var="x1">
							<c:if test="${x1.attributename == hf.humaneducatedmajor }">
								<option value="${x1.attributename}" selected="selected">${x1.attributename}</option>
							</c:if>
							<c:if test="${x1.attributename != hf.humaneducatedmajor }">
								<option value="${x1.attributename}" >${x1.attributename}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" >
						薪酬标准
					</td>
					<td class="TD_STYLE2" >
					
						<select name="salarystandardid" class="SELECT_STYLE1" id="salarystandard" onchange="getsalaryname()">
						<c:forEach items="${slist}" var="s">
							<c:if test="${s.sstid == hf.salarystandardid }">
								<option id="salary_${s.sstid}"  value="${s.sstid}" selected="selected">${s.sname}</option>
							</c:if>
							<c:if test="${s.sstid == hf.salarystandardid }">
								<option id="salary_${s.sstid}"  value="${s.sstid}" >${s.sname}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						开户行
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanbank" value="${hf.humanbank }"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanaccount"
							value="${hf.humanaccount }" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						复核人
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="checker" value="${userlogin.user_true_name}"
							readonly="readonly" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						复核时间
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="checktime"
							id="create_time" readonly="readonly"
							class="INPUT_STYLE2" value="${hf.checktime }">
					</td>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<select name="humanspeciality" class="SELECT_STYLE1" >
						<c:forEach items="${tlist}" var="t">
							<c:if test="${t.attributename == hr.humanspeciality}">
								<option value="${t.attributename}" selected="selected">${t.attributename} </option>
							</c:if>
							<c:if test="${t.attributename != hr.humanspeciality}">
								<option value="${t.attributename}"  >${t.attributename} </option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<select name="humanhobby" class="SELECT_STYLE1" >
						<c:forEach items="${alist}" var="a">
							<c:if test="${a.attributename == hr.humanhobby}">
								<option value="${a.attributename}" selected="selected">${a.attributename}</option>
							</c:if>
							<c:if test="${a.attributename != hr.humanhobby}">
								<option value="${a.attributename}" >${a.attributename}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						&nbsp;
					</td>
					<td class="TD_STYLE2">
						&nbsp;
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						档案附件
					</td>
					<td colspan="7" class="TD_STYLE2">
						<a href="javascript:winopenm('query.jsp?filename=')">${hf.attachmentname}</a>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanhistroyrecords" rows="4"
							class="TEXTAREA_STYLE1">${hf.humanhistroyrecords }</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						家庭关系信息
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanfamilymembership" rows="4"
							class="TEXTAREA_STYLE1">${hf.humanfamilymembership }</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="remark" rows="4" class="TEXTAREA_STYLE1">${hf.remark }</textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>