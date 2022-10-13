interface display1
{
    public void partnumber(int a);
}
interface display2 extends display1
{
    public void partdetail(String name, String city);
}
interface display3 extends display2
{
    public void partquantity(String amount);
}


class sample implements display3
{
    sample()
    {
        System.out.println("The Product Information");
    }
    public void partnumber(int a)
    {
        System.out.println("The part Number is : "+a);
    }
    public void partdetail(String name,String city)
    {
        System.out.println("The Part Name is :"+name);
        System.out.println("The Part Location is :"+ city);
    }
    public void partquantity(String amount)
    {
        System.out.println("The Part Price is :"+amount);
    }
}

public class inter_extenddemo {
    public static void main(String args[])
    {
        sample d=new sample();
        d.partnumber(4545);
        d.partdetail("Car Accessories", "Salem");
        d.partquantity("2000 Rs");
    }
}
