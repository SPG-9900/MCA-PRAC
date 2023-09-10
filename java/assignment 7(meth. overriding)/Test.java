//METHOD OVERRIDDING PROGRAM WITH BANK AND INTEREST RATE.


class Test
{
public static void main(String args[])
{

SBI s=new SBI();
ICICI i=new ICICI();
Axis a= new Axis();

System.out.println("SBI RATE:"+s.rate()+"%");
System.out.println("ICICI RATE:"+i.rate()+"%");
System.out.println("AXIS RATE:"+a.rate()+"%");
}
}


class Bank{
int rate()
{
return 0;
}
}

class SBI extends Bank{
int rate()
{
return 8;
}
}

class ICICI extends Bank{
int rate()
{
return 7;
}
}

class Axis extends Bank
{
int rate()
{
return 9;
}
}

