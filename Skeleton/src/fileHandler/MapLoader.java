package fileHandler;

import gameEngine.Map;

public class MapLoader extends FileHandler implements IXmlParser {

	private Map map;
	
	public boolean loadMapSprite() {return false;}
	
	@Override
	public boolean tryToLoad() {
		return false;
	}

	@Override
	public boolean tryToSave() {
		return false;
	}

	@Override
	public String getFilePath() {
		return null;
	}
	
	

}
