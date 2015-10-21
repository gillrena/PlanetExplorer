package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:	
// Finish time:
public class PlanetExplorer {
	
	int x = 0;
	int y = 0;
	String facing = "";
	String obstacles = "";
	
	public PlanetExplorer(int x1, int y1, String facing1, String obstacles1){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		if(x1==0 && y1==0){
			facing = "N";
		}
		if(facing1=="" || facing1 == null){
			facing = "N";
		}
		x = x1;
		y = y1;
		facing = facing1;
		obstacles = obstacles1;
		
	}
	
	
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		String result = "";
		PlanetExplorer explorer =  new PlanetExplorer(x, y, facing, obstacles);
		
		if(command == "" || command == null){
			result = "(" + explorer.x + "," + explorer.y + "," + explorer.facing + ")" + explorer.obstacles;
			
		}else{
			for(int i=0; i< command.length(); i++){
				commandAction(command.charAt(i), explorer);
			}
			
			result = "(" + explorer.x + "," + explorer.y + "," + explorer.facing + ")" + explorer.obstacles;
		}
		
		return result;
	}
	
	public void commandAction(char commandChar, PlanetExplorer explorer){
		if(explorer.facing == "N" || explorer.facing == ""){ //Check the current facing of explorer
			if(commandChar == 'f'){
				explorer.y++;
			}
			if(commandChar == 'b'){
				explorer.y--;
			}
			if(commandChar == 'l'){
				explorer.facing = "W";
			}
			if(commandChar == 'r'){
				explorer.facing = "E";
			}
		}else if(explorer.facing == "E"){
			if(commandChar == 'f'){
				explorer.x++;
			}
			if(commandChar == 'b'){
				explorer.x--;
			}
			if(commandChar == 'l'){
				explorer.facing = "N";
			}
			if(commandChar == 'r'){
				explorer.facing = "S";
			}
		}else if(explorer.facing == "S"){
			if(commandChar == 'f'){
				explorer.y--;
			}
			if(commandChar == 'b'){
				explorer.y++;
			}
			if(commandChar == 'l'){
				explorer.facing = "E";
			}
			if(commandChar == 'r'){
				explorer.facing = "W";
			}
		}else if(explorer.facing == "W"){
			if(commandChar == 'f'){
				explorer.x--;
			}
			if(commandChar == 'b'){
				explorer.x++;
			}
			if(commandChar == 'l'){
				explorer.facing = "S";
			}
			if(commandChar == 'r'){
				explorer.facing = "N";
			}
		}
	}
}
