package fileHandler;

import gameEngine.Map;

public class MapLoader extends FileHandler implements IXmlParser {

	private Map map;
	
	public boolean loadMapSprite() {return false;}
	
	@Override
	public boolean loadXml() {
		return false;
	}

	@Override
	public boolean saveXml() {
		return false;
	}

	@Override
	public String getFilePath() {
		return null;
	}
	
	

}
