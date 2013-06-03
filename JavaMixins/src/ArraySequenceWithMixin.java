
public class ArraySequenceWithMixin extends ArraySequence {

	private MixinProvides mixinProvides;
	
	public ArraySequenceWithMixin(int laenge){
		super(laenge);
		this.mixinProvides = new Mixin(this);
	}
	
	public void sort(){
		mixinProvides.sort();
	}
	
	public void print(){
		mixinProvides.print();
	}
}
