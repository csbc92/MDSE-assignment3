/*
* AUTO-GENERATED CODE!
*/

/*
* Imports
*/
import java.util.function.Function;

/*
* Class
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
		System.out.println("Basic arithmetics 1 " + computeBasicarithmetics1());
		System.out.println("Basic arithmetics 2 " + computeBasicarithmetics2());
		System.out.println("External functions " + computeExternalfunctions());
		System.out.println("Functional style 1 " + computeFunctionalstyle1());
		System.out.println("Functional style 2 " + computeFunctionalstyle2());
		System.out.println("Functional style 3 " + computeFunctionalstyle3());
		System.out.println("Functional style 4 " + computeFunctionalstyle4());
		System.out.println("Functional style 5 " + computeFunctionalstyle5());
		System.out.println("Functional style nested variable scope " + computeFunctionalstylenestedvariablescope());
		System.out.println("Functional style in-line " + computeFunctionalstyleinline());
		System.out.println("Functional style + external functions " + computeFunctionalstyleexternalfunctions());
	}
	
	/*
	* Result statements
	*/
	private int computeBasicarithmetics1() {
		return (((1)+(((6)/(3))*(5)))-(2));
	}
	private int computeBasicarithmetics2() {
		return ((((210)*(10))+(35))+((5)-((2)-(1))));
	}
	private int computeExternalfunctions() {
		return ((1)+((externals.power(((2)), ((3))))*(externals.sqrt(((9))))));
	}
	private int computeFunctionalstyle1() {
		return (new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer myVar) {
				return ((2)*(new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer x) {
						return ((x)+(1));
					}
				}.apply(((myVar)*(2)))));
			}
		}.apply(((1)+(2))));
	}
	private int computeFunctionalstyle2() {
		return (new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer myVar) {
				return ((3)*(new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer x) {
						return ((x)+(1));
					}
				}.apply(((myVar)*(2)))));
			}
		}.apply(((1)+(2))));
	}
	private int computeFunctionalstyle3() {
		return (new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return ((x)+(1));
			}
		}.apply((((2)*(5))+((4)/(2)))));
	}
	private int computeFunctionalstyle4() {
		return (new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer myVar) {
				return (new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer x) {
						return ((x)+(1));
					}
				}.apply(((myVar)*(2))));
			}
		}.apply(((2)+(2))));
	}
	private int computeFunctionalstyle5() {
		return ((new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer myVar) {
				return (new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer x) {
						return ((x)+(1));
					}
				}.apply(((myVar)*(2))));
			}
		}.apply(((3)+(2))))*(1));
	}
	private int computeFunctionalstylenestedvariablescope() {
		return (new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return (new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer x) {
						return ((x)+(1));
					}
				}.apply(((x)*(x))));
			}
		}.apply(((1)+(2))));
	}
	private int computeFunctionalstyleinline() {
		return (((1)+(((6)/(3))*(5)))-(new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer x) {
				return (x);
			}
		}.apply((1))));
	}
	private int computeFunctionalstyleexternalfunctions() {
		return ((new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer myVar) {
				return (new Function<Integer, Integer>() {
					@Override
					public Integer apply(Integer x) {
						return ((x)+((1)*(externals.sqrt(((4))))));
					}
				}.apply((((myVar)*(2))+(externals.power(((myVar)), ((2)))))));
			}
		}.apply(((3)+((2)*(externals.sqrt(((9))))))))*(2));
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
