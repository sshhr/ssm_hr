$(function() {
	$("form:first").submit(function() {
		var reg = /^[\u4e00-\u9fa5]{2,}$/;
		if (!reg.test($("#roleName").val())) {
			$("#roleName")[0].select();
			$.messager.show("��Ϣ��ʾ", "��ɫ���Ƹ�ʽ����ȷ������Ϊ2�����ϵ����ĺ��֣�", 2000);
			return false;
		}
		return true;
	});
});