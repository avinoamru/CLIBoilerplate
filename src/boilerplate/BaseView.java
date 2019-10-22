package boilerplate;

public class BaseView
{
    BaseController controller;
    BaseModel model;

    public void SetController(BaseController aController)
    {controller = aController;}

    public void SetModel(BaseModel aModel)
    {model = aModel;}
}