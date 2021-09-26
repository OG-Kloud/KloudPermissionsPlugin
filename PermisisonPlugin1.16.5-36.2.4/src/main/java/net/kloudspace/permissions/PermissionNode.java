package net.kloudspace.permissions;

public class PermissionNode {
	
	private final String key;
	private final String permission;
	
	public PermissionNode(String k, String p) {
		key = k;
		permission = p;
	}

	public String getKey() {
		return key;
	}

	public String getPermission() {
		return permission;
	}
	
	

}
