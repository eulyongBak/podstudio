<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<form id="signUpForm">
	<div>
		<label>ȸ����ȣ : </label> <input type="text" name="userNo" />
	</div>
	<div>
		<label>���� : </label>
		<!-- <input type="text" name="categoryNo" /> -->
		<select name="categoryNo">
			<option value="category_22">����</option>
			<option value="category_23">�λ�</option>
			<option value="category_24">�뱸</option>
			<option value="category_25">��õ</option>
			<option value="category_26">����</option>
			<option value="category_27">����</option>
			<option value="category_28">���</option>
			<option value="category_29">����</option>
			<option value="category_30">���</option>
			<option value="category_31">����</option>
			<option value="category_32">���</option>
			<option value="category_33">�泲</option>
			<option value="category_34">����</option>
			<option value="category_35">����</option>
			<option value="category_36">���</option>
			<option value="category_37">�泲</option>
			<option value="category_38">����</option>
		</select>
	</div>
	<div>
		<label>���̵� : </label> <input type="text" name="userId" />
	</div>
	<div>
		<label>��й�ȣ</label> <input type="password" name="userPw" />
	</div>
	<div>
		<label>�г��� : </label> <input type="text" name="userNickname" />
	</div>
	<div>
		<label>���� : </label>
		<input id="dateText" type="date" name="userBirth" />
	</div>
	<div>
		<label>���� : </label> 
		<input type="radio" name="userGender" value="��" />��
		<input type="radio" name="userGender" value="��" />��
	</div>
	<div>
		<label>�̸��� : </label>
		<input id="userEmail" type="hidden" name="userEmail" /> 
		<input id="emailMain" type="text" />
		@
		<input id="emailSub" type="text" readonly="readonly"/>
		<select id="subEmail" >
			<option value=" ">�����ϼ���</option>
			<option value="naver.com">naver.com</option>
			<option value="daum.net">daum.net</option>
			<option value="google.com">google.com</option>
			<option value="">�����Է�</option>
		</select>
	</div>
	<div>
		<label>��Ż� : </label> <select name="userTelecom">
			<option value="LG">LG</option>
			<option value="KT">KT</option>
			<option value="SKT">SKT</option>
		</select>

	</div>
	<div>
		<label>��ȭ��ȣ : </label> <input type="text" name="userPhone" />
	</div>
	<div>
		<label>����: </label> <input type="text" name="userLevel" value="�����"
			readonly="readonly" />
	</div>
	<div>
		<label>���� : </label> <input type="text" name="userJob" />
	</div>
	<div>
		<button id="sendSignUp">ȸ������</button>
		<button id="back">�ڷΰ���</button>
	</div>
</form>