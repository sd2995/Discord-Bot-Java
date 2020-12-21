package com.sd.discordbot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;


public class Bot {
  
    public static JDA jda;
    public static String prefix = "~";
	public static void main(String[] args) throws LoginException {
		jda = new JDABuilder(AccountType.BOT).setToken("API-KEY").build();
		
		//jda.getPresence().setStatus();  -- can be used to set status of bot
		jda.addEventListener(new Commands());
	}
}