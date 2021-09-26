package net.kloudspace.permissions;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.permission.IPermissionHandler;

@Mod("kperms")
public class Permissions {
	
	private final IPermissionHandler permissionHandler;
	public static final String MODID = "kperms";
	
	
	public static final Permissions plugin = new Permissions();
	
	public Permissions() {
		permissionHandler = new PermissionHandler();
	}
	
	public IPermissionHandler getPermissionHandler() {
		return permissionHandler;
	}
	
	
}
