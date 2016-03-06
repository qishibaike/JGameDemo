package com.metazion.jgd.protocal.cl;

import com.metazion.jgd.protocal.Message;
import com.metazion.jgd.protocal.Protocal;

@SuppressWarnings("serial")
public class UserRegisterCL extends Message {

	public String username = "";
	public String password = "";

	public UserRegisterCL() {
		super(Protocal.PN_CL_USERREGISTER);
	}
}
