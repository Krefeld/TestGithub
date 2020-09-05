import java.util.Random;

public class Giithub {

	public Giithub() 
	{
		
	}

	public static void main(String[] args) 
	{
		int length = 10;
		int field[] = new int [length];
		int field1[] = new int[length];
		int field2[] = new int[length];
		
		String arr [] = new String[length];
		String arr1 [] = new String[length];
		String arr2 [] = new String[length];
		
		//Int
		
		Giithub t = new Giithub();
		erzeugen(field, 50);
		kopieren(field, field1, field2);
		ausgeben(field);
		
		System.out.println();
		System.out.println("Bubblesort");
		Bubblesort(field);
		ausgeben(field);
		
		System.out.println();
		System.out.println("insertionsort");
		insertionsort(field1);
		ausgeben(field1);
		
		System.out.println();
		System.out.println("selectionsort");
		selectionsort(field2);
		ausgeben(field2);
		
		System.out.println();
		System.out.println("String");
		System.out.println();
		
		//String
		erzeugen(5,arr);
		kopieren(arr, arr1, arr2);
		ausgeben(arr);
		
		System.out.println();
		System.out.println("Bubblesort");
		Bubblesort(arr);
		ausgeben(arr);
		
		System.out.println();
		System.out.println("insertionsort");
		insertionsort(arr1);
		ausgeben(arr1);
		
		System.out.println();
		System.out.println("selectionsort");
		selectionsort(arr2);
		ausgeben(arr2);
		
		
	}
	
	static public void kopieren(int[] feld, int[] feld1, int[] feld2)
	{
		for(int i = 0; i < feld.length; ++i)
		{
			feld1[i] = feld[i];
		}
		
		for(int i = 0; i < feld.length; ++i)
		{
			feld2[i] = feld[i];
		}
	}
	
	static public void erzeugen(int[] feld, int max)
	{
		Random r = new Random();
		for(int i = 0; i < feld.length;++i)
		{
			feld[i] = r.nextInt(max)+1;
		}
	}
	
	static public void ausgeben(int[] feld)
	{
		for(int i = 0; i < feld.length;++i)
		{
			System.out.print(feld[i] + " ");
		}
		System.out.println();
	}
	
	static boolean getauscht; 
	static public void Bubblesort(int[] feld)
	{
		int j = feld.length-1;
		do
		{
			getauscht = false; 
			for(int i = 0; i <= j-1; ++i)
			{
				if(feld[i] > feld[i+1])
				{
					swap(feld,i,i+1);
					getauscht = true;
				}
			}
			j -= 1;
		}while(getauscht == true);
	}
	
	public static void swap(int[] feld1, int a, int b)
	{
		int temp = feld1[a];
		feld1[a] = feld1[b];
		feld1[b] = temp;
	}
	
	static public void insertionsort(int[] feld)
	{
		for(int i = 1; i < feld.length;++i)
		{
			int temp = feld[i];
			int j = i-1;
			while(j>=0 && feld[j] > temp)
			{
				feld[j+1] = feld[j];
				--j;
			}
			feld[j+1] = temp;
		}
	}
	
	public static void selectionsort(int[] feld) 
	{
		for(int i = 0; i < feld.length-1; ++i)
		{
			int min = minipos(feld,i);
			swap(feld,i,min);
		}
	}
	
	public static int minipos(int[] feld,int ab)
	{
		int minIndex = ab;
	       for (int i = ab+1; i<feld.length; i++)
	       {
	            if (feld[i]<feld[minIndex])
	                minIndex=i;
	       }
	       return minIndex; 
	}
	
	
	
	//String Methoden
	
	static String allowedChars ="0123456789abcdefghijklmnopqrstuvwxyz";
	 
	 private static String generateRandomString(String allowedChars, Random random, int laenge)
	    {
	        int max = allowedChars.length();
	        StringBuffer buffer = new StringBuffer();
	        for (int i=0; i<laenge; i++)
	        {
	            int value = random.nextInt(max);
	            buffer.append(allowedChars.charAt(value));
	        }
	        return buffer.toString();
	    } 
	 
	static public void erzeugen(int stringlaenge,String[] arr)
	{
		Random random = new Random();
	     for (int i=0; i<arr.length; i++)
	     {
	       arr[i] = generateRandomString(allowedChars, random, stringlaenge);
	    }
	}
	
	static public void kopieren(String[] arr, String[] arr1, String[] arr2)
	{
		for(int i = 0; i < arr.length; ++i)
		{
			arr1[i] = arr[i];
		}
		
		for(int i = 0; i < arr.length; ++i)
		{
			arr2[i] = arr[i];
		}
	}
	
	static public void ausgeben(String[] arr)
	{
		for(int i = 0; i < arr.length;++i)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	static boolean getauscht1; 
	static public void Bubblesort(String[] arr)
	{
		int j = arr.length-1;
		do
		{
			getauscht1 = false; 
			for(int i = 0; i <= j-1; ++i)
			{
				if(arr[i].compareTo(arr[i+1]) > 0 ) 
				{
					swap(arr,i,i+1);
					getauscht1 = true;
				}
			}
			j -= 1;
		}while(getauscht1 == true);
	}
	
	public static void swap(String[] arr, int a, int b)
	{
		String temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	static public void insertionsort(String[] arr)
	{
		for(int i = 1; i < arr.length;++i)
		{
			String temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j].compareTo(temp) > 0) 
			{
				arr[j+1] = arr[j];
				--j;
			}
			arr[j+1] = temp;
		}
	}
	
	public static void selectionsort(String[] arr) 
	{
		for(int i = 0; i < arr.length-1; ++i)
		{
			int min = minipos(arr,i);
			swap(arr,i,min);
		}
	}
	
	public static int minipos(String[] arr,int ab)
	{
		int minIndex = ab;
	       for (int i = ab+1; i<arr.length; i++)
	       {
	            if (arr[i].compareTo(arr[minIndex]) < 0) 
	                minIndex=i;
	       }
	       return minIndex; 
	}
	
	
	
	
}