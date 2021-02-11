import java.util.*;
import java.io.*;

class Item{
	public String sName;
	public int iQuantity;
	public double fPrice;
	public int iType;

	public Item(String sName,int iQuantity,double fPrice,int iType){
		this.sName = sName;
		this.iQuantity = iQuantity;
		this.fPrice = fPrice;
		this.iType = iType;

		if(this.iQuantity <= 0){
			System.out.println("please enter valid quantity");
			System.exit(-1);
		}
		if(this.fPrice <= 0.0){
			System.out.println("please enter valid price");
			System.exit(-1);
		}
	}
}

class Tax{
	public void calculateTax(ArrayList <Item>itemList){
		double saleTax = 0.0;
		double finalPrice = 0.0;
		System.out.println("Name\t\tPrice\t\tTax\t\tFinal price");
		System.out.println("-------------------------------------------------");

		for(int i = 0;i < itemList.size();i++){
			
			Item item = itemList.get(i);

			if(item.iType == 1){
				saleTax = (item.fPrice * 12.5) / 100;
			}
			else if(item.iType == 2){
				double tempSaleTax = (item.fPrice * 12.5) / 100;
				saleTax = tempSaleTax + ((tempSaleTax + item.fPrice) * 2) / 100;
			}
			else{
				double importDuty = (item.fPrice * 10) / 100;
				double tempSaleTax = (item.fPrice * 12.5) / 100;
				
				if((importDuty + tempSaleTax) < 100){
					saleTax = (importDuty + tempSaleTax) + 5;
				}
				else if((importDuty + tempSaleTax) > 100 && (importDuty + tempSaleTax) < 200){
					saleTax = (importDuty + tempSaleTax) + 10;
				}
				else{
					saleTax = ((importDuty + tempSaleTax + item.fPrice) * 5) / 100;
				}
			}

			finalPrice = item.fPrice + saleTax;
			System.out.println(item.sName+"\t\t"+item.fPrice+"\t\t"+saleTax+"\t\t"+finalPrice);
		}
	}
}

class Items {

    public static void main(String args[]){

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            ArrayList <Item>itemList = new ArrayList<Item>();

            while(true){
                System.out.println("Enter item name");
                String sName = br.readLine();
                System.out.println("Enter price of item");
                double fPrice = Double.parseDouble(br.readLine());
                System.out.println("Enter quantity of item");
                int iQuantity = Integer.parseInt(br.readLine());
                System.out.println("Enter type of item");
                System.out.println("1 for RAW item \n2 for MANIFACTURED item \n3 for IMPORTED");
                int iType = Integer.parseInt(br.readLine());
                System.out.println(iType);

               	while(true){
               		if(iType == 1 || iType == 2 || iType == 3){
               			break;
	                }
	                else{
	                	System.out.println("Enter valid type of item");
    	            	iType = Integer.parseInt(br.readLine());
	                }
                }

                System.out.println("-------------------------------------------------");
             	Item item = new Item(sName,iQuantity,fPrice,iType);
             	itemList.add(item);

                System.out.println("Do you want to enter details of any other item (y/n):");
                char choice = br.readLine().charAt(0);
                if(choice == 'n' || choice == 'N'){
                	break;
                }
            }
            
			Tax tax = new Tax();
			tax.calculateTax(itemList);          
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }    
}
