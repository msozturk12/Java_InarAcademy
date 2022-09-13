package chapters.chapter04;

public class Exercise03 {

	public static void main(String[] args) {

		double charlotteX = 35.2270869 ;
		double charlotteY = -80.8431267 ;
		double atlantaX= 33.7489954 ;
		double atlantaY= -84.3879824 ;
		double savannahX= 32.0835407 ;
		double savannahY= -81.0998342 ;
		double orlandoX= 28.5383355 ;
		double orlandoY= -81.3792365 ;
		
	    double radius = 6371.01;
	    
	    double distanceCharlotte_Atlanta =radius * Math.acos(Math.sin(Math.toRadians(charlotteX)) * Math.sin(Math.toRadians(atlantaX)) 
	    		+ Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(charlotteY - atlantaY)));
		
	    double distanceCharlotte_Savannah =radius  * Math.acos(Math.sin(Math.toRadians(charlotteX)) * Math.sin(Math.toRadians(savannahX)) 
	    		+ Math.cos(Math.toRadians(charlotteX)) * Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(charlotteY - savannahY))); 		
	    
	    double distanceSavannah_Orlando = radius *  Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(orlandoX)) 
	    		+ Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(savannahY - orlandoY)));
	    
	    double distanceOrlando_Atlanta = radius * Math.acos(Math.sin(Math.toRadians(orlandoX)) * Math.sin(Math.toRadians(atlantaX)) 
	    		+ Math.cos(Math.toRadians(orlandoX)) * Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(orlandoY - atlantaY)));
	    
	    double distanceSavannah_Atlanta = radius *  Math.acos(Math.sin(Math.toRadians(savannahX)) * Math.sin(Math.toRadians(atlantaX)) 
	    		+ Math.cos(Math.toRadians(savannahX)) * Math.cos(Math.toRadians(atlantaX)) * Math.cos(Math.toRadians(savannahY - atlantaY)));
	    
	    double side1 = (distanceCharlotte_Atlanta + distanceCharlotte_Savannah + distanceSavannah_Atlanta) / 2 ;
	    double area1 = Math.sqrt(side1 * (side1 -distanceCharlotte_Atlanta ) * (side1 - distanceCharlotte_Savannah) * (side1 - distanceSavannah_Atlanta ));
	    
	    double side2 = (distanceOrlando_Atlanta + distanceSavannah_Orlando + distanceSavannah_Atlanta) / 2 ;
	    double area2 = Math.sqrt(side2 * (side2 - distanceOrlando_Atlanta ) * (side2 - distanceSavannah_Orlando) * (side2 - distanceSavannah_Atlanta ));
	    
	    
	    System.out.println("Estimated area enclosed by Charlotte - Atlanta - Savannah - Orlando is : " + (area1 + area2));
	    
	    
	}

}
//   double distanceBetweenToPoints = radius * Math.acos((Math.sin(pointx1) * Math.sin(pointx2))
//		+ (Math.cos(pointx1) * Math.cos(pointx2) * Math.cos(pointy1 - pointy2)));


//double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
//double side2 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
//double side3 = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);

//double s = (side1 + side2 + side3) / 2;
//double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);










