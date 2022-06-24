package containers;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.ControllerException;

public class VendeurContainer {
	public VendeurContainer() {
	    Runtime runtime = Runtime.instance();
		ProfileImpl profilImp = new ProfileImpl(false);
		profilImp.setParameter(ProfileImpl.MAIN_HOST, "localhost");
		profilImp.setParameter(ProfileImpl.CONTAINER_NAME, "Vendeurs");
		AgentContainer agentContainer = runtime.createAgentContainer(profilImp);
		try {
			agentContainer.start();
		} catch (ControllerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	

}
