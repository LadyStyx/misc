


public class Mixin implements MixinProvides{

	private MixinRequires mixinRequires;
	
	public Mixin(MixinRequires req){
		this.mixinRequires = req;
	}
	
	@Override
	public void sort() {
		// this.bubblesort = function(){
//		for (var i = this.length() - 1; i >= 0; i-) {
//			for (var j = 0; j < i; j++) {
//			if (this.get(j) > this.get(j + 1)) {
//			this.swap(j, j+1);
		
		for(int i = mixinRequires.length() - 1; i >= 0; i--){
			for(int j = 0; j < i; j++){
				if(mixinRequires.get(j) > mixinRequires.get(j+1)){
					mixinRequires.swap(j, j+1);
				}
			}
		}
	}

	@Override
	public void print() {
		// var buf = ’[’;
//		for (var i = 0; i < this.length(); i++) {
//			buf += this.get(i).toString();
//			buf += ;
//			} return buf + "]";
//			};
		String buf = "[";
		for(int i = 0; i < mixinRequires.length(); i++){
			buf += mixinRequires.get(i);
			buf += " ";
		} 
		System.out.println(buf + "]");		
		
	}

	

}
