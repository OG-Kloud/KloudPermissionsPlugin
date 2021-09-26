package net.kloudspace.permissions;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.mojang.authlib.GameProfile;

import net.minecraftforge.server.permission.DefaultPermissionLevel;
import net.minecraftforge.server.permission.IPermissionHandler;
import net.minecraftforge.server.permission.context.IContext;

public class PermissionHandler implements IPermissionHandler {

	private final Map<String, PermissionNode> NODES = new HashMap<String, PermissionNode>();

	@Override
	public void registerNode(String node, DefaultPermissionLevel level, String desc) {

	}

	@Override
	public Collection<String> getRegisteredNodes() {
		return null;
	}

	@Override
	public boolean hasPermission(GameProfile profile, String node, IContext context) {
		return true;
	}

	@Override
	public String getNodeDescription(String node) {
		return null;
	}

	public void registerNode(String key, String permission) {
		if (NODES.containsKey(key))
			NODES.put(key, getNode(key));
		else
			NODES.put(key, new PermissionNode(key, permission));
	}

	public PermissionNode getNode(String key) {
		return NODES.containsKey(key) ? NODES.get(key) : null;
	}

}
