package com.mayab.desarollo.parcial1.problema1;

public class Message {
	enum MessageType{
		EMAIL,
		TEXT
	}
	
	private MessageType type;
	private Compra compra;
	
	
	


	public Message(MessageType type, Compra compra) {
		super();
		this.type = type;
		this.compra = compra;
	}


	public MessageType getType() {
		return type;
	}


	public Compra getCompra() {
		return compra;
	}


	public void setType(MessageType type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Message [type=" + type + ", compra=" + compra + "]";
	}
	
	
	
}
