package com.atguigu.hello;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("She is my sintest");
		System.out.println("lient");
		System.out.println("Hello Github");
		System.out.println("client makes diff");
		System.out.println("master");
		System.out.println("master");
		System.out.println("master");
select bnsid from sol.tb_tracestep 
where bnsid in (select bnsid from sol.tb_tracemain where applyid in 
(select noticeid from sol.tb_plnotice where bnsstage != '1' and bnsstage != '2' and deleteflag = '1')
)
	}

}
