import java.util.Arrays;

public class ArrayListImplementation {
	private int size = 0;
	private Object[] myList;
	
	ArrayListImplementation(){
		this.myList = new Object[2];
	}
	
	
	public Object get(int index){
		if(index < size)
		{
			return myList[index];
		}
		else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	public void add(int value){
		if(size == myList.length){
			increaseCapacity();
		}
		myList[size++] = value;
	}
	
	private void increaseCapacity() {
		int newSize = myList.length * 2;
		myList = Arrays.copyOf(myList, newSize);
	}

	public void remove(int index){
		if (index<size){
			for(int i=index; i<size;i++){
				myList[index] = myList[index+1];
			}
			myList[size] = null;
			size--;
		}
		else
			throw new ArrayIndexOutOfBoundsException();

	}
	
	
	public static void main(String[] args){
		
		ArrayListImplementation m = new ArrayListImplementation();
		
		m.add(1);
		m.add(2);
		m.add(4);
		m.add(21);
		m.add(32);
		m.add(88);
		System.out.println("newLength "+ m.myList.length);
		for(int i=0; i<m.myList.length; i++)
			System.out.print(m.get(i)+ " ");
		System.out.println();
		m.remove(1);
		m.remove(0);
		for(int i=0; i<m.myList.length; i++)
			System.out.println(m.get(i));
		m.remove(3);
		for(int i=0; i<m.size; i++)
			System.out.println(m.get(i));
	}
	
}

