package com.nemez.cmdmgr;

import org.bukkit.command.CommandSender;

import com.nemez.cmdmgr.util.Executable;

public class EmptyCommand extends Executable
{
	public EmptyCommand(String name)
	{
		super(name, null, "");
	}
	
	@Override
	public boolean execute(CommandSender sender, String name, String[] args_)
	{
		sender.sendMessage("§cCommand no longer Exists. Use §e/help§c, §e/plugins§c or ask a mod.");
		return true;
	}
}
