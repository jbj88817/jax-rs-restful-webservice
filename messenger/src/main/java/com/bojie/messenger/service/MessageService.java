package com.bojie.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.bojie.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {
		Message m1 = new Message(1L, "Hello", "Bojie");
		Message m2 = new Message(2L, "Hellodog", "rui");
		List<Message> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		return list;
	}
	
}
