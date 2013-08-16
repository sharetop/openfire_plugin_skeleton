package cn.sharetop.openfireplugin.skeleton;

import java.io.File;

import org.jivesoftware.openfire.XMPPServer;
import org.jivesoftware.openfire.container.Plugin;
import org.jivesoftware.openfire.container.PluginManager;

public class HelloPlugin implements Plugin{

	private XMPPServer mServer;
	
	@Override
	public void destroyPlugin() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello plugin stoped.");
	}

	@Override
	public void initializePlugin(PluginManager arg0, File arg1) {
		// TODO Auto-generated method stub
		mServer = XMPPServer.getInstance();
		
		System.out.println("Hello plugin started.");
	}

}
