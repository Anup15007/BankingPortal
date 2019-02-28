function validateLoginForm(){
	if(loginForm.associateId.value==""){
		alert("Enter AssociateId");
		return false;
	}
	else if(loginForm.password.value==""){
		alert("Enter AssociateId")
		return false;
	}
}


function validateRegistrationForm(){
	if(registerForm.firstName.value==""){
		alert("Enter first name");
		return false;
	}
	else if(registerForm.lastName.value==""){
		alert("Enter last name")
		return false;
	}
	else if(registerForm.emailId.value==""){
		alert("Enter emailId")
		return false;
	}
	else if(registerForm.department.value==""){
		alert("Enter department")
		return false;
	}
	else if(registerForm.designation.value==""){
		alert("Enter designation")
		return false;
	}
	else if(registerForm.pancard.value==""){
		alert("Enter pancard")
		return false;
	}
	else if(registerForm.emailId.value==""){
		alert("Enter emailId")
		return false;
	}
	else if(registerForm.basicSalary.value==""){
		alert("Enter basicSalary")
		return false;
	}
	else if(registerForm.epf.value==""){
		alert("Enter epf")
		return false;
	}
	else if(registerForm.companyPf.value==""){
		alert("Enter companyPf")
		return false;
	}
	else if(registerForm.accountNumber.value==""){
		alert("Enter accountNumber")
		return false;
	}
	else if(registerForm.bankName.value==""){
		alert("Enter bankName")
		return false;
	}
	else if(registerForm.ifscCode.value==""){
		alert("Enter ifscCode")
		return false;
	}
}
