package project;

import java.util.Scanner;
class  swiggy
{
    static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("\t\t\t***\"WELCOM TO SWIGGI\"***");
		System.out.println("\t\tYOUR ARE ANGRYE\n");
		Thread.sleep(1000);
		System.out.println("pls select the hotel");
        Thread.sleep(1000);
		System.out.println("1.BUHARI\n 2.S.S HYDRABADI\n 3.EAT'S OF ARAB\n 4.AMMA CANTEN");
		int hotel=sc.nextInt();
		 switch (hotel)
		 {
		 case 1:{
			 System.out.println("\t\t\tTHNX FOR SELLECTING BUHARI HOTEL");
		     System.out.println("1.Spl_Briyani\n 2.Dum_Briyani\n 3.Chicken_Briyani\n 4.Mutton_Briyani\n 5.Thanduri\n 6.Combo_Offer_Bucket_Biriyani\n 7.Exit");
			 int food=sc.nextInt();
		 
		     switch(food)
				 { 
				 case 1:{
				         int Spl_Biriyani_price=250;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Spl_Biriyani_price*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();

						  switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }//switch payment
						break; }//case 1 food
				  

				                case 2:
									{
				                     int Dum_Biriyani_price=350;
				                     System.out.println("\t\t\tpls Enter The Quantity");
				                     int quntity=sc.nextInt();
				                    double Bill=Dum_Biriyani_price*quntity;
				                    System.out.println("Total Price Is :"+Bill);
				                    Thread.sleep(1000);
				                    System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				                    int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//phonpe
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 2 switch payment 
						  
						break;  }//case 2 food
  
                      case 3:
						  { 
						  int Chicken_Biriyani_price=200;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Chicken_Biriyani_price*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 3 switch payment 
						  
						break; }//case 3 food

                             case 4:{   
						  
						        int Mutton_Biriyani_price=400;
				                 System.out.println("\t\t\tpls Enter The Quantity");
				                int quntity=sc.nextInt();
				                double Bill=Mutton_Biriyani_price*quntity;
				                System.out.println("Total Price Is :"+Bill);
				                Thread.sleep(1000);
				                System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				                int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 4 switch payment 
					  }//case 4 food

                      case 5:
						  { 
						  int Thanduri_price=450;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Thanduri_price*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 5 switch payment 
					}//case 5 food

					 case 6:
						  { 
						  int Combo_Offer_price=1200;
						  System.out.println("chicken biriyani + chicken 65 + chilly chicken");
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Combo_Offer_price*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 6 switch payment 
					}//case 6 food
				   
				              case 7:
								  {
								  System.out.println("THANKS FOR VISITING OUR RESTURANT"+(char)1+"\n");
					  
				                   }//case 7
				 }//case 1 switch(food)
		break; }//case 1 hotel
		            
					    case 2:
							{
							System.out.println("\t\t\tTHNX FOR SELLECTING S.S HYDRABADI HOTEL");
		                    System.out.println("1.Prawn_Briyani\n 2.Chicken_Briyani\n 3.Mutton_Briyani\n 4.Chilly_chicken\n 5.Combo_Offer_Bucket_Biriyani \n6. Fish_Briyani\n 7.Exit");
			                int food=sc.nextInt();
		                     
							 switch(food){
								
				 
				 case 1:{
				         int Prawn_Biriyani_price=350;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Prawn_Biriyani_price*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();

						  switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }//case 1 switch payment
						}//case 1 food


                               case 2:
						             { 
						            int Chicken_Biriyani_price=250;
				                    System.out.println("\t\t\tpls Enter The Quantity");
				                    int quntity=sc.nextInt();
				                    double Bill=Chicken_Biriyani_price*quntity;
				                    System.out.println("Total Price Is :"+Bill);
				                    Thread.sleep(1000);
				                    System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				                     int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 2 switch payment 
					}//case 2 food


                     case 3:
						  { 
						  int Mutton_Biriyani_price=450;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Mutton_Biriyani_price*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 3 switch payment 
					}//case 3 food


                      case 4:
						  { 
						  int Chilly_chicken_price=220;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Chilly_chicken_price*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 4 switch payment 
					}//case 4 food


                     case 5:
						  { 
						  int Combo_Offer_price=1250;
						  System.out.println("chiken Briyani 6 to 7 mem  + Grill + chicken65 + Thanduri");
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Combo_Offer_price*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 5 switch payment 
					}//case 5 food


                         case 6:
						  { 
						  int Fish_Biriyani_price=550;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Fish_Biriyani_price*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 6 switch payment 
					}//case 6 food

                               case 7 :
								   {
								 System.out.println("THANKS FOR VISITING OUR RESTURANT"+(char)1+"\n");
                               }//case 7 close
							 }//case 2 switch food
			           break;  }//case 2 hotel 
                          
                         case 3:{
			                   System.out.println("\t\t\tTHNX FOR SELLECTING EAT'S OF ARAB HOTEL");
		                      System.out.println("\n 1.Mandi_chicken_Briyani\n 2.Chicken_Briyani\n 3.Manthi_Mutton_Briyani\n 4.Thanduri\n 5.Mutto_Biriyani \n 6.Prown_Fry\n 7.Exit");
			                  int food=sc.nextInt(); 
							  switch(food)
								  {

					case 1:
						  { 
						  int Mandi_chicken_Briyani =450;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Mandi_chicken_Briyani*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// 3 of case 1 switch payment 
					}//case 1 food

								
                           case 2:
						  { 
						  int Chicken_Biriyani=220;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Chicken_Biriyani*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 2 switch payment 
					}//case 2 food

                                
				    case 3:
						  { 
						  int Mandi_Mutton_Biriyani=750;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Mandi_Mutton_Biriyani*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 3 switch payment 
					}//case 3 food


                            case 4 :
						  { 
						  int Thanduri_price=350;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Thanduri_price*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 4 switch payment 
					}//case 4 food


                           case 5:
						  { 
						  int Mutton_Biriyani=450;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Mutton_Biriyani*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 5 switch payment 
					}//case 5 food


                         case 6:
						  { 
						  int Prown_Fry=450;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Prown_Fry*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 6 switch payment 
					}//case 6 food

                           case 7 :
									  {
										System.out.println("THANKS FOR VISITING OUR RESTURANT"+(char)1+"\n");
									  }//case 7close
					  }//case 3 switchfood
							break;  }//hotel case 3 close

                                   
								    case 4:{
			                   System.out.println("\t\t\tTHNX FOR SELLECTING SARAVANA BAVAN HOTEL");
		                      System.out.println("\n 1.Sambar_sadham\n 2.Veg_biriyani\n 3.Tomato_Rice\n 4.Veg_meals\n 5.Vadagari \n 6.Pannir_Rice\n7.Exit");
			                  int food=sc.nextInt(); 
							  switch(food)
								  {

					case 1:
						  { 
						  int Sambar_sadham=120;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Sambar_sadham*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// 4 of case 1 switch payment 
					}//case 1 food

								
                           case 2:
						  { 
						  int Veg_biriyani=150;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Veg_biriyani*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// 4th case 2nd switch payment 
					}// 4thcase 2nd food

                                
				    case 3:
						  { 
						  int Tomato_Rice=80;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Tomato_Rice*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 3 switch payment 
					}//case 3 food


                            case 4 :
						  { 
						  int Veg_meals=200;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Veg_meals*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// 4th case 4th switch payment 
					}//4th case 4th food


                           case 5:
						  { 
						  int Vadagari=450;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Vadagari*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// 4th case 5th switch payment 
					}//4thcase 5th food


                         case 6:
						  { 
						  int Panni_Rice=450;
				          System.out.println("\t\t\tpls Enter The Quantity");
				          int quntity=sc.nextInt();
				          double Bill=Panni_Rice*quntity;
				          System.out.println("Total Price Is :"+Bill);
				          Thread.sleep(1000);
				          System.out.println(" Pls Enter The Payment Methoad\n 1. GPAY \n 2. PHONPE\n 3. PAYTM\n 4. UPI");
				          int Payment=sc.nextInt();
						  
						 switch(Payment)
					 {
						case 1:
						 {
							    System.out.println("Pls Enter The GpayAmount");
						       double Gpayamount=sc.nextInt();
							   if (Gpayamount==Bill)
							   {
								   System.out.println("generate opt");
								   double Gpay_otp=Math.random()*9999+9999;
								   int check=(int)Gpay_otp;
								   System.out.println(check);
								   System.out.println("Pls Enter The otp");
								   int otp_inGpay=sc.nextInt();
								   if(check==otp_inGpay)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								  } 
								  }
                        break; }//Gpay
						 
						case 2:
						 {
							    System.out.println("Pls Enter The Amount");
						       double Phonpe_amount=sc.nextInt();
							   if (Phonpe_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Phonpe_otp=Math.random()*9999+9999;
								   int Phonpe_check=(int)Phonpe_otp;
								   System.out.println(Phonpe_check); 
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Phonpe_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//phonpe

						
						case 3:
						 {
							    System.out.println("Pls Enter The Total Amount");
						       double Paytm_amount=sc.nextInt();
							   if (Paytm_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double Paytm_otp=Math.random()*9999+9999;
								   int Paytm_check=(int)Paytm_otp;
								   System.out.println(Paytm_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(Paytm_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }

						break; }//paytm
                                
						         
						case 4:
						 {
							    System.out.println("Pls Enter The Amount");
						       double upi_amount=sc.nextInt();
							   if (upi_amount==Bill)
							   {
								   System.out.println("Generate otp");
								   double upi_otp=Math.random()*9999+9999;
								   int upi_check=(int)upi_otp;
								   System.out.println(upi_check);
								   System.out.println("Pls Enter The otp");
								   int otp_in=sc.nextInt();
								   if(upi_check==otp_in)
								   {
									System.out.println("processing pls wait");
									Thread.sleep(1000);
									System.out.println("Your Odder Is Sucessfully Taken");
									System.out.println("\t\t\t THANX FOR YOUR ODDREING \t");
								   }
								   else{
									   System.out.println("pls Enter The Otp");
								   }
							   }
						break; }//upi
 
							   }// case 6 switch payment 
					}//case 6 food

                           case 7 :
									  {
										System.out.println("THANKS FOR VISITING OUR RESTURANT"+(char)1+"\n");
									  }//case 7close
					  }//case 4 switchfood
							break;  }//hotel case  close







	 }//swith hotel

					 } //public
		     }//main class

