package com.nemez.cmdmgr;

import com.nemez.cmdmgr.util.Executable;
import org.bukkit.command.CommandSender;

public class EmptyCommand extends Executable {
	public EmptyCommand(String name) {
		super(name, null, "");
	}

	@Override
	public boolean execute(CommandSender sender, String name, String[] args_) {
		sender.sendMessage("§cCommand no longer Exists. Use §e/help§c, §e/plugins§c or ask a mod.");
		return true;
	}
}
