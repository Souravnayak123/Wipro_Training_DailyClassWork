package Day22;

public class TestingFlipkartApplication 
{

    public static void main(String[] args) throws InterruptedException {

        // Create Objects
        BaseClass base = new BaseClass();

        LoginPage login = new LoginPage();

        SearchPage search = new SearchPage();

        CartPage cart = new CartPage();

        CheckOutPage checkout = new CheckOutPage();

        // Open Browser
        base.openBrowser();

        // Login
        login.login();
       Thread.sleep(20000);

        //Search Product
        search.searchProduct();

        // Add Product To Cart
        cart.addToCart();

        // Checkout
        checkout.checkoutProcess();

        // Close Browser
        base.closeBrowser();
    }
}