		import java.util.Scanner;
		class E_wallet_p1dup  
		{
			public static void main(String[] args) 
			{
				Scanner sc=new Scanner(System.in);
				int pwd=8844;
				int min_bal=2000;
				int bal=2000;
				System.out.println("<<<<<WELCOME TO E-WALLET>>>>>");
				
				
				boolean b=false;
				while(!b)
				{
					System.out.println("PLEASE ENTER THE PASSWORD");
					int pwd1=sc.nextInt();
					if (pwd1==pwd)
					{
						b=true;

				

				 System.out.println("<<<<<MAIN MENU>>>>>");
				  boolean b1=false;
				  while(!b1)
				{
					  System.out.println("PRESS 1 FOR SHOPPING");
					  System.out.println("PRESS 2 FOR ADD BALANCE");
					  System.out.println("PRESS 3 FOR CHECK BALANCE");
					  System.out.println("PRESS 4 to EXIT");

					  
					  int S=sc.nextInt();
					  switch(S)
					{
						  case 1:
						{
							  boolean b2=false;
							  while(!b2)
							{     
								  System.out.println("<<<<<<<<<<<< SHOPPING >>>>>>>>>>");
								  System.out.println("PRESS 1 FOR WATCHES");
								  System.out.println("PRESS 2 FOR SHOES");
								  System.out.println("PRESS 3 FOR HOODIES");
								  System.out.println("PRESS 4 FOR BAGS");
								  System.out.println("PRESS 5 FOR CAPS");
								  System.out.println("PRESS 6 FOR MAKEUP-KIT");
								  System.out.println("PRESS 7 FOR GO BACK TO MAIN MENU");
								  System.out.println("****************************************************");


								  int S1=sc.nextInt();
								  switch(S1)
								{
									 
									  case 1:
									{       
										  boolean k=false;
										  while (!k)
										  {
										  
										  
										  System.out.println("//////////WATCHES////////");
										  System.out.println("COST OF FASTRACK :3000");
										  System.out.println("COST OF FOSSIL :5000");
										  System.out.println("COST OF TITAN :7000");
										  System.out.println("=============================================================================================");
										  System.out.println("PRESS 1 FOR FASTRACK");
										  System.out.println("PRESS 2 FOR FOSSIL");
										  System.out.println("PRESS 3 FOR TITAN");
										  System.out.println("****************************************************");


										  
										  int S2=sc.nextInt();
										  switch(S2)
										{
											  case 1:
											{
												   int f_cost=3000;
											   
											  int deduction=bal-f_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-f_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												  
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE WATCHES");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< WATCHES>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
										{
														 boolean h=false;
														   while(!h)
															{
												System.out.println("YOU ARE NOT MAINTAINING THE MINIMUM BALANCE IN YOUR WALLET");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);
											
												System.out.println("PRESS 1 TO ADD MONEY");
												System.out.println("PRESS 2 TO CONTINUE TO WATCHES");
												System.out.println("PRESS 3 TO SHOPPING");
												int d=sc.nextInt();
												switch(d)
																{
																	case 1:
																	{
																		h=false;
																

																	}break;
																	case 2:
																	{
																		
																		k=false;
																		h=true;
																	

																	}break;
																	case 3:
																	{
																		
																		b2=false;h=true;
																		
																	}break;
																}
															
												
												
															   

												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO WATCHES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<WATCHES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
														     System.out.println("PRESS 1 TO CONTINUE TO WATCHES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<WATCHES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 


														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 k=true;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																	k=true;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
												}
											
			}break;
			 case 2:
											{
												   int fo_cost=5000;
											  
											  int deduction=bal-fo_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-fo_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE WATCHES");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< WATCHES>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
					{
														 boolean h=false;
														   while(!h)
															{
											    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);

												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO WATCHES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<WATCHES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO WATCHES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<WATCHES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }



														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
									  
												}
											
			}break;
			 case 3:
											{
												   int titan_cost=7000;
											  
											  int deduction=bal-titan_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-titan_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE WATCHES");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< WATCHES>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
													  
												   }
								  

				}
				else
												{
					{
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO WATCHES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<WATCHES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO WATCHES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<WATCHES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }



														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
									   
												}
											
			}break;
		}
									}}break;
						
						 case 2:
									{ 
							             boolean k=false;
										 while(!k)
										{
							 
									   
									   
										 
										  System.out.println("//////////SHOES////////");
										  System.out.println("COST OF PUMA :9000");
										  System.out.println("COST OF ADIDAS :8000");
										  System.out.println("COST OF NIKE:10000");
										  System.out.println("=================================================================================");
										  System.out.println("PRESS 1 FOR PUMA");
										  System.out.println("PRESS 2 FOR ADIDAS");
										  System.out.println("PRESS 3 FOR NIKE");
										  
										  int S2=sc.nextInt();
										  switch(S2)
										{
											  case 1:
											{
												   int puma_cost=9000;
											  
											  int deduction=bal-puma_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-puma_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE SHOES");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< SHOES>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
					{
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO SHOES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<SHOES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO SHOES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<SHOES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
									  
												}
											
											}break;
											case 2:
											{
												   int adidas_cost=8000;
											 
											  int deduction=bal-adidas_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-adidas_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE SHOES");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< SHOES>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
					{
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO SHOES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<SHOES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO SHOES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<SHOES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
									 
												}
											
											}break;
											case 3:
											{
												   int nike_cost=10000;
											  
											  int deduction=bal-nike_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-nike_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
															   System.out.println("PRESS 1 FOR CONTINUE SHOES");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< SHOES>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
									  {
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO SHOES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<SHOES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO SHOES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<SHOES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   

												}
											
										  }break;
										}}break;
									}
										case 3:

									{ 
										
										    boolean k=false;
											while(!k)
										{
										  System.out.println("//////////HOODIES////////");   
										  System.out.println("COST OF ZARA:1000");
										  System.out.println("COST OF GUCCI :2000");
										  System.out.println("COST OF ROADSTER:1500");
										  System.out.println("=================================================================================");
										  System.out.println("PRESS 1 FOR ZARA");
										  System.out.println("PRESS 2 FOR GUCCI");
										  System.out.println("PRESS 3 FOR ROADSTER");
										  System.out.println("****************************************************");

										  
										  int S2=sc.nextInt();
										  switch(S2)
										{
											  case 1:
											{
												   int zara_cost=1000;
											  
											  int deduction=bal-zara_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-zara_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE HOODIES");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< HOODIES>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
						 {
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO HOODIES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<HOODIES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO HOODIES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<HOODIES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
									   

												}
											
											}break;
											case 2:
											{
												   int gucci_cost=2000;
											 
											  int deduction=bal-gucci_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-gucci_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													  System.out.println("PRESS 1 FOR CONTINUE HOODIES");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< HOODIES>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
									 {
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO HOODIES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<HOODIES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO HOODIES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<HOODIES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }



														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   

												}
											
											 }break;
											 case 3:
											{
												   int roadster_cost=1500;
											  
											  int deduction=bal-roadster_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-roadster_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE HOODIES");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< HOODIES>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
					{
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO HOODIES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<HOODIES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }
														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO HOODIES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<HOODIES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
									   

												}
											
			}break;
		}
									}}break;
									case 4:

									{  
										boolean k=false;
											while(!k)
										{
										  System.out.println("///////BAGS//////");
										  System.out.println("COST OF SKYBAGS:800");
										  System.out.println("COST OF SAFARI :1500");
										  System.out.println("COST OF WROGN:2000");
										  System.out.println("=================================================================================");
										  System.out.println("PRESS 1 FOR SKYBAGS");
										  System.out.println("PRESS 2 FOR SAFARI");
										  System.out.println("PRESS 3 FOR WROGN");
										  System.out.println("****************************************************");

										  
										  int S2=sc.nextInt();
										  switch(S2)
										{
											  case 1:
											{
												   int skybags_cost=800;
											  
											  int deduction=bal-skybags_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-skybags_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE BAGS");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<<<BAGS>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
									   {
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO BAGS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<BAGS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO BAGS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<BAGS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }



														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
												}
											
											}break;
											case 2:
											{
												   int safari_cost=1500;
											 
											  int deduction=bal-safari_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-safari_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE BAGS");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< BAGS>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
									  {
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO BAGS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<BAGS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO BAGS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<BAGS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }



														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   

												}
											
											 }break;
											 case 3:
											{
												   int wrogn_cost=2000;
											  
											  int deduction=bal-wrogn_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-wrogn_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													  System.out.println("PRESS 1 FOR CONTINUE BAGS");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<<BAGS>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
												  {
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);

												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO BAGS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<BAGS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO BAGS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<BAGS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   

												}
											
			}break;
		}
										}}break;
									case 5:

									{ 
										boolean k=false;
											while(!k)
										{
										  System.out.println("/////////CAPS////////");
										  System.out.println("COST OF PUMA:500");
										  System.out.println("COST OF URBAN MONKEY :1500");
										  System.out.println("COST OF JACK N JONES:2000");
										  System.out.println("=================================================================================");
										  System.out.println("PRESS 1 FOR PUMA");
										  System.out.println("PRESS 2 FOR URBAN MONKEY");
										  System.out.println("PRESS 3 FOR JACK N JONES");
										  System.out.println("****************************************************");

										  
										  int S2=sc.nextInt();
										  switch(S2)
										{
											  case 1:
											{
												   int puma1_cost=500;
											  
											  int deduction=bal-puma1_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-puma1_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE CAPS");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< CAPS>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{  
												  {
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO CAPS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<CAPS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO CAPS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<CAPS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
									   

												}
											
											}break;
											case 2:
											{
												   int urbanmonkey_cost=1500;
											 
											  int deduction=bal-urbanmonkey_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-urbanmonkey_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE CAPS");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< CAPS>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
												  {
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO CAPS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<CAPS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO CAPS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<CAPS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
									 

												}
											
											 }break;
											 case 3:
											{
												   int jack_cost=2000;
											  
											  int deduction=bal-jack_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-jack_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													  System.out.println("PRESS 1 FOR CONTINUE CAPS");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< CAPS>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
												  {
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO CAPS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<CAPS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO CAPS");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<CAPS>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }



														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
									   

												}
											
			}break;
		}
										}}break;
									case 6:

									{  
										
										boolean k=false;
											while(!k)
										{
										  System.out.println("//////  MAKEUP-KIT //////");
										  System.out.println("COST OF LAKME:10000");
										  System.out.println("COST OF LOREAL :15000");
										  System.out.println("COST OF MAC:25000");
										  System.out.println("=================================================================================");
										  System.out.println("PRESS 1 FOR LAKME");
										  System.out.println("PRESS 2 FOR LOREAL");
										  System.out.println("PRESS 3 FOR MAC");
										  System.out.println("****************************************************");

										  
										  int S2=sc.nextInt();
										  switch(S2)
										{
											  case 1:
											{
												   int lakme_cost=10000;
											  
											  int deduction=bal-lakme_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-lakme_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													    System.out.println("PRESS 1 FOR CONTINUE MAKEUP-KIT");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<<MAKE-UPKIT>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
									  {
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO  MAKEUP-KIT");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<< MAKEUP-KIT>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO  MAKEUP-KIT");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<< MAKEUP-KIT>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   

												}
											
											}break;
											case 2:
											{
												   int loreal_cost=15000;
											 
											  int deduction=bal-loreal_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-loreal_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													  System.out.println("PRESS 1 FOR CONTINUE MAKEUP-KIT");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<<MAKEUP-KIT>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
					{
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO  MAKEUP-KIT");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<< MAKEUP-KIT>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO WATCHES");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<<WATCHES>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
												 
												}
											
											 }break;
											 case 3:
											{
												   int mac_cost=25000;
											  
											  int deduction=bal-mac_cost;
											  if (deduction>min_bal)
												{
												  bal=bal-mac_cost;
												  System.out.println("PURCHASE SUCCESSFUL");
												
												   
												   boolean b3=false;
												   while (!b3)
												   {
													   System.out.println("PRESS 1 FOR CONTINUE MAKEUP-KIT");
													   System.out.println("PRESS 2 FOR SHOPPING");
													   System.out.println("PRESS 3 FOR MAIN MENU");
													   System.out.println("PRESS 4 TO  EXIT");
													   
													   int S3=sc.nextInt();
													   switch(S3)
													   {
														   case 1:
														   {
															   System.out.println("<<<<<< MAKEUP-KIT>>>>>");
															   b3=true;
															   b2=false;
															   b1=true;
															   k=false;
															   

														   }
														   break;
														   case 2:
														   {
															   
															   b3=true;
															   b2=false;
															   
															   k=true;
															   b1=true;
															   
															   
														   }break;
														
														   case 3:
														   {
															   System.out.println("<<<<MAIN MENU>>>>>");
															   b3=true;
															   b2=true;
															   
															   k=true;
															   b1=false;
															 

														   }break;
														   case 4:
														   { 
															   System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															    b3=true;
															   b2=true;
															   b1=true;
															   k=true;
														   }
													   }
												   }
								  

				}
				else
												{
					{
														 boolean h=false;
														   while(!h)
															{
															    System.out.println("<<<<<<<<<<<<<<<<INSUFFICIENT BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("YOUR CURRENT BALANCE IS :"+bal);


												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															System.out.println("PRESS 1 TO CONTINUE TO  MAKEUP-KIT");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<< MAKEUP-KIT>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 
															           
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
																	  h=true;

																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }


														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO CONTINUE TO  MAKEUP-KIT");
															 System.out.println("PRESS 2 TO SHOPPING");
															 System.out.println("PRESS 3 TO MAIN MENU");
															 System.out.println("PRESS 4 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("<<<<<<<< MAKEUP-KIT>>>>>>>>>");
																	 b5=true;
																	 b1=false;
																	 h=true;
																	 b5=true;
																 }
																 break;
																 case 2:
																 {
																
															          b2=false;
															   
															          k=true;
															          b1=true;
																	  b5=true;
																	  h=true;
																	 
																	
																 }break;
																 case 3:
																 {
																	 System.out.println("<<<<<<<<MAIN MENU>>>>>>>>>");
																	
															   b2=true;
															   
															   k=true;
															   b1=false;
															   b5=true;
															   h=true;


																 }break;
																 case 4:
																 {
																	  System.out.println("<<<<THANK YOU VISIT US AGAIN >>>>>");
															   
															   b2=true;
															   b1=true;
															   k=true;
															   b5=true;
															   h=true;

																 }

																 }

														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}
															}
									   
													
												}
											
			}break;
		}
									}break;
									}case 7:{
										      b2=true;
											  b1=false;
										
									        }
									}
									
							}
						}break;
			case 2: 
														{
														  boolean h=false;
														   while(!h)
															{
															   
												System.out.println("<<<<<<<<<<<<<<<<ADD BALANCE>>>>>>>>>>>>>>>>>");
												System.out.println("10% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000 T0 999999");
												System.out.println("2.5% CHARGES WILL BE DEDUCTED FOR ADDING MONEY FROM 1000000");



													System.out.println("ENTER THE BALANCE TO BE ADDED");
													int bal1=sc.nextInt();
														 if (bal1>=1000&&bal1<=999999)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO MAIN MENU");
															 System.out.println("PRESS 2 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("ENJOY OUR SERVICES");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 System.out.println("THANK YOU VISIT US AGAIN");
																	 b5=true;
																	 b1=true;
																	 h=true;

																 }

																 }


														 }
														 }
														 else if (bal1>=1000000)
														 {
															 bal=(bal+(bal1-bal1*10/100));
															 System.out.println("UPDATED BALANCE IS: "+bal);
															  boolean b5=false;
														 while (!b5)
														 {
															 System.out.println("PRESS 1 TO MAIN MENU");
															 System.out.println("PRESS 2 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("ENJOY OUR SERVICES");
																	 b5=true;
																	 b1=false;
																	 h=true;
																 }
																 break;
																 case 2:
																 {
																	 System.out.println("THANK YOU VISIT US AGAIN");
																	 b5=true;
																	 b1=true;
																	 h=true;

																 }

																 }


														 }

														 }
														 else if (bal1>=1&&bal1<=999)
														 {
															 System.out.println("MINIMUM BALANCE TO ENTER IS GREATER THAN 1000");
															 System.out.println("PRESS 1 TO ENTER MONEY");
															 System.out.println("PRESS 2 TO CONTINUE TO SHOPPING");
															 int h1=sc.nextInt();
															 switch (h1)
															 {
															 case 1 :
																 {
																	 h=false;
																	 
																 }break;
																 case 2:
																 { 
																	 h=true;
																	b1=false;
																 }break;
															 
															 }
														 
														   
														 }
															}}break;
				case 3:
							  {
					
					
										   System.out.println("<<<<<<<<<<<<<<<<CHECK BALANCE>>>>>>>>>>>>>>>>>");
													 System.out.println("BALANCE :"+bal);
													  boolean b6=false;
														 while (!b6)
														 {
															 System.out.println("PRESS 1 TO MAIN MENU");
															 System.out.println("PRESS 2 TO EXIT");
															 int S5=sc.nextInt();
															 switch(S5)
															 {
																 case 1:
																 {
																	 System.out.println("ENJOY OUR SERVICES");
																	 b6=true;
																	 b1=false;
																 }
																 break;
																 case 2:
																 {
																	 System.out.println("THANK YOU VISIT US AGAIN");
																	 b6=true;
																	 b1=true;

																 }

																 }


														 }

								}break;
						case 4:
						{
							b1=true;
							System.out.println("THANK YOU VISIT US AGAIN");
						}

								}
				 }
				 }
					else
					{
						System.out.println("PRESS 1 TO RE-ENTER THE PASSWORD");
						System.out.println("PRESS 2 TO EXIT");
						
						int p=sc.nextInt();
						switch (p)
						{
						case 1:
							{
							
							b=false;
							
							
						
							
							  
							}break;
							case 2:
							{
								b=true;
							}break;
						
						}
			 }
			}
		}
		}

				
		
			
				
			
