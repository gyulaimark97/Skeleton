package fileHandler;

public class SettingsHandler extends FileHandler implements IXmlParser{

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
