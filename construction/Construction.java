package construction;

public class Construction {
	
public double constructionCost(String standard,double area,boolean automated){
	
	double cost=0.0;
	
	if(standard.equalsIgnoreCase("standard")) { //for standard materials
		
		cost=area*1200;
	}
	
	else if(standard.equalsIgnoreCase("above standard")) {//for above standard materials
		
		cost=area*1500;
	}
	
	else if(standard.equalsIgnoreCase("high standard")&& automated==false) {//for high standard materials
		
		cost=area*1800;
	}
	
	else if(standard.equalsIgnoreCase("high standard") && automated==true) {//for high standard materials and fully automated home
		
		cost=area*2500;
	}
	
	return cost;
}
	
}
