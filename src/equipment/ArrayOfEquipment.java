package equipment;
import java.util.*;
public class ArrayOfEquipment {
	private ElectronicEquipment[] list = new ElectronicEquipment[100];
	private int n;
	public void input()
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of device : ");
		n=in.nextInt();
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter the device "+(i+1));
			System.out.println("1.TV\n2.Table Phone\n3.Cell phone");
			int choose = in.nextInt();
			if(choose == 1)
				list[i] = new TV();
			else if(choose == 3)
				list[i] = new CellPhone();
			else if (choose == 2)
				list[i] = new TablePhone();
			list[i].input();
		}
	}
	public void output()
	{
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println("Device "+(i+1));
			list[i].output();
		}
	}
	public static void main(String[] args) {
		ArrayOfEquipment list = new ArrayOfEquipment();
		list.input();
		list.output();
	}

}
