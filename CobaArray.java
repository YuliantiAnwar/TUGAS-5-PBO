import java.util.*;
 
class CobaArray{
  
  static void cetakArray(int o[]){
    System.out.println();
    for(int a = 0; a < o.length; a++)
      System.out.print(o[a] + "\t");
  }
 
  public static void main(String args[]){
    int p[] = {5,4,3,2,1};
    int q[] = {1,2,3,4,5}; 
	
	System.out.println("Array p : ");
	cetakArray(p);
	
	System.out.println("\n\nArray q :");
	cetakArray(q);
	
	System.out.println("\n\nmenggunakan fungsi sort() untuk mengurutkan data \narray p setelah diurut : ");
    Arrays.sort(p);
    cetakArray(p);
	
	
	System.out.print("\n\nmenggunakan fungsi equals() untuk membandingkan isi array p dan q \narray p dan q setelah dibandingkan maka : ");
    if(Arrays.equals(p,q))
      System.out.println("array sama");
    else
      System.out.println("array tidak sama");
  
	System.out.println("\n\nmenggunakan fungsi toString() untuk mengubah isi array menjadi string \narray p int diubah menjadi tipe string : ");
    String isi = Arrays.toString(p);
    System.out.println("\n" + isi);
  
	System.out.println("\n\nmenggunakan fungsi fill() untuk mengisi elemen array dengan sebuah nilai \narray p setelah diisi dengan sebuah nilai : ");
 
    Arrays.fill(p,7);
    cetakArray(p);
 
	System.out.println("\n\nmenggunakan fungsi binarySearch() untuk mencari data \nMencari angka 2 di array p ");
    System.out.println(Arrays.binarySearch(q,3));
  }
}
