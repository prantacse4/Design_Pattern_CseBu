package Observer_Design_Pattern_01;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		Client cl1 = new client1();
		Client cl2 = new client2();
		server.addNewClient(cl1);
		server.addNewClient(cl2);
		server.newData("108.109.12.13", "EnjoyNetwork");
		server.notifyNow();
		server.removeNewClient(cl1);
		server.notifyNow();
		server.newData("108.109.12.13", "NewNetwork");
	}

}
