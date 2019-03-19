package interest;

public class Interest {
	//calculating simple interest 
public double simpleInterest(double p,double t,double r) {
	//p is principal, t is time, r is rate of interest
	double simple_interest=(p*t*r)/100;
	return simple_interest;
}
//calculating compound interest
public double compoundInterest(double p,double t,double r) {
	//p is principal, t is time, r is rate of interest
	double compound_interest=(p *(Math.pow((1 + r / 100), t)));
	return compound_interest;
}
}
