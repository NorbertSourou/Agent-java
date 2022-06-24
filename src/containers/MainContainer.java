package containers;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.util.ExtendedProperties;
import jade.util.leap.Properties;
import jade.wrapper.AgentContainer;
import jade.wrapper.ControllerException;

public class MainContainer {

	public MainContainer () {
		// TODO Auto-generated method stub
		Runtime runtime = Runtime.instance();
				//creation des proprietés du main container
		Properties properties = new ExtendedProperties();
		properties.setProperty(Profile.GUI, "true");
		properties.setProperty(Profile.CONTAINER_NAME, "SMA IFRI");
		ProfileImpl profilImp = new ProfileImpl(properties);
		
		//creation du main container
       AgentContainer mainContainer = runtime.createMainContainer(profilImp);
       try {
	   mainContainer.start();
       } 
       catch (ControllerException e) {
	   // TODO Auto-generated catch block
	   e.printStackTrace();
        }
	}
}
