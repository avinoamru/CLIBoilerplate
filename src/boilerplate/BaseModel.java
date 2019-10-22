package boilerplate;

public class BaseModel
{
    BaseView view;
    BaseController controller;

    public void SetContoller(BaseController aController)
    {controller = aController;}

    public void SetView(BaseView aView)
    {view = aView;}
}