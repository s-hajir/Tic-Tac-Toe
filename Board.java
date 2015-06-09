public class Board{
	String [] oberZeile = new String [3];
	String [] mittelZeile = new String [3];
	String [] unterZeile = new String [3];

	 public Board(){
		 
	 }
	 public void setMark(String mark, int x, int y)throws Exception {
		 
		 if(x>2 || y>2 || x<0 || y<0){
			 throw new Exception("Ungültige Eingabe, X und/oder Y zu grösser als 2 oder kleiner als 0 ");
		 }
		 //oberste Zeile des Spielfeldes
		 if(x == 0){
				 if(y==0 && oberZeile[0]==null){        //falls diese Zeile ausgewählt wurde und sie leer ist, wird 'mark' dort übergeben
					 oberZeile[0] = mark;             //ansonsten Exception werfen
					 
				 }else if (y==1 && oberZeile[1]==null) {
					 oberZeile[1] = mark;
					
				}else if (y==2 && oberZeile[2]==null) {
					oberZeile[2] = mark;
					
				}else{
					throw new Exception("Ungültige Eingabe, Feld bereits belegt ");
				}
		//mittlere Zeile des Spielfeldes
		 }else if (x==1) {
			 if(y==0 && mittelZeile[0]==null){
				 mittelZeile[0] = mark;
				 
			 }else if (y==1 && mittelZeile[1]==null) {
				 mittelZeile[1] = mark;
				
			}else if (y==2 && mittelZeile[2]==null) {
				mittelZeile[2] = mark;
				
			}else{
				throw new Exception("Ungültige Eingabe, Feld bereits belegt ");
			}
		//unterste Zeile des Spielfeldes
		}else if (x==2) {
			if(y==0 && unterZeile[0]==null){
				 unterZeile[0] = mark;
				 
			 }else if (y==1 && unterZeile[1]==null) {
				 unterZeile[1] = mark;
				
			}else if (y==2 && unterZeile[2]==null) {
				unterZeile[2] = mark;
				
			}else{
				throw new Exception("Ungültige Eingabe, Feld bereits belegt ");
			}
		
		}
		 
		 
	 }
	 public boolean hasWinner() {
		 //Zeilenweise X
		if(oberZeile[0]=="X"&&oberZeile[1]=="X"&&oberZeile[2]=="X" || mittelZeile[0]=="X"&&mittelZeile[1]=="X"&&mittelZeile[2]=="X" || unterZeile[0]=="X"&&unterZeile[1]=="X"&&unterZeile[2]=="X"){
			return true;
		
		}else if(oberZeile[0]=="X"&&mittelZeile[0]=="X"&&unterZeile[0]=="X" || oberZeile[1]=="X"&&mittelZeile[1]=="X"&&unterZeile[1]=="X" || oberZeile[2]=="X"&&mittelZeile[2]=="X"&&unterZeile[2]=="X"){
			return true;  //Reihenweise X
			
		}else if (oberZeile[0]=="X" && mittelZeile[1]=="X"&&unterZeile[2]=="X" || oberZeile[2]=="X" && mittelZeile[1]=="X"&&unterZeile[0]=="X") {
			return true;  //Diagonal X
			
		}else if(oberZeile[0]=="O"&&oberZeile[1]=="O"&&oberZeile[2]=="O" || mittelZeile[0]=="O"&&mittelZeile[1]=="O"&&mittelZeile[2]=="O" || unterZeile[0]=="O"&&unterZeile[1]=="O"&&unterZeile[2]=="O"){
			return true;  //Zeilenweise O
		
		}else if(oberZeile[0]=="O"&&mittelZeile[0]=="O"&&unterZeile[0]=="O" || oberZeile[1]=="O"&&mittelZeile[1]=="O"&&unterZeile[1]=="O" || oberZeile[2]=="O"&&mittelZeile[2]=="O"&&unterZeile[2]=="O"){
			return true;  //Reihenweise O
			
		}else if (oberZeile[0]=="O" && mittelZeile[1]=="O"&&unterZeile[2]=="O" || oberZeile[2]=="O" && mittelZeile[1]=="O"&&unterZeile[0]=="O") {
			return true;  //Diagonal O
			
		}else{
			return false;
		}
		
		 
	 }
} 