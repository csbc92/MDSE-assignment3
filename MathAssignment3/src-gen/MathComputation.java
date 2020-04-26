/*
* -- AUTO-GENERATED CODE --
* --   DO NOT MODIFY!    --
*/
public class MathComputation {
	
	/*
	* Fields
	*/
	private Externals externals;
	
	/*
	* Constructors
	*/
	public MathComputation(Externals externals) {
		this.externals = externals
	}
	
	/*
	* External functions
	*/
	public static interface Externals {
		public int power(int a, int b);
	}
	
	
	/*
	* Public methods
	*/
	public void compute() {
		// Call compute on each result-statement
		System.out.println("This is my calc 1 " + computeThisismycalc1());
		System.out.println("This_is 2nd calculation " + computeThis_is2ndcalculation());
		System.out.println("this is my 3rd calculation " + computeThisismy3rdcalculation());
	}
	
	/*
	* Result statements
	*/
	private int computeThisismycalc1() {
		return 11-2;
	}
	private int computeThis_is2ndcalculation() {
		return 2135+4;
	}
	private int computeThisismy3rdcalculation() {
		return externals.power((1), (2));
	}
	
	/*
	* Main methods
	*/
	public static void main(String[] args) {
		new MathComputation().compute();
	}
}
