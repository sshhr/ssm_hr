<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link rel="stylesheet"
			href="/ssm_hr/page/css/table.css" type="text/css">
		<link rel="stylesheet"
			href="/ssm_hr/page/css/cwcalendar.css" type="text/css">
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/comm/comm.js">
		</script>
		<script language="javascript"
			src="/ssm_hr/page/javascript/winopen/winopenm.js">
		</script>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/calendar-ch.js">
		</script>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/jquery-1.7.2.js">
		</script>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/jquery.messager.js">
		</script>
		<script src="/ssm_hr/page/javascript/time.js"></script>
		<script type="text/javascript"
			src="/ssm_hr/page/javascript/human_check.js">
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

		<form action="/ssm_hr/humanresources/humanFileCheckPass.do" method="post" enctype="multipart/form-data">
				<input  name="salaryStandardName" type="hidden" id="salarystandardName">
				 <input  name="humanId" type="hidden" value="${human.humanId}">
		        <input  name="hufId" type="hidden" value="${human.hufId}">
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
						<input type="button" value="返回" class="BUTTON_STYLE1" onclick="history.back()">
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
						${human.humanId}
					</td>
					<td rowspan="6" width="13%" style="text-align: center;">
						<img src=""  style="width:120px;height:150px;"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1" width="10%">
						I级机构
					</td>
					<td width="13%" class="TD_STYLE2">
					<input  name="firstKindName" type="hidden" value="${human.firstKindName }">
					<input  name="firstKindId" type="hidden" value="${human.firstKindId }">
						${human.firstKindName }
					</td>
					<td width="10%" class="TD_STYLE1">
						II级机构
					</td>
					<td width="13%" class="TD_STYLE2">
					<input  name="secondKindName" type="hidden" value="${human.secondKindName }">
					<input  name="secondKindId" type="hidden" value="${human.secondKindId }">
						${human.secondKindName }
					</td>
					<td width="10%" class="TD_STYLE1">
						III级机构
					</td>
					<td class="TD_STYLE2" colspan="2" width="2%">
					<input  name="thirdKindName" type="hidden" value="${human.thirdKindName }">
					<input  name="thirdKindId" type="hidden" value="${human.thirdKindId }">
						${human.thirdKindName }
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						职位分类
					</td>
					<td class="TD_STYLE2">
					<input  name="humanMajorKindName" type="hidden" value="${human.humanMajorKindName }">
					<input  name="humanMajorKindId" type="hidden" value="${human.humanMajorKindId }">
						${human.humanMajorKindName }
					</td>
					<td class="TD_STYLE1">
						职位名称
					</td>
					<td class="TD_STYLE2">
					<input  name="hunmaMajorName" type="hidden" value="${human.hunmaMajorName }">
					<input  name="humanMajorId" type="hidden" value="${human.humanMajorId }">
						${human.hunmaMajorName }
					</td>
					<td class="TD_STYLE1">
						职称
					</td>
					<td colspan="2" class="TD_STYLE2">
						<select class="SELECT_STYLE1" name="humanProDesignation">
							
					<c:forEach items="${zclist}" var="c">
						<c:if test="${c == human.humanProDesignation}">
							<option value="${c }" selected="selected">
								${c}
							</option>
						</c:if>
						<c:if test="${c != human.humanProDesignation}">
							<option value="${c }" >
								${c}
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
						<input type="text" id="humanName" name="humanName" value="${human.humanName }"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						性别
					</td>
					<td class="TD_STYLE2">
						<select class="SELECT_STYLE1" name="humanSex">
						<c:if test="${human.humanSex == '男'}">
							<option value="男"selected="selected">男</option>  
						</c:if>
						<c:if test="${human.humanSex == '女'}">
							<option value="男"selected="selected">女</option>  
						</c:if>
						</select>
					</td>
					<td class="TD_STYLE1">
						EMAIL
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanEmail" value="${human.humanEmail }"
							class="INPUT_STYLE2" id="humanEmail">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						电话
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanTelephone" value="${human.humanTelephone}"
							class="INPUT_STYLE2" id="0">
					</td>
					<td class="TD_STYLE1">
						QQ
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanQq" value="${human.humanQq }"
							class="INPUT_STYLE2" id="humanQq">
					</td>
					<td class="TD_STYLE1">
						手机
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanMobilephone" id="humanMobilephone"
							value="${human.humanMobilephone }" class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						住址
					</td>
					<td colspan="3" class="TD_STYLE2">
						<input type="text" name="humanAddress" value="${human.humanAddress }"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						邮编
					</td>
					<td colspan="2" class="TD_STYLE2">
						<input type="text" name="humanPostcode" value="${human.humanPostcode }"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						国籍
					</td>
					<td class="TD_STYLE2">
						<select name="humanNationality" class="SELECT_STYLE1" >
						<c:forEach items="${glist}" var="g">
							<c:if test="${g == human.humanNationality }">
								<option value="${g}" selected="selected">
									${g}
								</option>
							</c:if>
							<c:if test="${g != human.humanNationality }">
								<option value="${g}">
									${g}
								</option>
							</c:if>
							
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						出生地
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanBirthplace" value="${human.humanBirthplace }"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						生日
					</td>
					<td width="13%" class="TD_STYLE2">
						<input type="text" name="humanBirthday" readonly="readonly"
							value="${human.humanBirthday }" class="INPUT_STYLE2" id="birthday">
					</td>
					<td width="10%" class="TD_STYLE1">
						民族
					</td>
					<td class="TD_STYLE2">
						<select name="humanRace" class="SELECT_STYLE1" >
						<c:forEach items="${mlist}" var="m1">
							<c:if test="${m1 == human.humanRace }">
								<option value="${m1}" selected="selected">
								${m1}
							</option>
							</c:if>
							<c:if test="${m1 != human.humanRace }">
								<option value="${m1}" >
								${m1}
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
						<select name="humanReligion" class="SELECT_STYLE1" >
						<c:forEach items="${zlist}" var="z1">
							<c:if test="${z1 == human.humanReligion }">
								<option value="${z1}" selected="selected">${z1}</option>
							</c:if>
							<c:if test="${z1 != human.humanReligion }">
								<option value="${z1}">${z1}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						政治面貌
					</td>
					<td class="TD_STYLE2">
						<select name="humanParty" class="SELECT_STYLE1" >
						<c:forEach items="${zzlist}" var="z">
							<c:if test="${z == human.humanParty }">
								<option value="${z}" selected="selected">${z}</option>
							</c:if>
							<c:if test="${z != human.humanParty }">
								<option value="${z}" >${z}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						身份证号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanIdCard" id="humanIdCard"
							value=" ${human.humanIdCard }" class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						社会保障号码
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanSocietySecurityId" value="${human.humanSocietySecurityId }"
							class="INPUT_STYLE2">
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						年龄
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanAge" value="${human.humanAge }"
							class="INPUT_STYLE2" id="humanAge">
					</td>
					<td class="TD_STYLE1">
						学历
					</td>
					<td class="TD_STYLE2">
						<select name="humanEducatedDegree" class="SELECT_STYLE1" >
						<c:forEach items="${xlist}" var="x">
							<c:if test="${x == human.humanEducatedDegree }">
								<option value="${x}" selected="selected">${x}</option>
							</c:if>
							<c:if test="${x != human.humanEducatedDegree }">
								<option value="${x}" >${x}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						教育年限
					</td>
					<td class="TD_STYLE2">
						<select name="humanEducatedYears" class="SELECT_STYLE1" >
						<c:forEach items="${jlist}" var="j">
							<c:if test="${j == human.humanEducatedYears }">
								<option value="${j}"  selected="selected">${j}</option>
							</c:if>
							<c:if test="${j != human.humanEducatedYears }">
								<option value="${j}" >${j}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						学历专业
					</td>
					<td class="TD_STYLE2">
						<select name="humanEducatedMajor" class="SELECT_STYLE1" >
						<c:forEach items="${xlzylist}" var="x1">
							<c:if test="${x1 == human.humanEducatedMajor }">
								<option value="${x1}" selected="selected">${x1}</option>
							</c:if>
							<c:if test="${x1 != human.humanEducatedMajor }">
								<option value="${x1}" >${x1}</option>
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
					
						<select name="salaryStandardId" class="SELECT_STYLE1" id="salarystandard" onchange="getsalaryname()">
						<c:forEach items="${xclist}" var="s">
							<c:if test="${s.ssdId == human.salaryStandardId }">
								<option id="salary_${s.ssdId}"  value="${s.ssdId}" selected="selected">${s.standardName}</option>
							</c:if>
							<c:if test="${s.ssdId != human.salaryStandardId }">
								<option id="salary_${s.ssdId}"  value="${s.ssdId}" >${s.standardName}</option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						开户行
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanBank" value="${human.humanBank }"
							class="INPUT_STYLE2">
					</td>
					<td class="TD_STYLE1">
						帐号
					</td>
					<td class="TD_STYLE2">
						<input type="text" name="humanAccount"
							value="${human.humanAccount }" class="INPUT_STYLE2">
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
						<input type="text" name="checkTime"
							id="create_time" readonly="readonly"
							class="INPUT_STYLE2" value="${human.checkTime }">
					</td>
					<td class="TD_STYLE1">
						特长
					</td>
					<td class="TD_STYLE2">
						<select name="humanSpeciality" class="SELECT_STYLE1" >
						<c:forEach items="${tlist}" var="t">
							<c:if test="${t == human.humanSpeciality}">
								<option value="${t}" selected="selected">${t} </option>
							</c:if>
							<c:if test="${t != human.humanSpeciality}">
								<option value="${t}"  >${t} </option>
							</c:if>
						</c:forEach>
						</select>
					</td>
					<td class="TD_STYLE1">
						爱好
					</td>
					<td class="TD_STYLE2">
						<select name="humanHobby" class="SELECT_STYLE1" >
						<c:forEach items="${alist}" var="a">
							<c:if test="${a == human.humanHobby}">
								<option value="${a}" selected="selected">${a}</option>
							</c:if>
							<c:if test="${a != human.humanHobby}">
								<option value="${a}" >${a}</option>
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
						<a href="javascript:winopenm('query.jsp?filename=')">${human.attachmentName}</a>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						个人履历
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanHistroyRecords" rows="4"
							class="TEXTAREA_STYLE1">${human.humanHistroyRecords }</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						家庭关系信息
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="humanFamilyMembership" rows="4"
							class="TEXTAREA_STYLE1">${human.humanFamilyMembership }</textarea>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">
						备注
					</td>
					<td colspan="7" class="TD_STYLE2">
						<textarea name="remark" rows="4" class="TEXTAREA_STYLE1">${human.remark }</textarea>
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>