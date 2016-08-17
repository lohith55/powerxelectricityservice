package com.customerservice.customerdetails.jms;

import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.listener.SessionAwareMessageListener;
import org.springframework.stereotype.Component;

import com.customerservice.customerdetails.service.MessageService;

@Component("JMSListener")
public class JMSListener implements SessionAwareMessageListener<TextMessage> {

	@Override
	public void onMessage(TextMessage message, Session session) throws JMSException {
		// TODO Auto-generated method stub
		if (message instanceof TextMessage) {
			String msg;
	
				msg = ((TextMessage) message).getText();
			
			//String scid= msg.toString();
			System.out.println("OnMessage Received  :" + msg);
			    
			String [] msgAry = msg.split(" ");		
				
					int c_id=Integer.parseInt(msgAry[0]);
					int serv_id=Integer.parseInt(msgAry[1]);
					System.out.println(c_id + " "+ serv_id);
					
					MessageService messService = new MessageService();
					messService.setCustomerService(c_id, serv_id);								
			}}}
