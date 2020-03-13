<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>编辑角色</title>
		<link rel="stylesheet"
			href="css/table.css" type="text/css"/>
		<script type="text/javascript" src="javascript/jquery-1.7.2.js"></script>
		<script type="text/javascript" src="javascript/right_list_information.js"></script>
		<style type="text/css">
			.parent {
				margin-left: 50px;
			}
			.children {
				margin-left: 20%;
			}
		</style>
	</head>
	<body>
		<form id="powerAction!doModifyRight" name="powerAction!doModifyRight" action="updateUserRole" method="post">
			<table width="100%">
				<tr>
					<td>
						<font color="black">您正在做的业务是：人力资源--权限管理--编辑角色</font>
					</td>
				</tr>
				<tr>
					<td align="right">
						<input type="submit" id="powerAction!doModifyRight_0" value="&#20445;&#23384;" class="BUTTON_STYLE1"/>

						<input type="button" value="返回" class="BUTTON_STYLE1"
							onclick="history.back()">
					</td>
				</tr>
			</table>
			<table width="100%" border="1" cellpadding=3 cellspacing=1
				bordercolorlight=#848284 bordercolordark=#eeeeee
				class="TABLE_STYLE1">
				<tr>
					<td class="TD_STYLE1">角色编号</td>
					<td class="TD_STYLE2">${userrole.user_role_id}</td>
					<td class="TD_STYLE1">角色名称</td>
					<td class="TD_STYLE2">
						<input type="text" class="INPUT_STYLE2" value="${userrole.user_role_name }"
							name="user_role_name"/>
						<input type="hidden" name="user_role_id" value="${userrole.user_role_id }"/>
						<input type="hidden" name="user_role_qid" value="${userrole.user_role_id }"/>
					</td>
				</tr>
				<tr>
					<td class="TD_STYLE1">角色说明</td>
					<td class="TD_STYLE2">
						<input type="text" class="INPUT_STYLE2" value="${userrole.user_role_explain }"
							name="user_role_explain"/>
					</td>
					<td class="TD_STYLE1">角色是否可用</td>
					<td class="TD_STYLE2">
						<select name="user_role_chose" id="powerAction!doModifyRight_sysRole_roleFlag">
							<c:if test="${userrole.user_role_chose == '否'}"> 
								 <option  selected="selected" >否</option>
							</c:if> 
							<c:if test="${userrole.user_role_chose == '是'}">
							 <option  selected="selected" >是</option>
							</c:if> 
						</select>
					</td>
				</tr>
			</table>
			<hr/>
			<!-- 招聘管理 -->
				<table class="grandfather">
					<tr>
					
						<td>
						<input type="hidden" name="roleqxid" value="0" id="0" class="grandfather_ck" checked="checked"/>
							<input type="checkbox" name="roleqxid" value="1" id="1" class="grandfather_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L01" /> 
							&#25307;&#32856;&#31649;&#29702;
							<table class="parent">
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="101" id="101" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0101" /> 
												&#32844;&#20301;&#21457;&#24067;&#31649;&#29702;
												<table class="children">
													<tr>
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="10101" id="10101" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L010101" /> 
																	&#32844;&#20301;&#21457;&#24067;&#30331;&#35760;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="10102" id="10102" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L010102" /> 
																	&#32844;&#20301;&#21457;&#24067;&#21464;&#26356;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="10103" id="10103" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L010103" /> 
																	&#32844;&#20301;&#21457;&#24067;&#26597;&#35810;
																</td>
															
														
															
														
															
														
		
													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="102" id="102" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0102" /> 
												&#31616;&#21382;&#31649;&#29702;
												<table class="children">
													<tr>
														
															
														
															
														
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="10201" id="10201" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L010201" /> 
																	&#31616;&#21382;&#30331;&#35760;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="10202" id="10202" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L010202" /> 
																	&#31616;&#21382;&#31579;&#36873;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="10203" id="10203" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L010203" /> 
																	&#26377;&#25928;&#31616;&#21382;&#26597;&#35810;
																</td>
															
														
															
							
																				
														
													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="103" id="103" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0103" /> 
												&#38754;&#35797;&#31649;&#29702;
												<table class="children">
													<tr>
														
															
														
															
														
															
														
															
														
															
														
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="10301" id="10301" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L010301" /> 
																	&#38754;&#35797;&#32467;&#26524;&#30331;&#35760;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="10302" id="10302" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L010302" /> 
																	&#38754;&#35797;&#31579;&#36873;
																</td>
															
														
				

													</tr>
												</table>
											</td>
										</tr>
									
								
					
														
															
	
														
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="104" id="104" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0106" /> 
												&#24405;&#29992;&#31649;&#29702;
												<table class="children">
													<tr>
														
															
													
																<td>
																	<input type="checkbox" name="roleqxid" value="10401" id="10401" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L010601" /> 
																	&#24405;&#29992;&#30003;&#35831;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="10402" id="10402" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L010602" /> 
																	&#24405;&#29992;&#23457;&#25209;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="10403" id="10403" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L010603" /> 
																	&#24405;&#29992;&#26597;&#35810;
																</td>
															
														
															
														
															
														
															
														
															
														
															
														
															
				
													</tr>
												</table>
											</td>
										</tr>
									
							</table>
						</td>
					</tr>
				</table>
				<hr/>
	
	
	
	
	
	
	
	
	
	<!-- 人力资源档案 -->
	
				<table class="grandfather">
					<tr>
						<td>
							<input type="checkbox" name="roleqxid" value="2" id="2" class="grandfather_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L02" /> 
							&#20154;&#21147;&#36164;&#28304;&#26723;&#26696;&#31649;&#29702;
							<table class="parent">
								
									
								
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="201" id="201" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0201" /> 
												&#20154;&#21147;&#36164;&#28304;&#26723;&#26696;&#30331;&#35760;
												<table class="children">
													<tr>
														
															
							
													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="202" id="202" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0202" /> 
												&#20154;&#21147;&#36164;&#28304;&#26723;&#26696;&#30331;&#35760;&#22797;&#26680;
												<table class="children">
													<tr>
														
															
														
															
														
																
													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="203" id="203" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0203" /> 
												&#20154;&#21147;&#36164;&#28304;&#26723;&#26696;&#26597;&#35810;
												<table class="children">
													<tr>
														
	
														
													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="204" id="204" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0204" /> 
												&#20154;&#21147;&#36164;&#28304;&#26723;&#26696;&#21464;&#26356;
												<table class="children">
													<tr>
														
															
														
															
														
															
												
													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="205" id="205" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0205" /> 
												&#20154;&#21147;&#36164;&#28304;&#26723;&#26696;&#21024;&#38500;&#31649;&#29702;
												<table class="children">
													<tr>
														
															
														
															
														
															

															
																<td>
																	<input type="checkbox" name="roleqxid" value="20501" id="20501" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L020501" /> 
																	&#20154;&#21147;&#36164;&#28304;&#26723;&#26696;&#21024;&#38500;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="20502" id="20502" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L020502" /> 
																	&#26723;&#26696;&#21024;&#38500;&#24674;&#22797;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="20503" id="20503" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L020503" /> 
																	&#20154;&#21147;&#36164;&#28304;&#26723;&#26696;&#27704;&#20037;&#21024;&#38500;
																</td>
															
														
															
														

														
													</tr>
												</table>
											</td>
										</tr>
									
								
									
								
		
								
							</table>
						</td>
					</tr>
				</table>
				<hr/>
			
			
			
			
			
			
			<!-- 薪酬标准 -->
				<table class="grandfather">
					<tr>
						<td>
							<input type="checkbox" name="roleqxid" value="3" id="3" class="grandfather_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L03" /> 
							&#34218;&#37228;&#26631;&#20934;&#31649;&#29702;
							<table class="parent">
								
									
								
									
								
									

										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="301" id="301" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0301" /> 
												&#34218;&#37228;&#26631;&#20934;&#30331;&#35760;
												<table class="children">
													<tr>
														
															
														
															
	
													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="302" id="302" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0302" /> 
												&#34218;&#37228;&#26631;&#20934;&#30331;&#35760;&#22797;&#26680;
												<table class="children">
													<tr>
														
															
														
															
	
													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="303" id="303" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0303" /> 
												&#34218;&#37228;&#26631;&#20934;&#26597;&#35810;
												<table class="children">
													<tr>
														
															
														
															
						
														
													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="304" id="304" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0304" /> 
												&#34218;&#37228;&#26631;&#20934;&#21464;&#26356;
												<table class="children">
													<tr>
														
																
													</tr>
												</table>
											</td>
										</tr>
									
									
								
							</table>
						</td>
					</tr>
				</table>
				<hr/>
			
			
			
			
			
			
			
			
			<!-- 薪酬发放管理 -->
				<table class="grandfather">
					<tr>
						<td>
							<input type="checkbox" name="roleqxid" value="4" id="4" class="grandfather_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L04" /> 
							&#34218;&#37228;&#21457;&#25918;&#31649;&#29702;
							<table class="parent">
								
									
								
									
								
									
								
									
								
									
								
									

										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="401" id="401" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0401" /> 
												&#34218;&#37228;&#21457;&#25918;&#30331;&#35760;
												<table class="children">
													<tr>
														
															
														
															
														
											
									

													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="402" id="402" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0402" /> 
												&#34218;&#37228;&#21457;&#25918;&#30331;&#35760;&#22797;&#26680;
												<table class="children">
													<tr>
														
															
														
									

													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="403" id="403" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0403" /> 
												&#34218;&#37228;&#21457;&#25918;&#26597;&#35810;
												<table class="children">
													<tr>
														
															
														
															
														
															
														
	
														
													</tr>
												</table>
											</td>
										</tr>
									
								
									
								
									

							</table>
						</td>
					</tr>
				</table>
				<hr/>
			
			
			
			<!-- 客户化设置 -->
				<table class="grandfather">
					<tr>
						<td>
							<input type="checkbox" name="roleqxid" value="6" id="6" class="grandfather_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L06" /> 
							&#23458;&#25143;&#21270;&#35774;&#32622;
							<table class="parent">
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="601" id="601" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0601" /> 
												&#20154;&#21147;&#36164;&#28304;&#26723;&#26696;&#31649;&#29702;&#35774;&#32622;
												<table class="children">
													<tr>
														
															
														
															
	
																<td>
																	<input type="checkbox" name="roleqxid" value="60101" id="60101" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L060101" /> 
																	&#8544;&#32423;&#26426;&#26500;&#35774;&#32622;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="60102" id="60102" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L060102" /> 
																	&#8545;&#32423;&#26426;&#26500;&#35774;&#32622;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="60103" id="60103" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L060103" /> 
																	&#8546;&#32423;&#26426;&#26500;&#35774;&#32622;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="60104" id="60104" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L060104" /> 
																	&#32844;&#31216;&#35774;&#32622;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="60105" id="60105" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L060105" /> 
																	&#32844;&#20301;&#20998;&#31867;&#35774;&#32622;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="60106" id="60106" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L060106" /> 
																	&#32844;&#20301;&#35774;&#32622;
																</td>
															
														
															
																<td>
																	<input type="checkbox" name="roleqxid" value="60107" id="60107" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L060107" /> 
																	&#20844;&#20849;&#23646;&#24615;&#35774;&#32622;
																</td>	
														
													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="602" id="602" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0602" /> 
												&#34218;&#37228;&#31649;&#29702;&#35774;&#32622;
												<table class="children">
													<tr>
														
															
															
																<td>
																	<input type="checkbox" name="roleqxid" value="60201" id="60201" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L060201" /> 
																	&#34218;&#37228;&#39033;&#30446;&#35774;&#32622;
																</td>
														
															
														
													</tr>
												</table>
											</td>
										</tr>
			<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="604" id="604" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0604" /> 
												              邮箱管理设置
												<table class="children">
													<tr>
														
															
	
																<td>
																	<input type="checkbox" name="roleqxid" value="60401" id="60401" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L060401" /> 
																	邮件设置
																</td>
															
														
</tr>
												</table>
											</td>
										</tr>
																	
		<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="603" id="603" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0604" /> 
												           其他设置
												<table class="children">
													<tr>
														
															
	
																<td>
																	<input type="checkbox" name="roleqxid" value="60301" id="60301" class="children_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L060401" /> 
																	关键字查询设置
																</td>
															
														
													</tr>
								
								
									
	
							</table>
						</td>
					</tr>
				</table>
				<hr/>
											</td>
										</tr>
									
			<!-- 权限管理 -->
				<table class="grandfather">
					<tr>
						<td>
							<input type="checkbox" name="roleqxid" value="8" id="8" class="grandfather_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L08" /> 
							&#26435;&#38480;&#31649;&#29702;
							<table class="parent">
								
									
								

										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="801" id="801" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0801" /> 
												&#29992;&#25143;&#31649;&#29702;
												<table class="children">
													<tr>
														
															
														

													</tr>
												</table>
											</td>
										</tr>
									
								
									
										<tr>
											<td>
												<input type="checkbox" name="roleqxid" value="802" id="802" class="parent_ck"/>
<input type="hidden" id="__checkbox_powerAction!doModifyRight_rightCodes" name="__checkbox_rightCodes" value="L0802" /> 
												&#35282;&#33394;&#31649;&#29702;
												<table class="children">
													<tr>
														
															

													</tr>
												</table>
								
							</table>
						</td>
					</tr>
				</table>
				<hr/>
			
		</form>
<c:forEach items="${qxidList}" var="qx">
<input value="${qx }" type="hidden" name="qxids"></input>
</c:forEach>
	</body>
     <script type="text/javascript">
     function byDefault(){
         var pageQxidArr=new Array(
            1,101,10101,10102,10103,102,10201,10202,10203,
              103,10301,10302,
              104,10401,10402,10403,
            2,201,202,202,203,204,205,20501,20502,20503,
            3,301,302,303,304,
            4,401,402,403,
            6,601,60101,60102,60103,60104,60105,60106,60107,
              602,60201,
              603,60301,
              604,60401,
            8,801,802);
         
		 
         var qxidArr=document.getElementsByName("qxids");
         for(var i=0;i<qxidArr.length; i++){
             var qxid=qxidArr[i].value;
             var b=false;
             for(var j=0;j<pageQxidArr.length; j++){
                 if(qxid==pageQxidArr[j]){
                     b=true;
                 }
             }
             if(b){
                 document.getElementById(qxid).checked=true;
             }
         }
                 
     }
     window.onload=byDefault;
     </script>
	
	
	
	
	
</html>