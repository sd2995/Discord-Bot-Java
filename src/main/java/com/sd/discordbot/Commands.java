package com.sd.discordbot;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Commands extends ListenerAdapter{
	
	public void eventHndler(GuildMessageReceivedEvent event) {
		
		String[] args = event.getMessage().getContentRaw().split("\\s+");
		
		if(args[0].equalsIgnoreCase(Bot.prefix + "thoughts")) {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Hello There ! This is thought bot").queue();
		}else {
			event.getChannel().sendTyping().queue();
			event.getChannel().sendMessage("Hello There 2! This is thought bot").queue();
		}
	}

}
