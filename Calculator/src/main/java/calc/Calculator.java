package calc;
enum OPERATION {
	ADD,
	SUBTRACT,
	MULTIPLY,
	DIVIDE
}
public class Calculator {
	public Calculator() {
	}
	public Double Add(Double i, Double j) {
		return i + j;
	}
	public Double Subtract(Double i, Double j) {
		return i - j;
	}
	public Double Multiply(Double i, Double j) {
		return i * j;
	}
	public Double Divide(Double i, Double j) {
		return i / j;
	}
	public Double Operation(Double i, Double j, OPERATION o) {
		switch(o) {
		case ADD: return(Add(i,j)); 
		case SUBTRACT: return(Subtract(i,j)); 
		case MULTIPLY: return(Multiply(i,j)); 
		case DIVIDE: return(Divide(i,j)); 
		default: return 0.0d;
		}
	}
}
