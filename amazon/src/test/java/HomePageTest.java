import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {

@Test
    public void homePageTest(){

    driver.get("http://www.amazon.com");
}
}

