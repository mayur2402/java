import MyCollection.SinglyLinear;
import MyCollection.SinglyCircular;
import MyCollection.DoublyLinear;
import MyCollection.DoublyCircular;
import java.io.*;
import java.lang.*;

class LinkedList
{
	public static void main(String args[])
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int ch = 0;

			do
			{
				System.out.println("----------------------------------------");
				System.out.println("1.Singly Linear Linked List");
				System.out.println("2.Singly Circular Linked List");
				System.out.println("3.Doubly Linear Linked List");
				System.out.println("4.Doubly Circular Linked List");
				System.out.println("5.Exit");
				System.out.println("----------------------------------------");
				System.out.println("Enter your choice");
				ch = Integer.parseInt(br.readLine());

				switch(ch)
				{
					case 1:
					SinglyLinear SL = new SinglyLinear(0);
					int choice1 = 0;
					do
					{
						System.out.println("----------------------------------------");
						System.out.println("Singly Linear Linked List");
						System.out.println("----------------------------------------");
						System.out.println("1.Create");
						System.out.println("2.Display");
						System.out.println("3.Count");
						System.out.println("4.Insert First");
						System.out.println("5.Insert Last");
						System.out.println("6.Insert At Position");
						System.out.println("7.Delete First");
						System.out.println("8.Delete Last");
						System.out.println("9.Delete At Position");
						System.out.println("10.Search");
						System.out.println("11.Exit");
						System.out.println("----------------------------------------");
						System.out.println("Enter your choice");
						choice1 = Integer.parseInt(br.readLine());
						System.out.println("----------------------------------------");

						switch(choice1)
						{
						case 1:
	
							System.out.println("How many Numbers");
							int iNo = Integer.parseInt(br.readLine());			
							for(int i = 0;i < iNo;i++)
							{
								System.out.println("Enter "+(i+1)+" Number");
								int iN = Integer.parseInt(br.readLine());
								SL.Create(iN);
							}
						break;
	
						case 2:

							SL.Display();
	
						break;
	
						case 3:

							int size = SL.Count();
							System.out.println("Size of SinglyLinear is "+size);

						break;

						case 4:

							System.out.println("Enter Number to insert at First position");
							int iN = Integer.parseInt(br.readLine());
	
							SL.InsertFirst(iN);
	
						break;
	
						case 5:
	
							System.out.println("Enter Number to insert at Last position");
							iN = Integer.parseInt(br.readLine());

							SL.InsertLast(iN);
	
						break;

						case 6:
	
							System.out.println("Enter position where you want to insert");
							int iPos = Integer.parseInt(br.readLine());
							System.out.println("Enter Number to insert at "+iPos+" position");
							iN = Integer.parseInt(br.readLine());
	
							SL.InsertAtPos(iN,iPos);

						break;

						case 7:
	
							SL.DeleteHead();
	
						break;
	
						case 8:
		
							SL.DeleteLast();
	
						break;

						case 9:

							System.out.println("Enter position where you want to delete");
							iPos = Integer.parseInt(br.readLine());
							SL.DeleteAtPos(iPos);

						break;

						case 10:

							System.out.println("Enter Number to search");
							iN = Integer.parseInt(br.readLine());
	
							boolean isFind = SL.Search(iN);

							if(isFind)
							{
								System.out.println("number found ");
							}
							else
							{
								System.out.println("number not found ");
							}
	
						break;

						default :
							System.out.println("Error : Invalid choice");
							break;
						}
					}while(choice1 != 11);

					break;

					case 2:
					SinglyCircular SC = new SinglyCircular(0);
					int choice2 = 0;
					do
					{
						System.out.println("----------------------------------------");
						System.out.println("Singly Circular Linked List");
						System.out.println("----------------------------------------");
						System.out.println("1.Create");
						System.out.println("2.Display");
						System.out.println("3.Count");
						System.out.println("4.Insert First");
						System.out.println("5.Insert Last");
						System.out.println("6.Insert At Position");
						System.out.println("7.Delete First");
						System.out.println("8.Delete Last");
						System.out.println("9.Delete At Position");
						System.out.println("10.Search");
						System.out.println("11.Exit");
						System.out.println("----------------------------------------");
						System.out.println("Enter your choice");
						choice2 = Integer.parseInt(br.readLine());
						System.out.println("----------------------------------------");

						switch(choice2)
						{
						case 1:
	
							System.out.println("How many Numbers");
							int iNo =
Integer.parseInt(br.readLine());			
							for(int i = 0;i < iNo;i++)
							{
								System.out.println("Enter "+(i+1)+" Number");
								int iN = Integer.parseInt(br.readLine());
								SC.Create(iN);
							}
						break;
	
						case 2:

							SC.Display();
	
						break;
	
						case 3:

							int size = SC.Count();
							System.out.println("Size of SinglyLinear is "+size);

						break;

						case 4:

							System.out.println("Enter Number to insert at First position");
							int iN = Integer.parseInt(br.readLine());
	
							SC.InsertFirst(iN);
	
						break;
	
						case 5:
	
							System.out.println("Enter Number to insert at Last position");
							iN = Integer.parseInt(br.readLine());

							SC.InsertLast(iN);
	
						break;

						case 6:
	
							System.out.println("Enter position where you want to insert");
							int iPos = Integer.parseInt(br.readLine());
							System.out.println("Enter Number to insert at "+iPos+" position");
							iN = Integer.parseInt(br.readLine());
	
							SC.InsertAtPos(iN,iPos);

						break;

						case 7:
	
							SC.DeleteHead();
	
						break;
	
						case 8:
		
							SC.DeleteLast();
	
						break;

						case 9:

							System.out.println("Enter position where you want to delete");
							iPos = Integer.parseInt(br.readLine());
							SC.DeleteAtPos(iPos);

						break;

						case 10:

							System.out.println("Enter Number to search");
							iN = Integer.parseInt(br.readLine());
	
							boolean isFind = SC.Search(iN);

							if(isFind)
							{
								System.out.println("number found ");
							}
							else
							{
								System.out.println("number not found ");
							}
	
						break;

						default :
							System.out.println("Error : Invalid choice");
							break;
						}
					}while(choice2 != 11);

					break;

					case 3:
					DoublyLinear DL = new DoublyLinear(0);
					int choice3 = 0;
					do
					{
						System.out.println("----------------------------------------");
						System.out.println("Doubly Linear Linked List");
						System.out.println("----------------------------------------");
						System.out.println("1.Create");
						System.out.println("2.Display");
						System.out.println("3.Count");
						System.out.println("4.Insert First");
						System.out.println("5.Insert Last");
						System.out.println("6.Insert At Position");
						System.out.println("7.Delete First");
						System.out.println("8.Delete Last");
						System.out.println("9.Delete At Position");
						System.out.println("10.Search");
						System.out.println("11.Exit");
						System.out.println("----------------------------------------");
						System.out.println("Enter your choice");
						choice3 = Integer.parseInt(br.readLine());
						System.out.println("----------------------------------------");

						switch(choice3)
						{
						case 1:
	
							System.out.println("How many Numbers");
							int iNo =
Integer.parseInt(br.readLine());			
							for(int i = 0;i < iNo;i++)
							{
								System.out.println("Enter "+(i+1)+" Number");
								int iN = Integer.parseInt(br.readLine());
								DL.Create(iN);
							}
						break;
	
						case 2:

							DL.Display();
	
						break;
	
						case 3:

							int size = DL.Count();
							System.out.println("Size of SinglyLinear is "+size);

						break;

						case 4:

							System.out.println("Enter Number to insert at First position");
							int iN = Integer.parseInt(br.readLine());
	
							DL.InsertFirst(iN);
	
						break;
	
						case 5:
	
							System.out.println("Enter Number to insert at Last position");
							iN = Integer.parseInt(br.readLine());

							DL.InsertLast(iN);
	
						break;

						case 6:
	
							System.out.println("Enter position where you want to insert");
							int iPos = Integer.parseInt(br.readLine());
							System.out.println("Enter Number to insert at "+iPos+" position");
							iN = Integer.parseInt(br.readLine());
	
							DL.InsertAtPos(iN,iPos);

						break;

						case 7:
	
							DL.DeleteHead();
	
						break;
	
						case 8:
		
							DL.DeleteLast();
	
						break;

						case 9:

							System.out.println("Enter position where you want to delete");
							iPos = Integer.parseInt(br.readLine());
							DL.DeleteAtPos(iPos);

						break;

						case 10:

							System.out.println("Enter Number to search");
							iN = Integer.parseInt(br.readLine());
	
							boolean isFind = DL.Search(iN);

							if(isFind)
							{
								System.out.println("number found ");
							}
							else
							{
								System.out.println("number not found ");
							}
	
						break;

						default :
							System.out.println("Error : Invalid choice");
							break;
						}
					}while(choice3 != 11);

					break;

					case 4:
					DoublyCircular DC = new DoublyCircular(0);
					int choice4 = 0;
					do
					{
						System.out.println("----------------------------------------");
						System.out.println("Doubly Circular Linked List");
						System.out.println("----------------------------------------");
						System.out.println("1.Create");
						System.out.println("2.Display");
						System.out.println("3.Count");
						System.out.println("4.Insert First");
						System.out.println("5.Insert Last");
						System.out.println("6.Insert At Position");
						System.out.println("7.Delete First");
						System.out.println("8.Delete Last");
						System.out.println("9.Delete At Position");
						System.out.println("10.Search");
						System.out.println("11.Exit");
						System.out.println("----------------------------------------");
						System.out.println("Enter your choice");
						choice4 = Integer.parseInt(br.readLine());
						System.out.println("----------------------------------------");

						switch(choice4)
						{
						case 1:
	
							System.out.println("How many Numbers");
							int iNo =
Integer.parseInt(br.readLine());			
							for(int i = 0;i < iNo;i++)
							{
								System.out.println("Enter "+(i+1)+" Number");
								int iN = Integer.parseInt(br.readLine());
								DC.Create(iN);
							}
						break;
	
						case 2:

							DC.Display();
	
						break;
	
						case 3:

							int size = DC.Count();
							System.out.println("Size of SinglyLinear is "+size);

						break;

						case 4:

							System.out.println("Enter Number to insert at First position");
							int iN = Integer.parseInt(br.readLine());
	
							DC.InsertFirst(iN);
	
						break;
	
						case 5:
	
							System.out.println("Enter Number to insert at Last position");
							iN = Integer.parseInt(br.readLine());

							DC.InsertLast(iN);
	
						break;

						case 6:
	
							System.out.println("Enter position where you want to insert");
							int iPos = Integer.parseInt(br.readLine());
							System.out.println("Enter Number to insert at "+iPos+" position");
							iN = Integer.parseInt(br.readLine());
	
							DC.InsertAtPos(iN,iPos);

						break;

						case 7:
	
							DC.DeleteHead();
	
						break;
	
						case 8:
		
							DC.DeleteLast();
	
						break;

						case 9:

							System.out.println("Enter position where you want to delete");
							iPos = Integer.parseInt(br.readLine());
							DC.DeleteAtPos(iPos);

						break;

						case 10:

							System.out.println("Enter Number to search");
							iN = Integer.parseInt(br.readLine());
	
							boolean isFind = DC.Search(iN);

							if(isFind)
							{
								System.out.println("number found ");
							}
							else
							{
								System.out.println("number not found ");
							}
	
						break;

						default :
							System.out.println("Error : Invalid choice");
							break;
						}
					}while(choice4 != 11);

					break;

					case 5:
						System.exit(0);
					break;

					default :
						System.out.println("Error : Invalid Choice");
					break;
				}
			}while(ch != 5);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
