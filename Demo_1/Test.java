import java.util.*;

public class Test
{
  public static void display(int arr[], int size)
  {
    for (int i = 0; i < size; ++i)
    {
      System.out.print(arr[i] + " ");
    }
    System.out.println("");
  }
  
  public static void quickSort(int arr[], int left, int right)
  {
    int i = left;
    int j = right;
    int tmp;
    int pivot = arr[left + (right - left) / 2];
    
    while (i <= j)
    {
      while (arr[i] < pivot)
      {
        i++;
      }
      while (arr[j] > pivot)
      {
        j--;
      }
      if (i <= j)
      {
        tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        i++;
        j--;
      }
    }
    if (left < j)
    {
      quickSort(arr, left, j);
    }
    if (i < right)
    {
      quickSort(arr, i, right);
    }
  }
  
  public static void main(String[] args)
  {
    int size = 40;
    int max = 100;
    int[] array = new int[size];
    
    Random generator = new Random();
    
    for (int i = 0; i < size; i++)
    {
      array[i] = generator.nextInt(max) - max / 2;
    }
    
    System.out.println("Unsorted array: ");
    display(array, size);
    System.out.println("Sorting array...");
    quickSort(array, 0, size - 1);
    System.out.println("Sorted array: ");
    display(array, size);
  }
}
    