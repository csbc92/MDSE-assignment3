/*
* AUTO-GENERATED CODE!
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
		this.externals = externals;
	}
	
	/*
	* External functions
	*/
	public static interface Externals {
		public int power(int a, int b);
		public int sqrt(int a);
	}
	
	
	/*
	* Public methods
	*/
	public void compute() {
		// Call compute on each result-statement
		System.out.println("This is my calc 1 " + computeThisismycalc1());
		System.out.println("This_is 2nd calculation " + computeThis_is2ndcalculation());
		System.out.println("this is my 3rd calculation " + computeThisismy3rdcalculation());
		System.out.println("First value " + computeFirstvalue());
		System.out.println("This is my calc 2 " + computeThisismycalc2());
		System.out.println("another calc " + computeAnothercalc());
		System.out.println("Second value " + computeSecondvalue());
		System.out.println("Third value " + computeThirdvalue());
		System.out.println("Third value2 " + computeThirdvalue2());
	}
	
	/*
	* Result statements
	*/
	private int computeThisismycalc1() {
		return (((1)+(((6)/(3))*(5)))-(2));
	}
	private int computeThis_is2ndcalculation() {
		return ((((210)*(10))+(35))+((5)-((2)-(1))));
	}
	private int computeThisismy3rdcalculation() {
		return ((1)+((externals.power(((2)), ((3))))*(externals.sqrt(((9))))));
	}
	private int computeFirstvalue() {
		return (new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return ((2)*(new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer t) {
						return ((t)+(1));
					}
				}.apply(((t)*(2)))));
			}
		}.apply(((1)+(2))));
	}
	private int computeThisismycalc2() {
		return (((1)+(((6)/(3))*(5)))-(new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return (t);
			}
		}.apply((1))));
	}
	private int computeAnothercalc() {
		return (new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return ((t)+(1));
			}
		}.apply((((2)*(5))+((4)/(2)))));
	}
	private int computeSecondvalue() {
		return (new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return (new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer t) {
						return ((t)+(1));
					}
				}.apply(((t)*(2))));
			}
		}.apply(((2)+(2))));
	}
	private int computeThirdvalue() {
		return ((new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return (new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer t) {
						return ((t)+(1));
					}
				}.apply(((t)*(2))));
			}
		}.apply(((3)+(2))))*(1));
	}
	private int computeThirdvalue2() {
		return ((new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer t) {
				return (new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer t) {
						return ((t)+((1)*(externals.sqrt(((4))))));
					}
				}.apply((((t)*(2))+(externals.power(((t)), ((2)))))));
			}
		}.apply(((3)+((2)*(externals.sqrt(((9))))))))*(1));
	}
	
	/*
	* Main methods
	*/
	public static void main(String[] args) {
		new MathComputation(new Externals() {
			@Override
			public int power(int a, int b) {
				// TODO: Implement method
				throw new UnsupportedOperationException();
			}
			public int sqrt(int a) {
				// TODO: Implement method
				throw new UnsupportedOperationException();
			}
		}).compute();
	}
}
