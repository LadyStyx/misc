
public class ArraySequence implements MixinRequires{
	
	public int[] data;
	public int last = 0;
	
	public ArraySequence(int laenge){
		this.data = new int[laenge];
	}
	
	@Override
	public int length() {
		// return this.last
		return last;
	}

	@Override
	public void swap(int i, int j) {
//		var tmp = this.data[i];
//		this.data[i] = this.data[j];
//		this.data[j] = tmp;
		int tmp = data[i];
		data[i] = data[j];
		data[j] = tmp;
	}

	@Override
	public int get(int i) {
		// return (i < this.data.length) ? this.data[i] : undefined;
		return (i < data.length) ? data[i] : null;
		
	}
	
	public void add(int j){
		// this.data[this.last++] = j
		data[last++] = j;
		
	}
	

}
