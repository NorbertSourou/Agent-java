package agents;

import gui.MyFrame;
import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.core.behaviours.OneShotBehaviour;
import jade.core.behaviours.TickerBehaviour;
import jade.gui.GuiAgent;
import jade.gui.GuiEvent;

import javax.swing.*;

//public class AcheteurAgent extends Agent {
public class AcheteurAgent extends Agent {

//    MyFrame frame = new MyFrame();

    @Override
    //la methode setup() s'execute une seule fois
    protected void setup() {
//        frame.setTitle("Login Form");
//        frame.setVisible(true);
//        frame.setBounds(10, 10, 700, 700);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(true);
//
//        frame.setAcheteurAgent(this);

        // TODO Auto-generated method stub
        String name = this.getAID().getLocalName();
        System.out.println("Agent Acheteur " + name + " crée");

        Object[] args = getArguments();
        if (args.length == 0) {
            doDelete();
        } else {
            System.out.println("Tentative d'achat du livre" + args[0]);
        }
		
		/*
		
		// Comportement Agent
				addBehaviour(new OneShotBehaviour() {
					public void action() {
						// TODO Auto-generated method stub
						System.out.println("Une seule execution");
					}	
				});	
				*/
		/*
		//Execution cyclique
		addBehaviour(new CyclicBehaviour() {
			public void action() {
				// TODO Auto-generated method stub
				System.out.println("Execution cyclique");
			}	
		});	
		*/


        // Comportement Agent
        addBehaviour(new TickerBehaviour(this, 5000) {
            protected void onTick() {
                // TODO Auto-generated method stub
                System.out.println("Chaque cinq seconde");
            }
        });
    }

    @Override
    //est appelé avant de supprimer l'agent
    protected void takeDown() {
        String name = this.getAID().getLocalName();
        System.out.println("Destruction de l'Agent  " + name);
    }


}
