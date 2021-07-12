package Observer_Design_Pattern_01;

public class client2 implements Client{
	@Override
	public void dataChanged(String currentIp, String NetworkName) {
		// TODO Auto-generated method stub
		
		System.out.println(" < Client2:Notified > [ CurrentIP: "+currentIp+", NetworkName: "+NetworkName+" ]");
		
	}
}
