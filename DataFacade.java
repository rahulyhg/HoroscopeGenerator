package dataPopulant;

public class DataFacade {
	
	private static DataFacade instance = null;
	
	private DataFacade() {
		
	}
	
	public static DataFacade getInstance() {
		if (instance == null) {
			instance = new DataFacade();
		}
		return instance;
		
	}

}
