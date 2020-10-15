import org.testng.annotations.Test;

public class RunTest extends Config {


	@Test
	public void test() {
		
	Search search = new Search();
	
	
	search.AccessAdvancedSearch();
	String text = "COVID-19";
	search.InputAllSearch(text);
	search.SelectLanguage("lang_vi");
	search.SelectLastUpdate("d");
    search.Submit();
    search.CheckFirstResult(text);

	}
}
