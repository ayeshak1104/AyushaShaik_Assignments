public class App 
{
    private static App app;
     
    private App()
    {

    }
    public static App getInstance()
    {
        if(null == app)
        {
            app = new App();
        }
        return app;
    }

    
    public static void main(String args[])
    {
       App app= App.getInstance();
       App app1= App.getInstance();

    }
}
    

