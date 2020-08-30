import java.util.Random;
public class Giithub 
{

	private int[] feld;
	public Giithub(int laenge) 
	{
		feld = new int[laenge];
	}

	public static void main(String[] args) 
	{
		Giithub t = new Giithub(10);
		String [] arr = new String[10];
		insertionsortString(arr);
		erzeugen(arr);
		ausgeben(arr);
		System.out.println("Unsortiert");
		t.erzeugen();
		t.ausgeben();
		t.selectionsort();
		System.out.println(""); 
		t.ausgeben();
			
	}
	
	static public void erzeugen(String [] arr)
	{
		arr[0] = "a";
		arr[1] = "h";
		arr[2] = "A";
		arr[3] = "B";
		arr[4] = "g";
		arr[5] = "c";
		arr[6] = "J";
		arr[7] = "u";
		arr[8] = "l";
		arr[9] = "N";
	}
	
	static public void ausgeben(String [] arr)
	{
		for (int i=0; i<arr.length; i++)
	    {  
	        System.out.print(arr[i]+"  ");
	    }
	    System.out.println();
	    System.out.println();
	}
	   public void erzeugen()
	   {
	     Random zufall = new Random();
	     for (int i=0; i<feld.length; i++)
	       feld[i] = zufall.nextInt(100)+1;
	     //  feld[i] = i+1;
	     //  feld[i] = feld.length-i;
	       
	   }
	   
	   /**
	    * Druckt die aktuelle Reihung auf der Konsole aus.
	    */     
	   public void ausgeben()
	   {       
	    for (int i=0; i<feld.length; i++)
	    {  
	        System.out.print(feld[i]+"  ");
	    }
	    System.out.println();
	    System.out.println();
	   }

	   /**
	    * Tauscht zwei Elemente. (wird in bubblesort() und selectionsort() verwendet)
	    */   
	   private void tauschen(int a, int b)
	   {
	       int temp = feld[a];
	       feld[a]=feld[b];
	       feld[b]=temp;
	    }
	    
	       /**
	    *Sucht das Minimum in der Reihung. (wird in selectionsort() verwendet)
	    */       
	   private int minipos(int ab)
	   {
	       int minIndex = ab;
	       for (int i = ab+1; i<feld.length; i++)
	       {
	            if (feld[i]<feld[minIndex])
	                minIndex=i;
	       }
	       return minIndex; 
	   }
	   
	   /**
	    * Sortiert eine Reihung mit dem Bubblesort-Verfahren. (mit Abbruchbedingung)
	    */   
	   public void bubblesort()
	   {
	       int j=feld.length-1;
	       boolean getauscht;
	       do
	       {
	           getauscht = false;
	           for (int i=0; i<=j-1; i++)
	           {
	                if (feld[i]>feld[i+1])
	                {
	                    tauschen(i,i+1);
	                    getauscht=true;
	                }
	            }
	            j=j-1;
	        }while (getauscht == true);        
	   }
	   
	   /**
	    * Sortiert eine Reihung mit dem Insertionsort-Verfahren.
	    */    
	   public void insertionsort()
	   {
	       for (int i = 1; i<feld.length; i++)
	       {
	          int temp = feld[i];
	          int j = i-1;
	          while (j>=0 && feld[j]>temp)
	          {
	              feld[j+1] = feld[j];
	              j--;
	          }
	          feld[j+1] = temp;
	        }
	    }
	   
	   static public void insertionsortString(String [] arr)
	   {
		   for (int i = 1; i<arr.length; i++)
	       {
	          String temp = arr[i];
	          int j = i-1;
	          while(arr[j].compareTo(temp)>0)
	          {
	              arr[j+1] = arr[j];
	              j--;
	          }
	          arr[j+1] = temp;
	        }
	   }
	    
	   /**
	    *Sortiert eine Reihung mit dem Selectionsort-Verfahren
	    */    
	   public void selectionsort()
	   {
	       for (int i = 0; i<feld.length-1; i++)
	       {
	           int min = minipos(i);
	           tauschen(i,min);
	        }
	    }
}
