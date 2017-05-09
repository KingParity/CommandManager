package com.nemez.cmdmgr.util;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import com.nemez.cmdmgr.component.ICommandComponent;

public class AsyncExecutableDefinition extends ExecutableDefinition
{
	public AsyncExecutableDefinition(ArrayList<ICommandComponent> cmd, ArrayList<Integer> paramLinks, String perm,
			Method method, Object methodContainer, Type type)
	{
		super(cmd, paramLinks, perm, method, methodContainer, type);
	}
	
	@Override
	public boolean invoke(Object[] args, CommandSender sender, JavaPlugin plugin)
	{
		Thread t = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				invokeFromThread(args, sender, plugin);
			}
		});
		t.setDaemon(true);
		t.start();
		return true;
	}
	
	private final void invokeFromThread(Object[] args, CommandSender sender, JavaPlugin plugin)
	{
		super.invoke(args, sender, plugin);
	}
}
