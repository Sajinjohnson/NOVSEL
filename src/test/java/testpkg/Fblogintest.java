package testpkg;

import pagepkg.Fbloginpage;

public class Fblogintest extends Baseclass{
	@Test
	public void verifyLoginWithValidCred() throws Exception
	
	{
		Fbloginpage p1=new Fbloginpage(driver);
		
		String x1="F:\\LUMINAR\\Book1.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutils.getRowCount(x1,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String UserName=Excelutils.getCellValue(x1,Sheet,i,0);
			System.out.println("username---"+UserName);
			
			String Pwd=Excelutils.getCellValue(x1,Sheet,i,1);
			System.out.println("password---"+Pwd);
			
			p1.setvalues(UserName,Pwd);
			p1.clickLoginBtn();
		}
	}

}
