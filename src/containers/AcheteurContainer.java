package containers;

import agents.AcheteurAgent;
import agents.AcheteurAgent2;
import agents.AcheteurAgent3;
import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

import jade.wrapper.ControllerException;

public class AcheteurContainer {
String intitule;
    public AcheteurContainer() {
        Runtime runtime = Runtime.instance();
        ProfileImpl profilImp = new ProfileImpl(false);
        profilImp.setParameter(ProfileImpl.MAIN_HOST, "localhost");
        profilImp.setParameter(ProfileImpl.CONTAINER_NAME, "Acheteurs");
        AgentContainer agentContainer = runtime.createAgentContainer(profilImp);
        try {

            AgentController agentController1 = agentContainer.createNewAgent("Acheteur1", AcheteurAgent.class.getName(), new Object[]{"XML"});
            //AgentController agentController2 = agentContainer.createNewAgent("Acheteur2", AcheteurAgent2.class.getName(), new Object[]{"XML"});
            //AgentController agentController3 = agentContainer.createNewAgent("Acheteur3", AcheteurAgent3.class.getName(), new Object[]{"XML"});

            agentController1.start();
            //agentController2.start();
            //agentController3.start();

        } catch (ControllerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public AcheteurContainer(String intitule) {
        Runtime runtime = Runtime.instance();
        ProfileImpl profilImp = new ProfileImpl(false);
        profilImp.setParameter(ProfileImpl.MAIN_HOST, "localhost");
        profilImp.setParameter(ProfileImpl.CONTAINER_NAME, "Acheteurs");
        AgentContainer agentContainer = runtime.createAgentContainer(profilImp);
        try {

            AgentController agentController1 = agentContainer.createNewAgent(""+intitule, AcheteurAgent.class.getName(), new Object[]{"XML"});
            //AgentController agentController2 = agentContainer.createNewAgent("Acheteur2", AcheteurAgent2.class.getName(), new Object[]{"XML"});
            //AgentController agentController3 = agentContainer.createNewAgent("Acheteur3", AcheteurAgent3.class.getName(), new Object[]{"XML"});

            agentController1.start();
            //agentController2.start();
            //agentController3.start();

        } catch (ControllerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
