import static java.util.Math.*;

// record points scored in each game
var pointsInGame1 = 6;
var pointsInGame2 = 8;
var pointsInGame3 = 8;

var averagePoints = round(
						  (pointsInGame1 + // find total points
						   pointsinGame2 + 
						   pointsInGame3) 
						   / 3.0           // average the total points
				    );  // round the average up to nearest whole number