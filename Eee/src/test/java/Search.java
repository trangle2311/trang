import org.testng.annotations.Test;

public class Search extends Action { 
	public void AccessSetting(){
		Action.clickElement(Xpath.SETTING);
	}
	
	public void AccessAdvancedSearch(){
		this.AccessSetting();
		Action.clickElement(Xpath.ADVANCED_SEARCH_BUTTON);
	}
	
	public void InputAllSearch(String text){
		Action.typeText(Xpath.WORD_INPUT, text);
	}
	
	public void SelectLanguage(String value){
		Action.clickElement(Xpath.LANGUAGE);
		Action.clickElement("//*[@value = '"+ value +"']");
	}
	
	public void SelectLastUpdate(String value){
		Action.clickElement(Xpath.LAST_UPDATE);
		Action.clickElement("//*[@value = '"+ value +"']");
	}
	
	public void Submit(){
		Action.clickElement(Xpath.SUBMIT);
	}
	
	public void CheckFirstResult(String text){
		Action.waitForVisible("//*[@id='tvcap']//*[@role='heading']//span[contains(text(), '"+ text +"')]");
	}

	
	

	
	

}
