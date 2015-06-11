package com.tutorialspoint.test;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {
   @ManagedProperty(value="#{message}")
   private Message messageBean;
   private String message;

   public HelloWorld() {
      System.out.println("HelloWorld started yo!");   
   }
   public String getMessage() {
      if(messageBean != null){
         message = messageBean.getMessage();
      }       
      return message;
   }
   public void setMessageBean(Message message) {
      this.messageBean = message;
   }
}
