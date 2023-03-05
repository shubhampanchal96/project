package com.example.registrationlogindemo.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private Long id;
    @NotEmpty
    private String firstName;
    @NotEmpty
    private String lastName;
    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;
    @NotEmpty(message = "Password should not be empty")
    private String password;
	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public CharSequence getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setFirstName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setLastName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(Object email2) {
		// TODO Auto-generated method stub
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
