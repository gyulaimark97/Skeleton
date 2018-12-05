package fileHandler;

public class SettingsHandler extends FileHandler implements IXmlParser{

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
