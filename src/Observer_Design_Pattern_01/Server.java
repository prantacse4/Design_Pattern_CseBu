package Observer_Design_Pattern_01;

import java.util.*;

public class Server {
	private String currentIp, NetworkName;
	private List<Client> clients = new ArrayList<>();
	

	
	public void addNewClient(Client cli) {
		clients.add(cli);
	}
	
	public void removeNewClient(Client cli) {
		clients.remove(cli);
	}
	
	
	
	public String getCurrentIp() {
		return currentIp;
	}

	public void setCurrentIp(String currentIp) {
		this.currentIp = currentIp;
	}

	public String getNetworkName() {
		return NetworkName;
	}

	public void setNetworkName(String networkName) {
		NetworkName = networkName;
	}
	
	public void newData(String currentIp, String NetworkName ) {
		this.currentIp = currentIp;
		this.NetworkName = NetworkName;
		notifyAllClients();
	}
	
	public void notifyNow() {
		currentIp =getCurrentIp();
		NetworkName=getNetworkName();
		notifyAllClients();
	}

	public void notifyAllClients() {
		for(Client c : clients) {
			c.dataChanged(currentIp, NetworkName);
		}
		System.out.println();
	}
	

}
