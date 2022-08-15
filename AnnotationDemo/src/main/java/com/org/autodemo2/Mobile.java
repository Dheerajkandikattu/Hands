package com.org.autodemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile implements MessageProcessor {
	
	@Autowired
	@Qualifier("emailservice")
	private MessageService msg;

	public MessageService getMsg() {
		return msg;
	}

	public void setMsg(MessageService msg) {
		this.msg = msg;
	}

	@Override
	public void processmessage(String s) {
		// TODO Auto-generated method stub
		msg.sendmessage(s);
		
	}

}
