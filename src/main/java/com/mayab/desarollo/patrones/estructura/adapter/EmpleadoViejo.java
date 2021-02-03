package com.mayab.desarollo.patrones.estructura.adapter;

public class EmpleadoViejo implements PersonaVieja{

	private String firstname;
	private String lastname;
	private String birthday;
	
	public EmpleadoViejo(String firstname, String lastname, String birthday) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
	}

	@Override
	public String getFirstname() {
		// TODO Auto-generated method stub
		return firstname;
	}

	@Override
	public String getLastname() {
		// TODO Auto-generated method stub
		return lastname;
	}

	@Override
	public String getBirthday() {
		// TODO Auto-generated method stub
		return birthday;
	}

}
